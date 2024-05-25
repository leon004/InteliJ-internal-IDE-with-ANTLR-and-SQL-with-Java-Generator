// $ANTLR 3.5.2 TgramaticaReconoceLengBD.g 2023-11-09 11:39:02
package poryectou2;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TgramaticaReconoceLengBDLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ALFABETICO=4;
	public static final int CERRAR=5;
	public static final int CONDICION=6;
	public static final int CREAR=7;
	public static final int DECIMAL=8;
	public static final int FECHA=9;
	public static final int FIN=10;
	public static final int FORANEA=11;
	public static final int ID=12;
	public static final int INICIO=13;
	public static final int NUMERICO=14;
	public static final int TABLA=15;
	public static final int USAR=16;
	public static final int WS=17;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public TgramaticaReconoceLengBDLexer() {} 
	public TgramaticaReconoceLengBDLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public TgramaticaReconoceLengBDLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "TgramaticaReconoceLengBD.g"; }

	// $ANTLR start "CERRAR"
	public final void mCERRAR() throws RecognitionException {
		try {
			int _type = CERRAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// TgramaticaReconoceLengBD.g:86:10: ( 'cerrar' )
			// TgramaticaReconoceLengBD.g:86:12: 'cerrar'
			{
			match("cerrar"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CERRAR"

	// $ANTLR start "NUMERICO"
	public final void mNUMERICO() throws RecognitionException {
		try {
			int _type = NUMERICO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// TgramaticaReconoceLengBD.g:87:11: ( 'numeros' )
			// TgramaticaReconoceLengBD.g:87:13: 'numeros'
			{
			match("numeros"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERICO"

	// $ANTLR start "DECIMAL"
	public final void mDECIMAL() throws RecognitionException {
		try {
			int _type = DECIMAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// TgramaticaReconoceLengBD.g:88:8: ( 'decimal' )
			// TgramaticaReconoceLengBD.g:88:10: 'decimal'
			{
			match("decimal"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECIMAL"

	// $ANTLR start "CONDICION"
	public final void mCONDICION() throws RecognitionException {
		try {
			int _type = CONDICION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// TgramaticaReconoceLengBD.g:89:10: ( 'condicion' )
			// TgramaticaReconoceLengBD.g:89:12: 'condicion'
			{
			match("condicion"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONDICION"

	// $ANTLR start "ALFABETICO"
	public final void mALFABETICO() throws RecognitionException {
		try {
			int _type = ALFABETICO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// TgramaticaReconoceLengBD.g:90:11: ( 'letras' )
			// TgramaticaReconoceLengBD.g:90:13: 'letras'
			{
			match("letras"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALFABETICO"

	// $ANTLR start "FECHA"
	public final void mFECHA() throws RecognitionException {
		try {
			int _type = FECHA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// TgramaticaReconoceLengBD.g:91:11: ( 'fecha' )
			// TgramaticaReconoceLengBD.g:91:13: 'fecha'
			{
			match("fecha"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FECHA"

	// $ANTLR start "FORANEA"
	public final void mFORANEA() throws RecognitionException {
		try {
			int _type = FORANEA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// TgramaticaReconoceLengBD.g:92:9: ( 'foranea' )
			// TgramaticaReconoceLengBD.g:92:11: 'foranea'
			{
			match("foranea"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FORANEA"

	// $ANTLR start "TABLA"
	public final void mTABLA() throws RecognitionException {
		try {
			int _type = TABLA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// TgramaticaReconoceLengBD.g:93:7: ( 'tabla' )
			// TgramaticaReconoceLengBD.g:93:9: 'tabla'
			{
			match("tabla"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TABLA"

	// $ANTLR start "INICIO"
	public final void mINICIO() throws RecognitionException {
		try {
			int _type = INICIO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// TgramaticaReconoceLengBD.g:94:7: ( 'inicio' )
			// TgramaticaReconoceLengBD.g:94:9: 'inicio'
			{
			match("inicio"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INICIO"

	// $ANTLR start "FIN"
	public final void mFIN() throws RecognitionException {
		try {
			int _type = FIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// TgramaticaReconoceLengBD.g:95:7: ( 'fin' )
			// TgramaticaReconoceLengBD.g:95:9: 'fin'
			{
			match("fin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIN"

	// $ANTLR start "USAR"
	public final void mUSAR() throws RecognitionException {
		try {
			int _type = USAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// TgramaticaReconoceLengBD.g:96:7: ( 'usar' )
			// TgramaticaReconoceLengBD.g:96:9: 'usar'
			{
			match("usar"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USAR"

	// $ANTLR start "CREAR"
	public final void mCREAR() throws RecognitionException {
		try {
			int _type = CREAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// TgramaticaReconoceLengBD.g:97:7: ( 'crear' )
			// TgramaticaReconoceLengBD.g:97:9: 'crear'
			{
			match("crear"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CREAR"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// TgramaticaReconoceLengBD.g:98:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// TgramaticaReconoceLengBD.g:98:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// TgramaticaReconoceLengBD.g:98:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// TgramaticaReconoceLengBD.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// TgramaticaReconoceLengBD.g:99:6: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
			// TgramaticaReconoceLengBD.g:99:7: ( ' ' | '\\n' | '\\t' | '\\r' )+
			{
			// TgramaticaReconoceLengBD.g:99:7: ( ' ' | '\\n' | '\\t' | '\\r' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0=='\r'||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// TgramaticaReconoceLengBD.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			_channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// TgramaticaReconoceLengBD.g:1:8: ( CERRAR | NUMERICO | DECIMAL | CONDICION | ALFABETICO | FECHA | FORANEA | TABLA | INICIO | FIN | USAR | CREAR | ID | WS )
		int alt3=14;
		alt3 = dfa3.predict(input);
		switch (alt3) {
			case 1 :
				// TgramaticaReconoceLengBD.g:1:10: CERRAR
				{
				mCERRAR(); 

				}
				break;
			case 2 :
				// TgramaticaReconoceLengBD.g:1:17: NUMERICO
				{
				mNUMERICO(); 

				}
				break;
			case 3 :
				// TgramaticaReconoceLengBD.g:1:26: DECIMAL
				{
				mDECIMAL(); 

				}
				break;
			case 4 :
				// TgramaticaReconoceLengBD.g:1:34: CONDICION
				{
				mCONDICION(); 

				}
				break;
			case 5 :
				// TgramaticaReconoceLengBD.g:1:44: ALFABETICO
				{
				mALFABETICO(); 

				}
				break;
			case 6 :
				// TgramaticaReconoceLengBD.g:1:55: FECHA
				{
				mFECHA(); 

				}
				break;
			case 7 :
				// TgramaticaReconoceLengBD.g:1:61: FORANEA
				{
				mFORANEA(); 

				}
				break;
			case 8 :
				// TgramaticaReconoceLengBD.g:1:69: TABLA
				{
				mTABLA(); 

				}
				break;
			case 9 :
				// TgramaticaReconoceLengBD.g:1:75: INICIO
				{
				mINICIO(); 

				}
				break;
			case 10 :
				// TgramaticaReconoceLengBD.g:1:82: FIN
				{
				mFIN(); 

				}
				break;
			case 11 :
				// TgramaticaReconoceLengBD.g:1:86: USAR
				{
				mUSAR(); 

				}
				break;
			case 12 :
				// TgramaticaReconoceLengBD.g:1:91: CREAR
				{
				mCREAR(); 

				}
				break;
			case 13 :
				// TgramaticaReconoceLengBD.g:1:97: ID
				{
				mID(); 

				}
				break;
			case 14 :
				// TgramaticaReconoceLengBD.g:1:100: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\1\uffff\10\11\2\uffff\24\11\1\53\13\11\1\uffff\2\11\1\71\2\11\1\74\3"+
		"\11\1\100\1\11\1\102\1\11\1\uffff\1\104\1\11\1\uffff\2\11\1\110\1\uffff"+
		"\1\11\1\uffff\1\112\1\uffff\1\11\1\114\1\115\1\uffff\1\116\1\uffff\1\11"+
		"\3\uffff\1\120\1\uffff";
	static final String DFA3_eofS =
		"\121\uffff";
	static final String DFA3_minS =
		"\1\11\1\145\1\165\3\145\1\141\1\156\1\163\2\uffff\1\162\1\156\1\145\1"+
		"\155\1\143\1\164\1\143\1\162\1\156\1\142\1\151\1\141\1\162\1\144\1\141"+
		"\1\145\1\151\1\162\1\150\1\141\1\60\1\154\1\143\1\162\1\141\1\151\2\162"+
		"\1\155\2\141\1\156\1\uffff\1\141\1\151\1\60\1\162\1\143\1\60\1\157\1\141"+
		"\1\163\1\60\1\145\1\60\1\157\1\uffff\1\60\1\151\1\uffff\1\163\1\154\1"+
		"\60\1\uffff\1\141\1\uffff\1\60\1\uffff\1\157\2\60\1\uffff\1\60\1\uffff"+
		"\1\156\3\uffff\1\60\1\uffff";
	static final String DFA3_maxS =
		"\1\172\1\162\1\165\2\145\1\157\1\141\1\156\1\163\2\uffff\1\162\1\156\1"+
		"\145\1\155\1\143\1\164\1\143\1\162\1\156\1\142\1\151\1\141\1\162\1\144"+
		"\1\141\1\145\1\151\1\162\1\150\1\141\1\172\1\154\1\143\1\162\1\141\1\151"+
		"\2\162\1\155\2\141\1\156\1\uffff\1\141\1\151\1\172\1\162\1\143\1\172\1"+
		"\157\1\141\1\163\1\172\1\145\1\172\1\157\1\uffff\1\172\1\151\1\uffff\1"+
		"\163\1\154\1\172\1\uffff\1\141\1\uffff\1\172\1\uffff\1\157\2\172\1\uffff"+
		"\1\172\1\uffff\1\156\3\uffff\1\172\1\uffff";
	static final String DFA3_acceptS =
		"\11\uffff\1\15\1\16\40\uffff\1\12\15\uffff\1\13\2\uffff\1\14\3\uffff\1"+
		"\6\1\uffff\1\10\1\uffff\1\1\3\uffff\1\5\1\uffff\1\11\1\uffff\1\2\1\3\1"+
		"\7\1\uffff\1\4";
	static final String DFA3_specialS =
		"\121\uffff}>";
	static final String[] DFA3_transitionS = {
			"\2\12\2\uffff\1\12\22\uffff\1\12\40\uffff\32\11\4\uffff\1\11\1\uffff"+
			"\2\11\1\1\1\3\1\11\1\5\2\11\1\7\2\11\1\4\1\11\1\2\5\11\1\6\1\10\5\11",
			"\1\13\11\uffff\1\14\2\uffff\1\15",
			"\1\16",
			"\1\17",
			"\1\20",
			"\1\21\3\uffff\1\23\5\uffff\1\22",
			"\1\24",
			"\1\25",
			"\1\26",
			"",
			"",
			"\1\27",
			"\1\30",
			"\1\31",
			"\1\32",
			"\1\33",
			"\1\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"",
			"\1\67",
			"\1\70",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"\1\72",
			"\1\73",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"\1\75",
			"\1\76",
			"\1\77",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"\1\101",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"\1\103",
			"",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"\1\105",
			"",
			"\1\106",
			"\1\107",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"",
			"\1\111",
			"",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"",
			"\1\113",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"",
			"\1\117",
			"",
			"",
			"",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( CERRAR | NUMERICO | DECIMAL | CONDICION | ALFABETICO | FECHA | FORANEA | TABLA | INICIO | FIN | USAR | CREAR | ID | WS );";
		}
	}

}
