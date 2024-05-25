// $ANTLR 3.5.2 TgramaticaReconoceLengBD.g 2023-11-09 11:39:02
package poryectou2;
import java.util.ArrayList;
import java.util.List;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JTextArea;

@SuppressWarnings("all")
public class TgramaticaReconoceLengBDParser extends Parser {
	public static final String[] tokenNames = new String[] {
			"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALFABETICO", "CERRAR", "CONDICION",
			"CREAR", "DECIMAL", "FECHA", "FIN", "FORANEA", "ID", "INICIO", "NUMERICO",
			"TABLA", "USAR", "WS"
	};
	private javax.swing.JTextArea salida;
	private javax.swing.JTextArea copJava;
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

	public void setSalida(javax.swing.JTextArea _salida){
		salida= _salida;
	}

	public void setCopJava(javax.swing.JTextArea _copJava){
		copJava= _copJava;
	}

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators

	public TgramaticaReconoceLengBDParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public TgramaticaReconoceLengBDParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return TgramaticaReconoceLengBDParser.tokenNames; }
	@Override public String getGrammarFileName() { return "TgramaticaReconoceLengBD.g"; }

	List<Tabla> tablas = new ArrayList<Tabla>();
	Tabla tablaActual = null;
	String tipoSQL;

	// $ANTLR start "inicio"
	public final void inicio() throws RecognitionException {
		try {
			// TgramaticaReconoceLengBD.g:13:8: ( creacion usar ( tabla )+ cerrar )
			// TgramaticaReconoceLengBD.g:13:11: creacion usar ( tabla )+ cerrar
			{
				pushFollow(FOLLOW_creacion_in_inicio22);
				creacion();
				state._fsp--;

				pushFollow(FOLLOW_usar_in_inicio24);
				usar();
				state._fsp--;

				// TgramaticaReconoceLengBD.g:13:25: ( tabla )+
				int cnt1=0;
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==TABLA) ) {
						alt1=1;
					}

					switch (alt1) {
						case 1 :
							// TgramaticaReconoceLengBD.g:13:25: tabla
						{
							pushFollow(FOLLOW_tabla_in_inicio26);
							tabla();
							state._fsp--;

						}
						break;

						default :
							if ( cnt1 >= 1 ) break loop1;
							EarlyExitException eee = new EarlyExitException(1, input);
							throw eee;
					}
					cnt1++;
				}

				pushFollow(FOLLOW_cerrar_in_inicio29);
				cerrar();
				state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inicio"

	// $ANTLR start "creacion"
	// TgramaticaReconoceLengBD.g:15:1: creacion : CREAR ID ;
	public final void creacion() throws RecognitionException {
		Token ID1=null;

		try {
			// TgramaticaReconoceLengBD.g:15:10: ( CREAR ID )
			// TgramaticaReconoceLengBD.g:15:12: CREAR ID
			{
				match(input,CREAR,FOLLOW_CREAR_in_creacion37);
				ID1=(Token)match(input,ID,FOLLOW_ID_in_creacion39);
				salida.append("CREATE DATABASE "+(ID1!=null?ID1.getText():null)+"; \n");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "creacion"

	// $ANTLR start "usar"
	// TgramaticaReconoceLengBD.g:17:1: usar : USAR ID ;
	public final void usar() throws RecognitionException {
		Token ID2=null;

		try {
			// TgramaticaReconoceLengBD.g:17:10: ( USAR ID )
			// TgramaticaReconoceLengBD.g:17:12: USAR ID
			{
				match(input,USAR,FOLLOW_USAR_in_usar53);
				ID2=(Token)match(input,ID,FOLLOW_ID_in_usar56);
				salida.append("USE "+(ID2!=null?ID2.getText():null)+"; \n");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usar"

	// $ANTLR start "tabla"
	public final void tabla() throws RecognitionException {
		Token ID3=null;

		try {
			// TgramaticaReconoceLengBD.g:19:10: ( TABLA ID INICIO ( campo )+ FIN )
			// TgramaticaReconoceLengBD.g:19:12: TABLA ID INICIO ( campo )+ FIN
			{
				match(input,TABLA,FOLLOW_TABLA_in_tabla69);
				ID3=(Token)match(input,ID,FOLLOW_ID_in_tabla71);
				match(input,INICIO,FOLLOW_INICIO_in_tabla73);

				// Código para generar SQL
				salida.append("CREATE TABLE "+(ID3!=null?ID3.getText():null)+"( \n");
				salida.append((ID3!=null?ID3.getText():null)+"_key INT AUTO_INCREMENT PRIMARY KEY NOT NULL \n");

				// Código para crear estructura de datos
				Tabla t = new Tabla();
				t.nombre =(ID3!=null?ID3.getText():null);
				tablas.add(t);
				tablaActual = t;

				// Manejo de múltiples campos
				// TgramaticaReconoceLengBD.g:33:14: ( campo )+
				int cnt2=0;
				loop2:
				while (true) {
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==ID) ) {
						alt2=1;
					}

					switch (alt2) {
						case 1 :
							// TgramaticaReconoceLengBD.g:33:14: campo
						{
							pushFollow(FOLLOW_campo_in_tabla109);
							campo();
							state._fsp--;

						}
						break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
					}
					cnt2++;
				}

				match(input,FIN,FOLLOW_FIN_in_tabla126);

				// Añadir el cierre de la tabla
				salida.append(");\n");

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tabla"

	// $ANTLR start "campo"
	// TgramaticaReconoceLengBD.g:38:1: campo : ID (t= NUMERICO |t= ALFABETICO |t= FECHA |t= FORANEA |t= DECIMAL |t= CONDICION ) ;
	public final void campo() throws RecognitionException {
		Token t=null;
		Token ID4=null;

		try {
			// TgramaticaReconoceLengBD.g:38:9: ( ID (t= NUMERICO |t= ALFABETICO |t= FECHA |t= FORANEA |t= DECIMAL |t= CONDICION ) )
			// TgramaticaReconoceLengBD.g:38:11: ID (t= NUMERICO |t= ALFABETICO |t= FECHA |t= FORANEA |t= DECIMAL |t= CONDICION )
			{
				ID4=(Token)match(input,ID,FOLLOW_ID_in_campo139);
				// TgramaticaReconoceLengBD.g:38:15: (t= NUMERICO |t= ALFABETICO |t= FECHA |t= FORANEA |t= DECIMAL |t= CONDICION )
				int alt3=6;
				switch ( input.LA(1) ) {
					case NUMERICO:
					{
						alt3=1;
					}
					break;
					case ALFABETICO:
					{
						alt3=2;
					}
					break;
					case FECHA:
					{
						alt3=3;
					}
					break;
					case FORANEA:
					{
						alt3=4;
					}
					break;
					case DECIMAL:
					{
						alt3=5;
					}
					break;
					case CONDICION:
					{
						alt3=6;
					}
					break;
					default:
						NoViableAltException nvae =
								new NoViableAltException("", 3, 0, input);
						throw nvae;
				}
				switch (alt3) {
					case 1 :
						// TgramaticaReconoceLengBD.g:38:16: t= NUMERICO
					{
						t=(Token)match(input,NUMERICO,FOLLOW_NUMERICO_in_campo145);
					}
					break;
					case 2 :
						// TgramaticaReconoceLengBD.g:38:29: t= ALFABETICO
					{
						t=(Token)match(input,ALFABETICO,FOLLOW_ALFABETICO_in_campo151);
					}
					break;
					case 3 :
						// TgramaticaReconoceLengBD.g:38:44: t= FECHA
					{
						t=(Token)match(input,FECHA,FOLLOW_FECHA_in_campo157);
					}
					break;
					case 4 :
						// TgramaticaReconoceLengBD.g:38:54: t= FORANEA
					{
						t=(Token)match(input,FORANEA,FOLLOW_FORANEA_in_campo163);
					}
					break;
					case 5 :
						// TgramaticaReconoceLengBD.g:38:66: t= DECIMAL
					{
						t=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_campo169);
					}
					break;
					case 6 :
						// TgramaticaReconoceLengBD.g:38:78: t= CONDICION
					{
						t=(Token)match(input,CONDICION,FOLLOW_CONDICION_in_campo175);
					}
					break;

				}

				// Código para generar SQL
				if ((t != null ? t.getText() : null).equals("numeros")) {
					tipoSQL = "INT";
					salida.append("," + (ID4 != null ? ID4.getText(): null) + " " + tipoSQL + "\n");
				} else if ((t != null ? t.getText() : null).equals("letras")) {
					tipoSQL = "VARCHAR (200)";
					salida.append("," + (ID4 != null ? ID4.getText(): null) + " " + tipoSQL + "\n");
				} else if ((t != null ? t.getText() : null).equals("fecha")) {
					tipoSQL = "DATE";
					salida.append("," + (ID4 != null ? ID4.getText(): null) + " " + tipoSQL + "\n");
				} else if ((t != null ? t.getText() : null).equals("decimal")) {
					tipoSQL = "DECIMAL (10,2)";
					salida.append("," + (ID4 != null ? ID4.getText(): null) + " " + tipoSQL + "\n");
				} else if ((t != null ? t.getText() : null).equals("condicion")) {
					tipoSQL = "BOOLEAN";
					salida.append("," + (ID4 != null ? ID4.getText(): null) + " " + tipoSQL);
				} else if ((t != null ? t.getText() : null).equals("foranea")) {
					salida.append("," + (ID4 != null ? ID4.getText(): null) + "_key INT ,\n");
					String foreing = (ID4 != null ? ID4.getText() : null) + "_key";
					salida.append("FOREIGN KEY (" + foreing + ") REFERENCES " + (ID4 != null ? ID4.getText() : null) + "(" + foreing + ")\n");
				}

				// Código para crear estructura de datos
				Atributo a  = new Atributo();
				a.nombreAtributo = (ID4 != null ? ID4.getText() : null);
				a.tipoAtributo = tipoSQL;
				tablaActual.atributos.add(a);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "campo"

	// $ANTLR start "cerrar"
	// TgramaticaReconoceLengBD.g:70:1: cerrar : CERRAR ;
	public final void cerrar() throws RecognitionException {
		try {
			// TgramaticaReconoceLengBD.g:70:10: ( CERRAR )
			// TgramaticaReconoceLengBD.g:70:12: CERRAR
			{
				match(input,CERRAR,FOLLOW_CERRAR_in_cerrar206);
				// Generar la salida final
				for (int i = 0; i < tablas.size(); i++) {
					copJava.append("Nombre de la tabla: " + tablas.get(i).nombre + "\n");
					List<Atributo> atribs = tablas.get(i).atributos;
					for (int j = 0; j < atribs.size(); j++) {
						copJava.append("Atributo: " + atribs.get(j).nombreAtributo + " Tipo de Atributo: " + atribs.get(j).tipoAtributo + "\n");
					}
				}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cerrar"

	// Delegated rules

	public static final BitSet FOLLOW_creacion_in_inicio22 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_usar_in_inicio24 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_tabla_in_inicio26 = new BitSet(new long[]{0x0000000000008020L});
	public static final BitSet FOLLOW_cerrar_in_inicio29 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREAR_in_creacion37 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_creacion39 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USAR_in_usar53 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_usar56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLA_in_tabla69 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_tabla71 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INICIO_in_tabla73 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_campo_in_tabla109 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_FIN_in_tabla126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_campo139 = new BitSet(new long[]{0x0000000000004B50L});
	public static final BitSet FOLLOW_NUMERICO_in_campo145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALFABETICO_in_campo151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FECHA_in_campo157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORANEA_in_campo163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_in_campo169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONDICION_in_campo175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CERRAR_in_cerrar206 = new BitSet(new long[]{0x0000000000000002L});
}
