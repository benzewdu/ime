/**
 * @(#)HarrarInputMethod
 * Input Method for Ethiopic - Java
 *
 */


package org.bzewd.ime.am_et;

import java.awt.*;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyEvent;
import java.awt.font.TextAttribute;
import java.awt.font.TextHitInfo;
import java.awt.im.InputMethodHighlight;
import java.awt.im.spi.InputMethod;
import java.awt.im.spi.InputMethodContext;
import java.io.IOException;
import java.text.AttributedString;
import java.util.Locale;

import org.bzewd.ime.am_et.data.Fidel;
import org.bzewd.ime.am_et.utils.*;


public class HarrarInputMethod implements InputMethod {

    private InputMethodContext context;

     private Locale locale = new Locale("am", "ET");

    private StringBuffer buffer;

    private AttributedString as = null;

    private boolean inCompositionMode = true;

    public HarrarInputMethod() throws IOException {
         buffer = new StringBuffer(10);
     }

    public void setInputMethodContext(InputMethodContext context) {
         this.context = context;
     }

    /*
     * The Ethiopic Input Method supports all locales.
     */
    public boolean setLocale(Locale locale) {
         this.locale = locale;
        return true;
    }

    public Locale getLocale() {
         return locale;
    }

    public void setCharacterSubsets(Character.Subset[] subsets) {
    }

    /**
     * This is the input method's main routine.  The composed text is stored
     * in buffer.  If buffer is empty, we are in pass through mode.
     */
    public void dispatchEvent(AWTEvent event) {

        int len = buffer.length();

        if (event.getID() == KeyEvent.KEY_PRESSED) {

            KeyEvent e = (KeyEvent) event;

            int eventKeyCode = e.getKeyCode();
            //System.out.println("e: " + e.getSource());

            // If we are not in composition mode, pass through (nothing in buffer)
            if ((buffer.length() == 0) || (!inCompositionMode)) {
                return;
            }

            // case here one types "s" then VK_UP, it commits the "s" and lets AWT handle the VK_UP
            if (buffer.length() > 0) {
                if ((eventKeyCode == KeyEvent.VK_LEFT)
                        || (eventKeyCode == KeyEvent.VK_UP)
                        || (eventKeyCode == KeyEvent.VK_DOWN)
                        || (eventKeyCode == KeyEvent.VK_RIGHT)
                        || (eventKeyCode == KeyEvent.VK_DELETE)
                        || (eventKeyCode == KeyEvent.VK_PAGE_UP)
                        || (eventKeyCode == KeyEvent.VK_PAGE_DOWN)
                        || (eventKeyCode == KeyEvent.VK_ENTER)
                        || (eventKeyCode == KeyEvent.VK_HOME)
                        || (eventKeyCode == KeyEvent.VK_BACK_SPACE)
                        || (eventKeyCode == KeyEvent.VK_END)) {

                    sendCommittedText(e, buffer, Flags.DONT_CONSUME_EVENT, Flags.LOOKUP);

                    return;
                }
                //else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE ) {
                //buffer.deleteCharAt(buffer.length() - 1);
                //sendComposedText(e);
                //return;
                //}
            }

        } else if (event.getID() == KeyEvent.KEY_TYPED) {

            KeyEvent e = (KeyEvent) event;

            char c = e.getKeyChar();
            char nullChar = '\uffff';
            char lkp = '\uffff';
            char prev_char = '\uffff';

            // if Lookup fails, output `\u0000`
            if (buffer.length() > 0) {
                 if ((lkp = Fidel.lookup(buffer.toString() + c)) == nullChar) { //should prbbly go with append/delete than +
                     if (c == Flags.COMMIT_KEY) {
                        this.sendCommittedText(e, buffer, Flags.CONSUME_EVENT, Flags.LOOKUP);
                        return;
                    } else if ((Fidel.lookup(buffer.toString()) == '\u0000') || (Fidel.lookup(c) == nullChar)) {
                         this.sendCommittedText(e, buffer, Flags.DONT_CONSUME_EVENT, Flags.LOOKUP);
                        return;
                    } else {
                        this.sendCommittedText(e, buffer, Flags.CONSUME_EVENT, Flags.LOOKUP);
                     }
                } else {

                    if (Fidel.isTerminalLookup(buffer.append(c)))
                        this.sendCommittedText(e, buffer, Flags.CONSUME_EVENT, Flags.LOOKUP);
                    else
                        this.sendComposedText(e, buffer, Flags.LOOKUP);

                    return;
                }
            }
            if (buffer.length() == 0) {
                 if (Fidel.lookup(c) != nullChar) {
                     if (Fidel.isTerminalLookup(buffer.append(c)))
                        this.sendCommittedText(e, buffer, Flags.CONSUME_EVENT, Flags.LOOKUP);
                    else
                        this.sendComposedText(e, buffer, Flags.LOOKUP);

                    return;
                } else {
                     //this.sendCommittedText(e, buffer, Flags.DCONSUME_EVENT, Flags.DONT_LOOKUP);
                    return; //unknown or not in ds
                }
            }
        }
    }

    /**
     * Send the composed text to the client.
     */

     private void sendComposedText(KeyEvent e, StringBuffer buffer, boolean lookupFlag) { // why are we sending KeyEvent here? why not 'buffer'


        if (lookupFlag)
            as = LookupAndGetAttStr(buffer);
        else
            as = GetAttStr(buffer);

        as.addAttribute(
                TextAttribute.INPUT_METHOD_HIGHLIGHT,
                InputMethodHighlight.SELECTED_RAW_TEXT_HIGHLIGHT
        );
        context.dispatchInputMethodEvent(
                InputMethodEvent.INPUT_METHOD_TEXT_CHANGED,
                as.getIterator(), 0,
                TextHitInfo.trailing(0), null
        );
        e.consume();

     }


    /**
     * Send the committed text to the client.
     */
    private void sendCommittedText(KeyEvent e, StringBuffer bf, boolean consumeFlag, boolean lookupFlag) {

        int charCount = 1;

        if (lookupFlag)
            as = LookupAndGetAttStr(bf);
        else
            as = GetAttStr(bf);

        context.dispatchInputMethodEvent(
                InputMethodEvent.INPUT_METHOD_TEXT_CHANGED,
                as.getIterator(), charCount, // committed CharacterCount = 1 because you can only generate 1 at a time!
                TextHitInfo.trailing(0), null
        );

        this.buffer.setLength(0); //reset buffer

        if (consumeFlag)
            e.consume();

     }

    // to improve, and work on encapsulation
    private void ResetBuffer() {
        this.buffer.setLength(0);
    }

    private AttributedString LookupAndGetAttStr(StringBuffer buf) {
        return new AttributedString(String.valueOf(Fidel.lookup(buf.toString())));
    }

    private AttributedString GetAttStr(StringBuffer buf) {
        return new AttributedString(buf.toString());
    }

    public void activate() {
    }

    public void deactivate(boolean isTemporary) {
    }

    public void hideWindows() {
    }

    public void removeNotify() {
    }

    public void endComposition() {
    }

    public void dispose() {
    }

    public void notifyClientWindowChange(Rectangle location) {
    }

    public Object getControlObject() {
        return null;
    }

    public void reconvert() {
        // not supported yet
        throw new UnsupportedOperationException();
    }

    public void setCompositionEnabled(boolean enable) {
        // not supported yet
        throw new UnsupportedOperationException();
    }

    public boolean isCompositionEnabled() {
        // always enabled
        return true;
    }
}
