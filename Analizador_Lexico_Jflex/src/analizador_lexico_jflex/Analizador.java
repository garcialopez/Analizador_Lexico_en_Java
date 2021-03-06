/* The following code was generated by JFlex 1.7.0 */
package analizador_lexico_jflex;
/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Analizador.flex</tt>
 */
public class Analizador {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\37\1\41\1\46\1\46\1\42\22\0\1\40\1\53\1\43"+
    "\2\0\1\51\1\50\1\56\1\57\1\60\1\47\1\54\1\71\1\55"+
    "\1\2\1\45\12\1\1\70\1\67\1\62\1\52\1\61\2\0\16\4"+
    "\1\34\13\4\1\63\1\44\1\64\1\72\1\4\1\0\1\5\1\6"+
    "\1\12\1\24\1\13\1\25\1\30\1\21\1\22\1\35\1\17\1\15"+
    "\1\26\1\16\1\14\1\31\1\4\1\11\1\7\1\10\1\23\1\32"+
    "\1\33\1\27\1\20\1\36\1\65\1\3\1\66\7\0\1\46\u1fa2\0"+
    "\1\46\1\46\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\22\5\3\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\0\30\5\1\35"+
    "\2\5\1\35\12\5\1\0\1\36\3\0\1\37\1\40"+
    "\1\41\1\42\1\43\27\5\1\35\16\5\1\36\2\44"+
    "\1\0\30\5\1\0\1\45\1\0\6\5\1\35\7\5"+
    "\1\35\2\5\1\0\1\45\25\5";

