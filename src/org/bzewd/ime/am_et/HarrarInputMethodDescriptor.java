package org.bzewd.ime.am_et; /**
 * @(#)HarrarInputMethodDescriptor.java	0.001
 * 
 */


import java.awt.Image;
import java.awt.im.spi.InputMethodDescriptor;
import java.awt.im.spi.InputMethod;
import java.util.Locale;

/*
 */
public class HarrarInputMethodDescriptor implements InputMethodDescriptor {
    
    public HarrarInputMethodDescriptor() {
    }

    /**
     * This input method can be used by any locale.  
     */
    public Locale[] getAvailableLocales() {
        Locale[] locales = {
            new Locale("","",""),
        };
        return locales;
    }
    
    /**
     * @see java.awt.im.spi.InputMethodDescriptor#hasDynamicLocaleList
     */
    public boolean hasDynamicLocaleList() {
        return false;
    }
    
    /**
     * @see java.awt.im.spi.InputMethodDescriptor#getInputMethodDisplayName
     */
    public synchronized String getInputMethodDisplayName(Locale inputLocale, Locale displayLanguage) {
        return "Ethiopic Generic Input Method - 0.001 Harrar";
    }
    
    /**
     * @see java.awt.im.spi.InputMethodDescriptor#getInputMethodIcon
     */
    public Image getInputMethodIcon(Locale inputLocale) {
        return null;
    }
    
    /**
     * @see java.awt.im.spi.InputMethodDescriptor#getInputMethodClassName
     */
    public String getInputMethodClassName() {
        return "HarrarInputMethod";
    }

    /**
     * Creates a new instance of the Ethiopic input method.
     * 
     * @return a new instance of the Ethiopic input method
     * @exception Exception any exception that may occur while creating the
     * input method instance
     */
    public InputMethod createInputMethod() throws Exception {
        return new HarrarInputMethod();
    }
}
