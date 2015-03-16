package org.bzewd.ime.am_et.data;

import java.util.Hashtable;
import java.util.Vector;

public class Fidel {


    final static String STF_uu = "\u0023";
    final static String STF_ud = "\u00f1";
    final static String STF_il = "\u00da";
    final static String STF_ir = "\u00f2";
    final static String STF_El = "\u00dd";
    final static String STF_Er = "\u00f4";
    final static String STF_We = "\u00f8";
    final static String STF_Wal = "\u00f0";
    final static String STF_War = "\u00fb";
    final static String STF_WEl = "\u00f7";
    final static String STF_WEr = "\u00fc";
    final static String STF_W = "\u00fa";
    final static String STF_B = "\u00bf";
    final static String STF_o = "\u00f6";
    final static String STF_x = "\u00f3";
    final static String STF_WNew = "\u00bb";

    final static String SET0 = null;
    final static String SETD = null;
    final static String NOCH = null; // or ""

    final static String TFanusFidel[][] =
            {
/* he */  {"\u00c0", NOCH, SET0}, {"\u00c0", STF_uu, SET0}, {"\u0040", STF_il, SET0}, {"\u0040", NOCH, SET0}, {"\u0040", STF_El, SET0}, {"\u0041", NOCH, SET0}, {"\u0042", NOCH, SET0}, {NOCH, NOCH, NOCH},
/* le */  {"\u00c1", NOCH, SET0}, {"\u00c1", STF_uu, SET0}, {"\u00c1", STF_ir, SET0}, {"\u0043", NOCH, SET0}, {"\u00c1", STF_Er, SET0}, {"\u0044", NOCH, SET0}, {"\u00c1", STF_We, SET0}, {"\u0043", STF_War, SET0},
/* He */  {"\u00c2", NOCH, SET0}, {"\u00c2", STF_uu, SET0}, {"\u00c2", STF_ir, SET0}, {"\u0045", NOCH, SET0}, {"\u00c2", STF_Er, SET0}, {"\u0046", NOCH, SET0}, {"\u0047", NOCH, SET0}, {"\u0045", STF_War, SET0},
/* me */  {"\u00c3", NOCH, SET0}, {"\u00c3", STF_uu, SET0}, {"\u0048", STF_ir, SET0}, {"\u0048", NOCH, SET0}, {"\u0048", STF_Er, SET0}, {"\u0049", NOCH, SET0}, {"\u004a", NOCH, SET0}, {"\u0048", STF_Wal, SET0},
/*`se */  {"\u00c4", NOCH, SET0}, {"\u00c4", STF_uu, SET0}, {"\u00c4", STF_ir, SET0}, {"\u004b", NOCH, SET0}, {"\u004b", STF_Er, SET0}, {"\u004c", NOCH, SET0}, {"\u004d", NOCH, SET0}, {"\u004b", STF_Wal, SET0},
/* re */  {"\u00c5", NOCH, SET0}, {"\u004e", NOCH, SET0}, {"\u004f", NOCH, SET0}, {"\u0050", NOCH, SET0}, {"\u0051", NOCH, SET0}, {"\u0052", NOCH, SET0}, {"\u0053", NOCH, SET0}, {"\u0050", STF_B, SET0},
/* se */  {"\u00c6", NOCH, SET0}, {"\u00c6", STF_uu, SET0}, {"\u00c6", STF_ir, SET0}, {"\u0054", NOCH, SET0}, {"\u00c6", STF_Er, SET0}, {"\u0055", NOCH, SET0}, {"\u0056", NOCH, SET0}, {"\u0054", STF_War, SET0},
/* xe */  {"\u00c7", NOCH, SET0}, {"\u00c7", STF_uu, SET0}, {"\u00c7", STF_ir, SET0}, {"\u0057", NOCH, SET0}, {"\u0062", STF_Er, SET0}, {"\u0058", NOCH, SET0}, {"\u0059", NOCH, SET0}, {"\u0057", STF_War, SET0},
/* qe */  {"\u00c8", NOCH, SET0}, {"\u00c8", STF_uu, SET0}, {"\u00c8", STF_il, SET0}, {"\u005a", NOCH, SET0}, {"\u00c8", STF_El, SET0}, {"\u005b", NOCH, SET0}, {"\\u005c", NOCH, SET0}, {NOCH, NOCH, SET0},
/* qWe */ {"\u00c8", STF_We, SET0}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {"\u00c8", STF_Wal, SET0}, {"\u00c8", STF_WEl, SET0}, {NOCH, NOCH, NOCH}, {"\u00c8", STF_W, SET0}, {NOCH, NOCH, NOCH},
/* Qe */  {"\u00c9", NOCH, SET0}, {"\u00c9", STF_uu, SET0}, {"\u00c9", STF_il, SET0}, {"\u005d", NOCH, SET0}, {"\u00c9", STF_El, SET0}, {"\u005e", NOCH, SET0}, {"\u005f", NOCH, SET0}, {NOCH, NOCH, SETD},
/* QWe */ {"\u00c9", STF_We, SET0}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {"\u00c9", STF_Wal, SET0}, {"\u00c9", STF_WEl, SET0}, {NOCH, NOCH, NOCH}, {"\u00c9", STF_W, SET0}, {NOCH, NOCH, NOCH},
/* be */  {"\u00ca", NOCH, SET0}, {"\u00ca", STF_uu, SET0}, {"\u00ca", STF_ir, SET0}, {"\u0060", NOCH, SET0}, {"\u00ca", STF_Er, SET0}, {"\u0061", NOCH, SET0}, {"\u0062", NOCH, SET0}, {"\u0060", STF_War, SET0},
/* ve */  {"\u00cb", NOCH, SET0}, {"\u00cb", STF_uu, SET0}, {"\u00cb", STF_ir, SET0}, {"\u0063", NOCH, SET0}, {"\u00cb", STF_Er, SET0}, {"\u0064", NOCH, SET0}, {"\u0065", NOCH, SET0}, {"\u0063", STF_War, SET0},
/* te */  {"\u00cc", NOCH, SET0}, {"\u00cc", STF_uu, SET0}, {"\u00cc", STF_il, SET0}, {"\u0066", NOCH, SET0}, {"\u00cc", STF_El, SET0}, {"\u0067", NOCH, SET0}, {"\u0068", NOCH, SET0}, {"\u00cc", STF_Wal, SET0},
/* ce */  {"\u00cd", NOCH, SET0}, {"\u00cd", STF_uu, SET0}, {"\u00cd", STF_il, SET0}, {"\u0069", NOCH, SET0}, {"\u00cd", STF_El, SET0}, {"\u006a", NOCH, SET0}, {"\u006b", NOCH, SET0}, {"\u00cd", STF_Wal, SET0},
/*`he */  {"\u00ce", NOCH, SET0}, {"\u00ce", STF_uu, SET0}, {"\u00ce", STF_ir, SET0}, {"\u006c", NOCH, SET0}, {"\u00ce", STF_El, SET0}, {"\u006d", NOCH, SET0}, {"\u006e", NOCH, SET0}, {NOCH, NOCH, SETD},
/* hWE */ {"\u00ce", STF_We, SET0}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {"\u006f", NOCH, SET0}, {"\u00ce", STF_WEr, SET0}, {"\u00ce", STF_W, SET0}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH},
/* ne */  {"\u00cf", NOCH, SET0}, {"\u00cf", STF_uu, SET0}, {"\u00cf", STF_ir, SET0}, {"\u0070", NOCH, SET0}, {"\u00cf", STF_Er, SET0}, {"\u0071", NOCH, SET0}, {"\u0072", NOCH, SET0}, {"\u0070", STF_Wal, SET0},
/* Ne */  {"\u00d0", NOCH, SET0}, {"\u00d0", STF_uu, SET0}, {"\u00d0", STF_il, SET0}, {"\u0073", NOCH, SET0}, {"\u00d0", STF_El, SET0}, {"\u0074", NOCH, SET0}, {"\u0075", NOCH, SET0}, {"\u0073", STF_Wal, SET0},
/* e  */  {"\u00d1", NOCH, SET0}, {"\u00d1", STF_uu, SET0}, {"\u00d1", STF_ir, SET0}, {"\u0076", NOCH, SET0}, {"\u00d1", STF_Er, SET0}, {"\u0077", NOCH, SET0}, {"\u0078", NOCH, SET0}, {"\u00d1", STF_B, SET0},
/* ke */  {"\u00d2", NOCH, SET0}, {"\u00d2", STF_uu, SET0}, {"\u00d2", STF_ir, SET0}, {"\u0079", NOCH, SET0}, {"\u00d2", STF_Er, SET0}, {"\u007a", NOCH, SET0}, {"\u007b", NOCH, SET0}, {NOCH, NOCH, SETD},
/* kWe */ {"\u00d2", STF_We, SET0}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {"\u0079", STF_War, SET0}, {"\u0079", STF_WEr, SET0}, {"\u00d2", STF_W, SET0}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH},
/* Ke */  {"\u00d3", NOCH, SET0}, {"\u00d3", STF_uu, SET0}, {"\u00d3", STF_ir, SET0}, {"\u007c", NOCH, SET0}, {"\u00d3", STF_Er, SET0}, {"\u007d", NOCH, SET0}, {"\u007e", NOCH, SET0}, {NOCH, NOCH, SETD},
/* KWe */ {"\u00d3", STF_We, SET0}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {"\u007c", STF_War, SET0}, {"\u007c", STF_WEr, SET0}, {NOCH, STF_W, SET0}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH},
/* we */  {"\u00d4", NOCH, SET0}, {"\u00d4", STF_ud, SET0}, {"\u00f5", STF_il, SET0}, {"\u00f5", NOCH, SET0}, {"\u00f5", STF_El, SET0}, {"\u0080", NOCH, SET0}, {"\u0081", NOCH, SET0}, {NOCH, NOCH, NOCH},
/* `e */  {"\u00d5", NOCH, SET0}, {"\u00d5", STF_uu, SET0}, {"\u0082", STF_ir, SET0}, {"\u0082", NOCH, SET0}, {"\u0082", STF_El, SET0}, {"\u0083", NOCH, SET0}, {"\u0084", NOCH, SET0}, {NOCH, NOCH, NOCH},
/* ze */  {"\u00d6", NOCH, SET0}, {"\u00d6", STF_uu, SET0}, {"\u00d6", STF_ir, SET0}, {"\u0085", NOCH, SET0}, {"\u00d6", STF_Er, SET0}, {"\u0086", NOCH, SET0}, {"\u0087", NOCH, SET0}, {"\u0085", STF_War, SET0},
/* Ze */  {"\u00d7", NOCH, SET0}, {"\u00d7", STF_uu, SET0}, {"\u00d7", STF_il, SET0}, {"\u0088", NOCH, SET0}, {"\u00d7", STF_El, SET0}, {"\u0089", NOCH, SET0}, {"\u008a", NOCH, SET0}, {"\u0088", STF_Wal, SET0},
/* ye */  {"\u00d8", NOCH, SET0}, {"\u00d8", NOCH, SET0}, {"\u008b", NOCH, SET0}, {"\u008c", NOCH, SET0}, {"\u00d8", NOCH, SET0}, {"\u008d", NOCH, SET0}, {"\u008e", NOCH, SET0}, {NOCH, NOCH, NOCH},
/* de */  {"\u00d9", NOCH, SET0}, {"\u00d9", NOCH, SET0}, {"\u00d9", STF_il, SET0}, {"\u008f", NOCH, SET0}, {"\u00d9", STF_Er, SET0}, {"\u0090", NOCH, SET0}, {"\u0091", NOCH, SET0}, {"\u00e6", STF_War, SET0},
/* De */  {"\u00d9", NOCH, SET0}, {"\u00d9", NOCH, SET0}, {"\u00d9", STF_il, SET0}, {"\u008f", NOCH, SET0}, {"\u00d9", STF_Er, SET0}, {"\u0090", NOCH, SET0}, {"\u0091", NOCH, SET0}, {"\u00e6", STF_War, SET0},
/* je */  {"\u00db", NOCH, SET0}, {"\u00cc", NOCH, SET0}, {"\u00cb", STF_ir, SET0}, {"\u0092", NOCH, SET0}, {"\u00ce", NOCH, SET0}, {"\u0093", NOCH, SET0}, {"\u0094", NOCH, SET0}, {"\u00ce", STF_War, SET0},
/* ge */  {"\u00dc", NOCH, SET0}, {"\u00dc", STF_uu, SET0}, {"\u00dc", STF_ir, SET0}, {"\u0095", NOCH, SET0}, {"\u00dc", STF_Er, SET0}, {"\u0096", NOCH, SET0}, {"\u0097", NOCH, SET0}, {NOCH, NOCH, SETD},
/* gWe */ {"\u00dc", STF_We, SET0}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {"\u0098", NOCH, SET0}, {"\u00d1", STF_WEr, SET0}, {"\u00d1", STF_W, SET0}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH},
/* Ge */  {"\u00dc", NOCH, SET0}, {"\u00dc", STF_uu, SET0}, {"\u00dc", STF_ir, SET0}, {"\u0095", NOCH, SET0}, {"\u00dc", STF_Er, SET0}, {"\u0096", NOCH, SET0}, {"\u0097", NOCH, SET0}, {NOCH, NOCH, NOCH},
/* Te */  {"\u00de", NOCH, SET0}, {"\u00de", STF_uu, SET0}, {"\u00de", STF_ir, SET0}, {"\u0099", NOCH, SET0}, {"\u00de", STF_Er, SET0}, {"\u009a", NOCH, SET0}, {"\u009b", NOCH, SET0}, {"\u0099", STF_War, SET0},
/* Ce */  {"\u00df", NOCH, SET0}, {"\u009c", NOCH, SET0}, {"\u009d", NOCH, SET0}, {"\u009e", NOCH, SET0}, {"\u009f", NOCH, SET0}, {"\u00bc", NOCH, SET0}, {"\u00bd", NOCH, SET0}, {"\u00be", NOCH, SET0},
/* Pe */  {"\u00e0", NOCH, SET0}, {"\u00e0", NOCH, SET0}, {"\u00e0", STF_ir, SET0}, {"\u00e8", NOCH, SET0}, {"\u00e0", STF_Er, SET0}, {"\u00e9", NOCH, SET0}, {"\u00ea", NOCH, SET0}, {"\u00e8", STF_War, SET0},
/* Se */  {"\u00e1", NOCH, SET0}, {"\u00e1", NOCH, SET0}, {"\u00e1", STF_ir, SET0}, {"\u00eb", NOCH, SET0}, {"\u00e1", STF_Er, SET0}, {"\u00ec", NOCH, SET0}, {"\u00ed", NOCH, SET0}, {"\u00e8", STF_War, SET0},
/*`Se */  {"\u00e2", NOCH, SET0}, {"\u00e2", STF_uu, SET0}, {"\u00ee", STF_ir, SET0}, {"\u00ee", NOCH, SET0}, {"\u00ee", STF_El, SET0}, {"\u00ef", NOCH, SET0}, {"\u00fd", NOCH, SET0}, {NOCH, NOCH, NOCH},
/* fe */  {"\u00e3", NOCH, SET0}, {"\u00fe", NOCH, SET0}, {"\u00ff", NOCH, SET0}, {"\u0026", NOCH, SET0}, {"\u003a", NOCH, SET0}, {"\u003b", NOCH, SET0}, {"\u003c", NOCH, SET0}, {NOCH, NOCH, NOCH},
/* pe */  {"\u00e4", NOCH, SET0}, {"\u00e4", STF_uu, SET0}, {"\u00e4", STF_il, SET0}, {"\u00e5", NOCH, SET0}, {"\u00e4", STF_El, SET0}, {"\u00e6", NOCH, SET0}, {"\u00e7", NOCH, SET0}, {NOCH, NOCH, NOCH},
                    {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH},

                    {NOCH, NOCH, NOCH}, {"\u00b5", NOCH, SET0}, {"\u00b8", NOCH, SET0}, {"\u00b9", NOCH, SET0}, {"\u00b7", NOCH, SET0}, {NOCH, NOCH, NOCH}, {"\u00b6", NOCH, SET0}, {"\u00ba", NOCH, SET0}, {NOCH, NOCH, NOCH},


                    {"\u00a1", NOCH, SET0}, {"\u00a2", NOCH, SET0}, {"\u00a3", NOCH, SET0}, {"\u00a4", NOCH, SET0}, {"\u00a5", NOCH, SET0}, {"\u00a6", NOCH, SET0}, {"\u00a7", NOCH, SET0}, {"\u00a8", NOCH, SET0}, {"\u00a9", NOCH, SET0}, {"\u00aa", NOCH, SET0},
                    {"\u00ab", NOCH, SET0}, {"\u00ac", NOCH, SET0}, {"\u00ad", NOCH, SET0}, {"\u00ae", NOCH, SET0}, {"\u00af", NOCH, SET0}, {"\u00b0", NOCH, SET0}, {"\u00b1", NOCH, SET0}, {"\u00b2", NOCH, SET0}, {"\u00b3", NOCH, SET0}, {"\u00b4", NOCH, SET0},
                    {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH},


                    {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH},
                    {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH},
                    {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH},
                    {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH},
                    {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH},
                    {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH},
                    {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH},
                    {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH},


                    {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {STF_War, NOCH, SET0}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH},
                    {NOCH, NOCH, NOCH}, {"\u0021", NOCH, SET0}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {NOCH, NOCH, NOCH}, {"\u003f", NOCH, SET0}
            };


    public static String FidelName[] =
            {
                    "he", "hu", "hi", "ha", "hE", "h", "ho", "\uffff",
                    "le", "lu", "li", "la", "lE", "l", "lo", "lWa",
                    "He", "Hu", "Hi", "Ha", "HE", "H", "Ho", "HWa",
                    "me", "mu", "mi", "ma", "mE", "m", "mo", "mWa",
                    "`se", "`su", "`si", "`sa", "`sE", "`s", "`so", "`sWa",
                    "re", "ru", "ri", "ra", "rE", "r", "ro", "rWa",
                    "se", "su", "si", "sa", "sE", "s", "so", "sWa",
                    "xe", "xu", "xi", "xa", "xE", "x", "xo", "xWa",
                    "qe", "qu", "qi", "qa", "qE", "q", "qo", "\uffff",
                    "qWe", "qWu", "qWi", "qWa", "qWE", "qW", "\uffff", "\uffff",
                    "Qe", "Qu", "Qi", "Qa", "QE", "Q", "Qo", "\uffff",
                    "QWe", "QWu", "QWi", "QWa", "QWE", "QW", "\uffff", "\uffff",
                    "be", "bu", "bi", "ba", "bE", "b", "bo", "bWa",
                    "ve", "vu", "vi", "va", "vE", "v", "vo", "vWa",
                    "te", "tu", "ti", "ta", "tE", "t", "to", "tWa",
                    "ce", "cu", "ci", "ca", "cE", "c", "co", "cWa",
                    "`he", "`hu", "`hi", "`ha", "`hE", "`h", "`ho", "\uffff",
                    "hWe", "hWu", "hWi", "hWa", "hWE", "hW", "\uffff", "\uffff",
                    "ne", "nu", "ni", "na", "nE", "n", "no", "nWa",
                    "Ne", "Nu", "Ni", "Na", "NE", "N", "No", "NWa",
                    "e", "u", "i", "a", "E", "I", "o", "ea",
                    "ke", "ku", "ki", "ka", "kE", "k", "ko", "\uffff",
                    "kWe", "kWu", "kWi", "kWa", "kWE", "kW", "\uffff", "\uffff",
                    "Ke", "Ku", "Ki", "Ka", "KE", "K", "Ko", "\uffff",
                    "KWe", "KWu", "KWi", "KWa", "KWE", "KW", "\uffff", "\uffff",
                    "we", "wu", "wi", "wa", "wE", "w", "wo", "\uffff",
                    "`e", "`u", "`i", "`a", "`E", "`I", "`o", "\uffff",
                    "ze", "zu", "zi", "za", "zE", "z", "zo", "zWa",
                    "Ze", "Zu", "Zi", "Za", "ZE", "Z", "Zo", "ZWa",
                    "ye", "yu", "yi", "ya", "yE", "y", "yo", "yWa",
                    "de", "du", "di", "da", "dE", "d", "do", "dWa",
                    "De", "Du", "Di", "Da", "DE", "D", "Do", "DWa",
                    "je", "ju", "ji", "ja", "jE", "j", "jo", "jWa",
                    "ge", "gu", "gi", "ga", "gE", "g", "go", "\uffff",
                    "gWe", "gWu", "gWi", "gWa", "gWE", "gW", "\uffff", "\uffff",
                    "Ge", "Gu", "Gi", "Ga", "GE", "G", "Go", "GWa",
                    "Te", "Tu", "Ti", "Ta", "TE", "T", "To", "TWa",
                    "Ce", "Cu", "Ci", "Ca", "CE", "C", "Co", "CWa",
                    "Pe", "Pu", "Pi", "Pa", "PE", "P", "Po", "PWa",
                    "Se", "Su", "Si", "Sa", "SE", "S", "So", "SWa",
                    "`Se", "`Su", "`Si", "`Sa", "`SE", "`S", "`So", "\uffff",
                    "fe", "fu", "fi", "fa", "fE", "f", "fo", "fWa",
                    "pe", "pu", "pi", "pa", "pE", "p", "po", "pWa",
                    "mYa", "rYa", "fYa", "\uffff", "\uffff", "\uffff", "\uffff", "\uffff",

                    "\" \"", ":", "::", ",", ";", "-:", ":-", "`?", ":|:",
                    "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                    "20", "30", "40", "50", "60", "70", "80", "90", "100", "10000",
                    "\uffff", "\uffff", "\uffff",

                    "`qe", "`qu", "`qi", "`qa", "`qE", "`q", "`qo", "\uffff",
                    "mWe", "bWe", "GWe", "fWe", "pWe", "\uffff", "\uffff", "\uffff",
                    "`ke", "`ku", "`ki", "`ka", "`kE", "`k", "`ko", "\uffff",
                    "mWi", "bWi", "GWi", "fWi", "pWi", "\uffff", "\uffff", "\uffff",
                    "Xe", "Xu", "Xi", "Xa", "XE", "X", "Xo", "\uffff",
                    "mWE", "bWE", "GWE", "fWE", "pWE", "\uffff", "\uffff", "\uffff",
                    "`ge", "`gu", "`gi", "`ga", "`gE", "`g", "`go", "\uffff",
                    "mW", "bW", "GW", "fW", "pW", "\uffff", "\uffff", "\uffff"
                    //"`le", "`lu", "`li", "`la", "`lE", "`l", "`lo", "\uffff",
                    //"`me", "`mu", "`mi", "`ma", "`mE", "`m", "`mo", "\uffff",
                    //"`re", "`ru", "`ri", "`ra", "`rE", "`r", "`ro", "\uffff",
                    //"`ne", "`nu", "`ni", "`na", "`nE", "`n", "`no", "\uffff"
            };

    public static String EthioSoft_FidelName[] = {
            "He", "hu", "hi", "ha", "hv", "h", "ho", "\uffff",
            "le", "lu", "li", "la", "lv", "l", "lo", "lA",
            "He", "Hu", "Hi", "Ha", "Hv", "H", "Ho", "HA",
            "me", "mu", "mi", "ma", "mv", "m", "mo", "mA",
            "We", "Wu", "Wi", "Wa", "Wv", "W", "Wo", "WA",
            "re", "ru", "ri", "ra", "rv", "r", "ro", "rA",
            "se", "su", "si", "sa", "sv", "s", "so", "sA",
            "Se", "Su", "Si", "Sa", "Sv", "S", "So", "SA",
            "qe", "qu", "qi", "qa", "qv", "q", "qo", "\uffff",
            "qWe", "qWu", "qWi", "qWa", "qWE", "qW", "\uffff", "\uffff",
            "Qe", "Qu", "Qi", "Qa", "QE", "Q", "Qo", "\uffff",
            "QWe", "QWu", "QWi", "QWa", "QWE", "QW", "\uffff", "\uffff",
            "be", "bu", "bi", "ba", "bv", "b", "bo", "bA",
            "Ve", "Vu", "Vi", "Va", "Vv", "V", "Vo", "vA",
            "te", "tu", "ti", "ta", "tv", "t", "to", "tA",
            "Ce", "Cu", "Ci", "Ca", "Cv", "C", "Co", "cA",
            "Ue", "Uu", "Ui", "Ua", "Uv", "U", "Uo", "UA",
            "hWe", "hWu", "hWi", "hWa", "hWE", "hW", "\uffff", "\uffff",
            "ne ", "nu", "ni", "na", "nv", "n", "no", "nA",
            "Ne", "Nu", "Ni", "Na", "Nv", "N", "No", "NA",
            "Ee", "Eu", "Ei", "Ea", "Ev", "E", "Eo", "EA",
            "ke", "ku", "ki", "ka", "kv", "k", "ko", "\uffff",
            "kWe", "kWu", "kWi", "kWa", "kWE", "kW", "\uffff", "\uffff",
            "Ke", "Ku", "Ki", "Ka", "KE", "K", "Ko", "\uffff",
            "KWe", "KWu", "KWi", "KWa", "KWE", "KW", "\uffff", "\uffff",
            "we", "wu", "wi", "wa", "wv", "w", "wo", "\uffff",
            "[e", "[u", "[i", "[a", "[v", "[", "[o", "\uffff",
            "ze", "zu", "zi", "za", "zv", "z", "zo", "zA",
            "Ze", "Zu", "Zi", "Za", "Zv", "Z", "Zo", "ZA",
            "ye", "yu", "yi", "ya", "yv", "y", "yo", "yA",
            "de", "du", "di", "da", "dv", "d", "do", "dA",
            "De", "Du", "Di", "Da", "DE", "D", "Do", "DWa",
            "je", "ju", "ji", "ja", "jv", "j", "jo", "jA",
            "ge", "gu", "gi", "ga", "gv", "g", "go", "\uffff",
            "gWe", "gWu", "gWi", "gWa", "gWE", "gW", "\uffff", "\uffff",
            "Ge", "Gu", "Gi", "Ga", "GE", "G", "Go", "GWa",
            "Te", "Tu", "Ti", "Ta", "Tv", "T", "To", "TA",
            "ce", "cu", "ci", "ca", "cv", "c", "co", "CA",
            "Pe", "Pu", "Pi", "Pa", "Pv", "P", "Po", "PA",
            "xe", "xu", "xi", "xa", "xv", "x", "xo", "SA",
            "Xe", "Xu", "Xi", "Xa", "Xv", "X", "Xo", "\uffff",
            "fe", "fu", "fi", "fa", "fv", "f", "fo", "fA",
            "pe", "pu", "pi", "pa", "pv", "p", "po", "pA",
            "mYa", "rYa", "fYa", "\uffff", "\uffff", "\uffff", "\uffff", "\uffff",

            "\" \"", ":", "::", ",", ";", "-:", ":-", "`?", ":|:",
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "20", "30", "40", "50", "60", "70", "80", "90", "100", "10000", "\uffff", "\uffff", "\uffff",

            "`qe", "`qu", "`qi", "`qa", "`qE", "`q", "`qo", "\uffff",
            "mWe", "bWe", "GWe", "fWe", "pWe", "\uffff", "\uffff", "\uffff",
            "`ke", "`ku", "`ki", "`ka", "`kE", "`k", "`ko", "\uffff",
            "mWi", "bWi", "GWi", "fWi", "pWi", "\uffff", "\uffff", "\uffff",
            "Xe", "Xu", "Xi", "Xa", "XE", "X", "Xo", "\uffff",
            "mWE", "bWE", "GWE", "fWE", "pWE", "\uffff", "\uffff", "\uffff",
            "`ge", "`gu", "`gi", "`ga", "`gE", "`g", "`go", "\uffff",
            "mW", "bW", "GW", "fW", "pW", "\uffff", "\uffff", "\uffff"
            //"`le", "`lu", "`li", "`la", "`lE", "`l", "`lo", "\uffff",
            //"`me", "`mu", "`mi", "`ma", "`mE", "`m", "`mo", "\uffff",
            //"`re", "`ru", "`ri", "`ra", "`rE", "`r", "`ro", "\uffff",
            //"`ne", "`nu", "`ni", "`na", "`nE", "`n", "`no", "\uffff"
    };

    //public static Hashtable fh = new Hashtable();
    public char c = '\u1200';
    public static String nullChar = String.valueOf('\uffff');
    // public String fidel = null;
    public static Vector fidelVec = new Vector();

    static {
        new Fidel();
    }

    public Fidel() {
        long t0 = System.currentTimeMillis();
        String[] fidelTable = Fidel.FidelName;
        //String[] fidelTable = Fidel.EthioSoft_FidelName;

        //Hashtable fidelHash = Fidel.fh;
        FidelAttributes fidelAttr = null;

        // init hashtables ** temporary **
        for (int h = 0; h < 8; h++)
            fidelVec.add(h, new Hashtable());

        for (int i = 0; i < fidelTable.length; i++) {

            String fid = fidelTable[i];
                
            /*
            String fid = null;
            if (TFanusFidel[i][0] == Fidel.NOCH) {
                fid = "\u0000";
            }
            else
            if (TFanusFidel[i][1] == Fidel.NOCH) {
                System.out.println(TFanusFidel[i][1] + " " + i + " It's NOCH a'ight!");
                fid = TFanusFidel[i][0];
            }
            else {
                System.out.println(TFanusFidel[i][0] + " " + i);
                fid = TFanusFidel[i][0] + TFanusFidel[i][1];
            }
             */
            int l = fid.length();
            Hashtable hColumn = (Hashtable) fidelVec.get(l - 1);
            //if (fidelVec.size() < l)
            //    for (int t = 0; t < l; t++) { }     ** Optimal code for allocation of Hashtables
            FidelAttributes fa = (FidelAttributes) hColumn.get((Object) fid);
            if (fa == null) {
                hColumn.put((Object) fid, new FidelAttributes(true, (char) (c + i), 1));
            } else {
                fa.setUnicodeValue((char) (c + i));
                // assertion
                //if (fa.getisTerminal() != false) System.out.println(fid  + " :  There's something wrong here");
            }
            //checking block
            for (int j = 1; j < fid.length(); j++) {
                String f = fid.substring(0, j);
                Hashtable h = (Hashtable) fidelVec.get(f.length() - 1);
                if ((fidelAttr = (FidelAttributes) h.get((Object) f)) == null) {
                    h.put(f, new FidelAttributes(false, '\u0000' /*could or could not be null*/, l));
                } else {
                    fidelAttr.setisTerminal(false);
                    if (l > fidelAttr.getmaxTermIndex())
                        fidelAttr.setmaxTermIndex(l);
                }
            }
        }
        //System.out.println(System.currentTimeMillis() - t0);
    }

    public static void main(String[] args) {

        Fidel seraFidel = new Fidel();

        for (int j = 1; j <= seraFidel.fidelVec.size(); j++) {
            Hashtable h = (Hashtable) (seraFidel.fidelVec.get(j - 1));
            for (int i = 0; i < Fidel.FidelName.length; i++) {
                if (Fidel.FidelName[i].length() == j) {
                    FidelAttributes fat = (FidelAttributes) (h.get(Fidel.FidelName[i]));
                    //System.out.println("Index: " + j + " " + Integer.toHexString( (int)fat.getUnicodeValue() ) + " is " + fat.getisTerminal() + " with " + fat.getmaxTermIndex());
                }
            }
        }
        //System.out.println(seraFidel.SERA2UTF8("ale"));
        //System.out.println(Integer.toHexString(((FidelAttributes)(((Hashtable)seraFidel.fidelVec.get(4)).get((Object)"10000"))).getUnicodeValue())) ;
    }

    public String SERA2UTF8(String inSera) {
        String tmp, curr = "", result = "";
        FidelAttributes fa = null;
        if (inSera != null) {
            for (int i = 0; i < inSera.length(); i++) {
                curr += String.valueOf(inSera.charAt(i));
                if ((fa = (FidelAttributes) ((Hashtable) Fidel.fidelVec.get(curr.length() - 1)).get(curr)) != null) {
                    if (fa.getisTerminal()) {
                        curr = "";
                        result += "\\u" + Integer.toHexString(fa.getUnicodeValue());
                    }
                } else {
                    if (curr.length() > 1) {
                        fa = (FidelAttributes) ((Hashtable) Fidel.fidelVec.get(curr.length() - 2)).get(curr.substring(0, curr.length() - 1));
                        if (fa != null) {
                            curr = "";
                            result += "\\u" + Integer.toHexString(fa.getUnicodeValue());
                        } else {
                            //System.out.println("ALERT A MALIBU - SOMETHIN' WRONG");
                        }
                        i--; //go back one == pushbackstream
                    } else {
                        curr = "";
                        result += String.valueOf(inSera.charAt(i));
                    }
                }
            }
        }
        return result;
    }


    public static char lookup(char c) throws NullPointerException {
        return lookup(String.valueOf(c)); //should try catch'ing this...
    }

    public static char lookup(String str) throws NullPointerException, ArrayIndexOutOfBoundsException {
        FidelAttributes fa = null;

        if (str.length() > Fidel.fidelVec.size())
            throw new ArrayIndexOutOfBoundsException("String too long!");

        if (str != null) {
            if ((fa = (FidelAttributes) ((Hashtable) Fidel.fidelVec.get(str.length() - 1)).get((Object) str)) != null)
                return fa.getUnicodeValue(); // shouldn't be null, but try catch'ing it
            else
                return '\uffff'; // => not found!
        } else {
            throw new NullPointerException("No data in string");
            //return '\uffff'; //what else?   should throw an Exception!
        }
    }

    public static boolean isTerminalLookup(StringBuffer buffer) throws NullPointerException {
        String str = buffer.toString();
        FidelAttributes fa = null;
        if (str != null) {
            if ((fa = (FidelAttributes) ((Hashtable) Fidel.fidelVec.get(str.length() - 1)).get((Object) str)) != null)
                return fa.getisTerminal(); // shouldn't be null, but try catch'ing it
            else
                throw new NullPointerException("Failed lookup, System Err"); // => not found!
        } else {
            throw new NullPointerException("No data in string");
        }
    }


    public static Long lArabToEthiopic(long number) {
        return Long.getLong(Fidel.szArabToEthiopic(number));
    }

    public static String szArabToEthiopic(long number) {
        int i = 0, j = 0, m = 0, n = 0;
        int One = 0, Ten = 0;
        //char[] OneChar = new char[10],
        //       TenChar = new char[10],
        //       ThisGroup = new char[40];

        int place = 0, numZeroes = 0;

        String NumString = "";

        String Nombre = String.valueOf(number);

        int end = Nombre.length() - 1;

        Hashtable hTable = new Hashtable();

        hTable.put("1", "\u1369");
        hTable.put("2", "\u136A");
        hTable.put("3", "\u136B");
        hTable.put("4", "\u136C");
        hTable.put("5", "\u136D");
        hTable.put("6", "\u136E");
        hTable.put("7", "\u136F");
        hTable.put("8", "\u1370");
        hTable.put("9", "\u1371");
        hTable.put("10", "\u1372");
        hTable.put("20", "\u1373");
        hTable.put("30", "\u1374");
        hTable.put("40", "\u1375");
        hTable.put("50", "\u1376");
        hTable.put("60", "\u1377");
        hTable.put("70", "\u1378");
        hTable.put("80", "\u1379");
        hTable.put("90", "\u137A");
        hTable.put("100", "\u137B");
        hTable.put("10000", "\u137C");

        if (number == 0)
            return "\u0030";  // what's 0 in Fidel?

        // case where number is in the hTable itself
        String nm = null;
        if ((nm = (String) hTable.get((Object) String.valueOf(number))) != null)
            return nm;

        if ((number < 10) && (number > 0))
            return (String) hTable.get(String.valueOf(number));

        do {

            One = Nombre.charAt(end--) - '0';
            Ten = Nombre.charAt(end--) - '0';
            String OneChar = "", TenChar = "", ThisGroup = "";
            //System.out.println("One :" + One + " Ten: "  + Ten);
            if ((One > 1) || ((One == 1) && (place == 0))) {
                OneChar = "`" + String.valueOf(One);
                //System.out.println("OneChar :" + OneChar + "\n");
            }
            if (Ten != 0) {
                TenChar = "`" + String.valueOf(Ten) + "0" + OneChar;
                ThisGroup = TenChar;
                //System.out.println("TenChar : " + TenChar + " " + ThisGroup + "\n");
            }
            if (place != 0) {
                if ((place % 2) != 0)
                    ThisGroup += "`100";
                for (i = 0; i < (place / 2); i++)
                    ThisGroup += "`10000";
            }

            //System.out.println("N[" + Nombre + "]: " + ThisGroup + "\n");
            NumString = ThisGroup + "," + NumString;
            place++;
        }
        while (end > 0);

        // end = NumString.length();

        String result = "";
        java.util.StringTokenizer st = new java.util.StringTokenizer(NumString, ",");
        while (st.hasMoreElements()) {
            java.util.StringTokenizer stc = new java.util.StringTokenizer(st.nextToken(), "`");
            while (stc.hasMoreElements()) {
                result += hTable.get(stc.nextToken());
            }
        }

        return result;
    }

}

class FidelAttributes {

    private boolean isTerminal = true;
    private char UnicodeValue = '\u0000';
    private int maxTermIndex = 0;

    public FidelAttributes(boolean isTerminal, char UnicodeValue, int maxTermIndex) {
        this.isTerminal = isTerminal;
        this.UnicodeValue = UnicodeValue;
        this.maxTermIndex = maxTermIndex;
    }

    public void setisTerminal(boolean isTerminal) {
        this.isTerminal = isTerminal;
    }

    public void setUnicodeValue(char UnicodeValue) {
        this.UnicodeValue = UnicodeValue;
    }

    public void setmaxTermIndex(int maxTermIndex) {
        this.maxTermIndex = maxTermIndex;
    }

    public boolean getisTerminal() {
        return this.isTerminal;
    }

    public char getUnicodeValue() {
        return this.UnicodeValue;
    }

    public int getmaxTermIndex() {
        return this.maxTermIndex;
    }

}
    
    
