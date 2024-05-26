package poryectou2;

import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.*;
import javax.swing.JTextArea;

@SuppressWarnings("all")
public class TgramaticaReconoceLengBDParser extends Parser {
	public static final String[] tokenNames = new String[] {
			"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALFABETICO", "CERRAR", "CONDICION",
			"CREAR", "DECIMAL", "FECHA", "FIN", "FORANEA", "ID", "INICIO", "NUMERICO",
			"TABLA", "USAR", "WS"
	};
	private JTextArea salida;
	private JTextArea copJava;
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

	public void setSalida(JTextArea _salida) {
		salida = _salida;
	}

	public void setCopJava(JTextArea _copJava) {
		copJava = _copJava;
	}

	public TgramaticaReconoceLengBDParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public TgramaticaReconoceLengBDParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override
	public String[] getTokenNames() {
		return TgramaticaReconoceLengBDParser.tokenNames;
	}

	@Override
	public String getGrammarFileName() {
		return "TgramaticaReconoceLengBD.g";
	}

	List<Tabla> tablas = new ArrayList<Tabla>();
	Tabla tablaActual = null;
	String tipoSQL;

	// Modificado para lanzar excepciones cuando hay errores de sintaxis
	@Override
	public void recover(IntStream input, RecognitionException re) {
		throw new RuntimeException(re);
	}

	@Override
	public void reportError(RecognitionException e) {
		super.reportError(e);
		throw new RuntimeException(e);
	}

	// $ANTLR start "inicio"
	public final void inicio() throws RecognitionException {
		try {
			creacion();
			usar();
			while (input.LA(1) == TABLA) {
				tabla();
			}
			cerrar();
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}
	}
	// $ANTLR end "inicio"

	// $ANTLR start "creacion"
	public final void creacion() throws RecognitionException {
		Token ID1 = null;

		try {
			match(input, CREAR, FOLLOW_CREAR_in_creacion37);
			ID1 = (Token) match(input, ID, FOLLOW_ID_in_creacion39);
			salida.append("CREATE DATABASE " + (ID1 != null ? ID1.getText() : null) + "; \n");
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}
	}
	// $ANTLR end "creacion"

	// $ANTLR start "usar"
	public final void usar() throws RecognitionException {
		Token ID2 = null;

		try {
			match(input, USAR, FOLLOW_USAR_in_usar53);
			ID2 = (Token) match(input, ID, FOLLOW_ID_in_usar56);
			salida.append("USE " + (ID2 != null ? ID2.getText() : null) + "; \n");
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}
	}
	// $ANTLR end "usar"

	// $ANTLR start "tabla"
	public final void tabla() throws RecognitionException {
		Token ID3 = null;

		try {
			match(input, TABLA, FOLLOW_TABLA_in_tabla69);
			ID3 = (Token) match(input, ID, FOLLOW_ID_in_tabla71);
			match(input, INICIO, FOLLOW_INICIO_in_tabla73);

			salida.append("CREATE TABLE " + (ID3 != null ? ID3.getText() : null) + "( \n");
			salida.append((ID3 != null ? ID3.getText() : null) + "_key INT AUTO_INCREMENT PRIMARY KEY NOT NULL \n");

			Tabla t = new Tabla();
			t.nombre = (ID3 != null ? ID3.getText() : null);
			tablas.add(t);
			tablaActual = t;

			while (input.LA(1) == ID) {
				campo();
			}

			match(input, FIN, FOLLOW_FIN_in_tabla126);
			salida.append(");\n");
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}
	}
	// $ANTLR end "tabla"

	// $ANTLR start "campo"
	public final void campo() throws RecognitionException {
		Token t = null;
		Token ID4 = null;

		try {
			ID4 = (Token) match(input, ID, FOLLOW_ID_in_campo139);
			t = (Token) input.LT(1);
			input.consume();

			if ((t != null ? t.getText() : null).equals("numeros")) {
				tipoSQL = "INT";
				salida.append("," + (ID4 != null ? ID4.getText() : null) + " " + tipoSQL + "\n");
			} else if ((t != null ? t.getText() : null).equals("letras")) {
				tipoSQL = "VARCHAR (200)";
				salida.append("," + (ID4 != null ? ID4.getText() : null) + " " + tipoSQL + "\n");
			} else if ((t != null ? t.getText() : null).equals("fecha")) {
				tipoSQL = "DATE";
				salida.append("," + (ID4 != null ? ID4.getText() : null) + " " + tipoSQL + "\n");
			} else if ((t != null ? t.getText() : null).equals("decimal")) {
				tipoSQL = "DECIMAL (10,2)";
				salida.append("," + (ID4 != null ? ID4.getText() : null) + " " + tipoSQL + "\n");
			} else if ((t != null ? t.getText() : null).equals("condicion")) {
				tipoSQL = "BOOLEAN";
				salida.append("," + (ID4 != null ? ID4.getText() : null) + " " + tipoSQL);
			} else if ((t != null ? t.getText() : null).equals("foranea")) {
				salida.append("," + (ID4 != null ? ID4.getText() : null) + "_key INT ,\n");
				String foreing = (ID4 != null ? ID4.getText() : null) + "_key";
				salida.append("FOREIGN KEY (" + foreing + ") REFERENCES " + (ID4 != null ? ID4.getText() : null) + "(" + foreing + ")\n");
			}

			Atributo a = new Atributo();
			a.nombreAtributo = (ID4 != null ? ID4.getText() : null);
			a.tipoAtributo = tipoSQL;
			tablaActual.atributos.add(a);
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}
	}
	// $ANTLR end "campo"

	// $ANTLR start "cerrar"
	public final void cerrar() throws RecognitionException {
		try {
			match(input, CERRAR, FOLLOW_CERRAR_in_cerrar206);

			for (int i = 0; i < tablas.size(); i++) {
				copJava.append("Nombre de la tabla: " + tablas.get(i).nombre + "\n");
				List<Atributo> atribs = tablas.get(i).atributos;
				for (int j = 0; j < atribs.size(); j++) {
					copJava.append("Atributo: " + atribs.get(j).nombreAtributo + " Tipo de Atributo: " + atribs.get(j).tipoAtributo + "\n");
				}
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}
	}
	// $ANTLR end "cerrar"

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