  private static int [] zzUnpackAction() {
    int [] result = new int[206];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\73\0\166\0\73\0\73\0\261\0\354\0\u0127"+
    "\0\u0162\0\u019d\0\u01d8\0\u0213\0\u024e\0\u0289\0\u02c4\0\u02ff"+
    "\0\u033a\0\u0375\0\u03b0\0\u03eb\0\u0426\0\u0461\0\u049c\0\u04d7"+
    "\0\73\0\u0512\0\u054d\0\u0588\0\73\0\73\0\73\0\u05c3"+
    "\0\u05fe\0\73\0\73\0\73\0\73\0\73\0\u0639\0\u0674"+
    "\0\73\0\73\0\73\0\73\0\73\0\73\0\73\0\73"+
    "\0\u06af\0\u06ea\0\u0725\0\u0760\0\u079b\0\u07d6\0\u0811\0\u084c"+
    "\0\u0887\0\u08c2\0\u08fd\0\u0938\0\u0973\0\u09ae\0\u09e9\0\u0a24"+
    "\0\u0a5f\0\u0a9a\0\u0ad5\0\u0b10\0\u0b4b\0\u0b86\0\u0bc1\0\u0bfc"+
    "\0\u0c37\0\261\0\u0c72\0\u0cad\0\u0ce8\0\u0d23\0\u0d5e\0\u0d99"+
    "\0\u0dd4\0\u0e0f\0\u0e4a\0\u0e85\0\u0ec0\0\u0efb\0\u0f36\0\u054d"+
    "\0\73\0\u0f71\0\u0fac\0\u0fe7\0\73\0\73\0\73\0\73"+
    "\0\u06af\0\u1022\0\u105d\0\u1098\0\u10d3\0\u110e\0\u1149\0\u1184"+
    "\0\u11bf\0\u11fa\0\u1235\0\u1270\0\u12ab\0\u12e6\0\u1321\0\u135c"+
    "\0\u1397\0\u13d2\0\u140d\0\u1448\0\u1483\0\u14be\0\u14f9\0\u1534"+
    "\0\u156f\0\u15aa\0\u15e5\0\u1620\0\u165b\0\u1696\0\u16d1\0\u170c"+
    "\0\u1747\0\u1782\0\u17bd\0\u17f8\0\u1833\0\u186e\0\u18a9\0\u054d"+
    "\0\73\0\u18e4\0\u191f\0\u195a\0\u1995\0\u19d0\0\u1a0b\0\u1a46"+
    "\0\u1a81\0\u1abc\0\u1af7\0\u1b32\0\u1b6d\0\u1ba8\0\u1be3\0\u1c1e"+
    "\0\u1c59\0\u1c94\0\u1ccf\0\u1d0a\0\u1d45\0\u1d80\0\u1dbb\0\u1df6"+
    "\0\u1e31\0\u1e6c\0\u1ea7\0\u1ee2\0\73\0\u1f1d\0\u1f58\0\u1f93"+
    "\0\u1fce\0\u2009\0\u2044\0\u207f\0\u1321\0\u20ba\0\u20f5\0\u2130"+
    "\0\u216b\0\u21a6\0\u21e1\0\u221c\0\u2257\0\u2292\0\u22cd\0\u2308"+
    "\0\u2308\0\u2343\0\u237e\0\u23b9\0\u23f4\0\u242f\0\u246a\0\u24a5"+
    "\0\u24e0\0\u251b\0\u2556\0\u2591\0\u25cc\0\u2607\0\u2642\0\u267d"+
    "\0\u26b8\0\u26f3\0\u272e\0\u2769\0\u27a4\0\u27df";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[206];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\6\1\16\1\17\3\6"+
    "\1\20\1\6\1\21\1\22\2\6\1\23\1\24\1\25"+
    "\1\26\1\27\2\6\2\30\1\31\1\32\1\33\1\2"+
    "\1\34\1\0\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\1\56\1\57\1\60\74\0\1\3"+
    "\1\61\74\0\33\6\40\0\2\6\1\62\1\63\27\6"+
    "\40\0\5\6\1\64\2\6\1\65\3\6\1\66\16\6"+
    "\40\0\4\6\1\67\7\6\1\70\1\71\1\6\1\72"+
    "\7\6\1\73\3\6\40\0\5\6\1\74\7\6\1\75"+
    "\15\6\40\0\7\6\1\76\23\6\40\0\1\6\1\77"+
    "\6\6\1\100\1\101\3\6\1\102\15\6\40\0\11\6"+
    "\1\103\1\104\10\6\1\105\7\6\40\0\10\6\1\106"+
    "\22\6\40\0\1\6\1\107\5\6\1\110\23\6\40\0"+
    "\12\6\1\111\6\6\1\112\1\113\10\6\40\0\7\6"+
    "\1\114\1\115\22\6\40\0\10\6\1\116\1\117\4\6"+
    "\1\120\14\6\40\0\10\6\1\121\22\6\40\0\1\6"+
    "\1\122\3\6\1\123\11\6\1\124\13\6\40\0\10\6"+
    "\1\125\22\6\40\0\15\6\1\126\15\6\40\0\2\6"+
    "\1\127\30\6\73\0\2\30\73\0\1\31\31\0\41\130"+
    "\1\0\1\130\1\131\1\132\26\130\45\0\1\133\1\0"+
    "\1\134\75\0\1\135\72\0\1\136\72\0\1\137\72\0"+
    "\1\140\21\0\1\141\1\0\1\141\34\0\1\141\36\0"+
    "\3\6\1\142\27\6\40\0\3\6\1\143\27\6\40\0"+
    "\7\6\1\144\23\6\40\0\10\6\1\145\22\6\40\0"+
    "\4\6\1\146\26\6\40\0\1\6\1\147\3\6\1\150"+
    "\25\6\40\0\12\6\1\151\20\6\40\0\10\6\1\152"+
    "\22\6\40\0\25\6\1\153\5\6\40\0\16\6\1\154"+
    "\14\6\40\0\1\6\1\155\12\6\1\112\16\6\40\0"+
    "\5\6\1\156\10\6\1\157\14\6\40\0\4\6\1\160"+
    "\26\6\40\0\3\6\1\146\1\161\26\6\40\0\12\6"+
    "\1\162\20\6\40\0\1\6\1\163\31\6\40\0\1\6"+
    "\1\116\31\6\40\0\3\6\1\146\27\6\40\0\17\6"+
    "\1\164\13\6\40\0\4\6\1\165\26\6\40\0\12\6"+
    "\1\166\20\6\40\0\4\6\1\167\26\6\40\0\27\6"+
    "\1\112\3\6\40\0\3\6\1\170\1\171\26\6\40\0"+
    "\25\6\1\172\5\6\40\0\21\6\1\173\11\6\40\0"+
    "\17\6\1\174\13\6\40\0\5\6\1\112\25\6\40\0"+
    "\10\6\1\175\22\6\40\0\12\6\1\176\20\6\40\0"+
    "\4\6\1\177\26\6\40\0\6\6\1\200\24\6\40\0"+
    "\10\6\1\201\5\6\1\202\14\6\40\0\2\6\1\203"+
    "\30\6\40\0\11\6\1\204\4\6\1\205\14\6\40\0"+
    "\16\6\1\206\14\6\40\0\31\6\1\207\1\6\34\0"+
    "\41\130\1\0\1\130\1\210\1\132\26\130\41\133\1\211"+
    "\1\212\3\133\1\0\24\133\47\134\1\213\23\134\4\0"+
    "\4\6\1\214\26\6\40\0\7\6\1\152\23\6\40\0"+
    "\1\6\1\215\31\6\40\0\11\6\1\216\21\6\40\0"+
    "\7\6\1\112\23\6\40\0\4\6\1\217\26\6\40\0"+
    "\16\6\1\220\14\6\40\0\6\6\1\221\24\6\40\0"+
    "\5\6\1\222\25\6\40\0\7\6\1\116\23\6\40\0"+
    "\4\6\1\161\26\6\40\0\12\6\1\223\20\6\40\0"+
    "\10\6\1\224\22\6\40\0\3\6\1\112\27\6\40\0"+
    "\17\6\1\225\13\6\40\0\6\6\1\226\24\6\40\0"+
    "\3\6\1\222\1\227\26\6\40\0\3\6\1\157\27\6"+
    "\40\0\22\6\1\112\10\6\40\0\7\6\1\230\23\6"+
    "\40\0\24\6\1\112\6\6\40\0\16\6\1\231\14\6"+
    "\40\0\4\6\1\232\26\6\40\0\7\6\1\233\23\6"+
    "\40\0\10\6\1\152\1\234\21\6\40\0\1\6\1\235"+
    "\31\6\40\0\2\6\1\206\30\6\40\0\1\6\1\222"+
    "\31\6\40\0\1\6\1\236\31\6\40\0\10\6\1\112"+
    "\22\6\40\0\13\6\1\237\17\6\40\0\4\6\1\240"+
    "\26\6\40\0\26\6\1\241\4\6\40\0\11\6\1\217"+
    "\21\6\40\0\1\6\1\242\31\6\40\0\20\6\1\112"+
    "\12\6\40\0\11\6\1\146\21\6\40\0\7\6\1\243"+
    "\23\6\75\0\1\211\31\0\45\244\1\245\1\244\1\246"+
    "\23\244\4\0\5\6\1\247\25\6\40\0\13\6\1\112"+
    "\17\6\40\0\7\6\1\250\23\6\40\0\16\6\1\251"+
    "\14\6\40\0\6\6\1\252\24\6\40\0\15\6\1\253"+
    "\15\6\40\0\4\6\1\112\26\6\40\0\3\6\1\254"+
    "\27\6\40\0\27\6\1\255\3\6\40\0\5\6\1\256"+
    "\25\6\40\0\15\6\1\112\15\6\40\0\16\6\1\257"+
    "\14\6\40\0\12\6\1\260\20\6\40\0\26\6\1\146"+
    "\4\6\40\0\1\6\1\261\31\6\40\0\5\6\1\262"+
    "\25\6\40\0\7\6\1\263\23\6\40\0\17\6\1\264"+
    "\13\6\40\0\11\6\1\265\21\6\40\0\1\6\1\266"+
    "\31\6\40\0\7\6\1\267\23\6\40\0\1\6\1\66"+
    "\31\6\40\0\4\6\1\126\26\6\40\0\6\6\1\222"+
    "\24\6\34\0\45\134\1\270\1\134\1\213\70\134\1\271"+
    "\1\134\1\213\23\134\4\0\1\6\1\243\31\6\40\0"+
    "\1\6\1\256\31\6\40\0\6\6\1\112\24\6\40\0"+
    "\4\6\1\272\26\6\40\0\5\6\1\273\25\6\40\0"+
    "\16\6\1\274\14\6\40\0\12\6\1\112\20\6\40\0"+
    "\12\6\1\275\20\6\40\0\20\6\1\157\12\6\40\0"+
    "\12\6\1\276\20\6\40\0\21\6\1\277\11\6\40\0"+
    "\22\6\1\300\10\6\40\0\11\6\1\222\21\6\40\0"+
    "\11\6\1\301\21\6\40\0\24\6\1\146\6\6\40\0"+
    "\6\6\1\302\24\6\101\0\1\244\31\0\21\6\1\303"+
    "\11\6\40\0\10\6\1\304\22\6\40\0\7\6\1\305"+
    "\23\6\40\0\17\6\1\146\13\6\40\0\6\6\1\306"+
    "\24\6\40\0\1\6\1\307\31\6\40\0\7\6\1\310"+
    "\23\6\40\0\14\6\1\112\16\6\40\0\4\6\1\311"+
    "\26\6\40\0\25\6\1\112\5\6\40\0\12\6\1\312"+
    "\20\6\40\0\12\6\1\222\20\6\40\0\7\6\1\313"+
    "\23\6\40\0\6\6\1\146\24\6\40\0\12\6\1\314"+
    "\20\6\40\0\7\6\1\205\23\6\40\0\16\6\1\315"+
    "\14\6\40\0\10\6\1\316\22\6\40\0\4\6\1\157"+
    "\26\6\40\0\32\6\1\311\40\0\21\6\1\112\11\6"+
    "\34\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10266];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\2\11\23\1\1\11\3\1\3\11"+
    "\2\1\5\11\2\1\10\11\1\0\46\1\1\0\1\11"+
    "\3\0\4\11\50\1\1\11\1\1\1\0\30\1\1\0"+
    "\1\11\1\0\21\1\1\0\26\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[206];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
  /* Código de la clase */
  private boolean masTokens = false;

  public boolean hayTokens() {
    return masTokens;
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Analizador(java.io.Reader in) {
    /* Código al inicio de nuestro Analizador */
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 178) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
      /* Código al finalizar el análisis */

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public GestionaToken yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { GestionaToken t = new GestionaToken("Simbolo desconocido", yytext());
    masTokens = true;
    return t;
            } 
            // fall through
          case 38: break;
          case 2: 
            { GestionaToken t = new GestionaToken("Número entero", yytext());
  masTokens = true;
  return t;
            } 
            // fall through
          case 39: break;
          case 3: 
            { GestionaToken t = new GestionaToken("Punto", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 40: break;
          case 4: 
            { GestionaToken t = new GestionaToken("OR", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 41: break;
          case 5: 
            { GestionaToken t = new GestionaToken("IDENTIFICADOR", yytext());
  masTokens = true;
  return t;
            } 
            // fall through
          case 42: break;
          case 6: 
            { 
            } 
            // fall through
          case 43: break;
          case 7: 
            { GestionaToken t = new GestionaToken("Comillas dobles", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 44: break;
          case 8: 
            { GestionaToken t = new GestionaToken("División", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 45: break;
          case 9: 
            { GestionaToken t = new GestionaToken("Multiplicación", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 46: break;
          case 10: 
            { GestionaToken t = new GestionaToken("AND", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 47: break;
          case 11: 
            { GestionaToken t = new GestionaToken("MOD", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 48: break;
          case 12: 
            { GestionaToken t = new GestionaToken("Asignación", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 49: break;
          case 13: 
            { GestionaToken t = new GestionaToken("Negación", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 50: break;
          case 14: 
            { GestionaToken t = new GestionaToken("Suma", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 51: break;
          case 15: 
            { GestionaToken t = new GestionaToken("Resta", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 52: break;
          case 16: 
            { GestionaToken t = new GestionaToken("Apostrofe", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 53: break;
          case 17: 
            { GestionaToken t = new GestionaToken("Paréntesis abierto", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 54: break;
          case 18: 
            { GestionaToken t = new GestionaToken("Paréntesis cerrado", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 55: break;
          case 19: 
            { GestionaToken t = new GestionaToken("Mayor que", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 56: break;
          case 20: 
            { GestionaToken t = new GestionaToken("Menor que", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 57: break;
          case 21: 
            { GestionaToken t = new GestionaToken("Corchete abierto", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 58: break;
          case 22: 
            { GestionaToken t = new GestionaToken("Corchete cerrado", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 59: break;
          case 23: 
            { GestionaToken t = new GestionaToken("Llave abierta", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 60: break;
          case 24: 
            { GestionaToken t = new GestionaToken("Llave cerrada", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 61: break;
          case 25: 
            { GestionaToken t = new GestionaToken("Punto y coma", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 62: break;
          case 26: 
            { GestionaToken t = new GestionaToken("Dos puntos", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 63: break;
          case 27: 
            { GestionaToken t = new GestionaToken("Coma", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 64: break;
          case 28: 
            { GestionaToken t = new GestionaToken("Acento circunflejo", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 65: break;
          case 29: 
            { GestionaToken t = new GestionaToken("Palabra reservada", yytext());
  masTokens = true;
  return t;
            } 
            // fall through
          case 66: break;
          case 30: 
            { GestionaToken t = new GestionaToken("Cadena", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 67: break;
          case 31: 
            { GestionaToken t = new GestionaToken("Igualdad", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 68: break;
          case 32: 
            { GestionaToken t = new GestionaToken("Diferente", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 69: break;
          case 33: 
            { GestionaToken t = new GestionaToken("Mayor igual que", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 70: break;
          case 34: 
            { GestionaToken t = new GestionaToken("Menor igual que", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 71: break;
          case 35: 
            { GestionaToken t = new GestionaToken("Numero decimal", yytext());
  masTokens = true;
  return t;
            } 
            // fall through
          case 72: break;
          case 36: 
            { GestionaToken t = new GestionaToken("Comentario de una linea", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 73: break;
          case 37: 
            { GestionaToken t = new GestionaToken("Comentario multilinea", yytext());
        masTokens = true;
        return t;
            } 
            // fall through
          case 74: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
