/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poryectou2;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoDarkFuchsiaIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatSpacegrayIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedDarkIJTheme;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Desktop;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringBufferInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GUI extends javax.swing.JFrame {

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada1;
    FileOutputStream salida1;
    private final Highlighter.HighlightPainter errorPainter = new DefaultHighlighter.DefaultHighlightPainter(Color.RED);

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        entrada.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateInput();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateInput();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateInput();
            }
        });
    }

    private void validateInput() {
        String text = entrada.getText();
        ANTLRInputStream input = null;
        try {
            input = new ANTLRInputStream(new StringBufferInputStream(text));
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        TgramaticaReconoceLengBDLexer lexer = new TgramaticaReconoceLengBDLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TgramaticaReconoceLengBDParser parser = new TgramaticaReconoceLengBDParser(tokens);
        parser.setSalida(new JTextArea()); // output is not used here
        parser.setCopJava(new JTextArea()); // output is not used here

        entrada.getHighlighter().removeAllHighlights();
        Compilar.setEnabled(true);

        try {
            parser.inicio();
        } catch (RuntimeException | RecognitionException ex) {
            if (ex.getCause() instanceof RecognitionException) {
                RecognitionException re = (RecognitionException) ex.getCause();
                try {
                    int errorOffset = re.index;
                    int length = tokens.size() > errorOffset ? tokens.getTokens().get(errorOffset).getText().length() : 1;
                    entrada.getHighlighter().addHighlight(errorOffset, errorOffset + length, errorPainter);
                    Compilar.setEnabled(false);
                } catch (BadLocationException ble) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ble);
                }
            }
        }
    }

    public String AbrirArchivo(File archivo) {
        String documento = "";
        try {
            entrada1 = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada1.read()) != -1) {
                char caracter = (char) ascci;
                documento += caracter;
            }
        } catch (Exception e) {
        }
        return documento;
    }

    public String GuardarArchivo(File archivo, String documento) {
        String mensaje = null;
        try {
            salida1 = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();
            salida1.write(bytxt);
            mensaje = "Archivo guardado";
        } catch (Exception e) {
        }
        return mensaje;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        entrada = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        salida = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        Compilar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        copJava = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        codigo = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        ayuda = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        jMenu3.setText("jMenu3");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenuItem9.setText("jMenuItem9");

        jMenuItem10.setText("jMenuItem10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entrada.setColumns(20);
        entrada.setRows(5);
        jScrollPane1.setViewportView(entrada);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 370, 360));

        salida.setColumns(20);
        salida.setRows(5);
        jScrollPane2.setViewportView(salida);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 340, 360));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setText("CODIGO NATURAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Generador de Codigo SQL / Generador codigo JAVA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1480, -1));

        Limpiar.setText("LIMPIAR");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 100, -1));

        Compilar.setText("COMPILAR");
        Compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompilarActionPerformed(evt);
            }
        });
        getContentPane().add(Compilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 100, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setText("CODIGO JAVA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 80, -1, -1));

        copJava.setColumns(20);
        copJava.setRows(5);
        jScrollPane3.setViewportView(copJava);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 570, 130));

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, -1, -1));

        codigo.setColumns(20);
        codigo.setRows(5);
        jScrollPane4.setViewportView(codigo);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 250, 570, 220));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel4.setText("CODIGO SQL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Cargar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Guardar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exportar");

        jMenuItem3.setText("MySql");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Tema");

        jMenuItem5.setText("ModoClaro");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Modo Oscuro");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Modo Fusia");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Modo Naranja");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        ayuda.setText("Información");
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });

        jMenuItem11.setText("Como funciona");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        ayuda.add(jMenuItem11);

        jMenuItem12.setText("Integrantes");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        ayuda.add(jMenuItem12);

        jMenuItem13.setText("Exportar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        ayuda.add(jMenuItem13);

        jMenuBar1.add(ayuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        entrada.setText("");
        salida.setText("");
        copJava.setText("");
        codigo.setText("");
        entrada.getHighlighter().removeAllHighlights();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void CompilarActionPerformed(java.awt.event.ActionEvent evt) {
        ANTLRInputStream input = null;
        String s = entrada.getText();
        StringBufferInputStream str = new StringBufferInputStream(s);

        try {
            input = new ANTLRInputStream(str);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        TgramaticaReconoceLengBDLexer lexer = new TgramaticaReconoceLengBDLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TgramaticaReconoceLengBDParser parser = new TgramaticaReconoceLengBDParser(tokens);
        parser.setSalida(salida);
        parser.setCopJava(copJava);

        try {
            parser.inicio();
        } catch (RecognitionException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(seleccionar.showDialog(null, "Abrir")==JFileChooser.APPROVE_OPTION){
            archivo=seleccionar.getSelectedFile();
            if(archivo.canRead()){
                if(archivo.getName().endsWith("txt")){
                    String documento=AbrirArchivo(archivo);
                    entrada.setText(documento);
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if(seleccionar.showDialog(null, "Guardar")==JFileChooser.APPROVE_OPTION){
            archivo=seleccionar.getSelectedFile();
            if(archivo.getName().endsWith("txt")){
                String Documento=salida.getText();
                String mensaje=GuardarArchivo(archivo, Documento);
                if(mensaje!=null){
                    JOptionPane.showMessageDialog(null, mensaje);
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Guardar documento de texto");
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        String url = "jdbc:mysql://localhost:3306/?serverTimezone=America/Mexico_City";
        String usuario = "root";
        String contraseña = "";

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement stmt = conexion.createStatement();

            // Obtén el código SQL del área de texto "salida"
            String sql = salida.getText();
            String[] sqlStatements = sql.split(";");

            for (String declaracion : sqlStatements) {
                if (!declaracion.trim().isEmpty()) {
                    stmt.executeUpdate(declaracion.trim() + ";");
                }
            }

            // Cierra la conexión
            stmt.close();
            conexion.close();

            JOptionPane.showMessageDialog(null, "Base de datos creada con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            // Cambia el tema aquí, puedes usar el tema de tu elección
            UIManager.setLookAndFeel(new FlatAtomOneLightIJTheme()); // Por ejemplo, cambia a FlatLightLaf

            // Aplica el nuevo tema a la ventana
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {
            // Cambia el tema aquí, puedes usar el tema de tu elección
            UIManager.setLookAndFeel(new FlatOneDarkIJTheme()); // Por ejemplo, cambia a FlatLightLaf

            // Aplica el nuevo tema a la ventana
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed

    }//GEN-LAST:event_ayudaActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        JOptionPane.showMessageDialog(null, "El lenguaje natural se maneja en español, es decir, se escriben palabras clave en español y estas se interpretan por medio del copilador, un ejemplo claro es el siguiente:\n" +
                "\n" +
                "crear empresa   -> crear es la palabra clave para el CREAT DATABASE en sql y empresa, el nombre de dicha base de datos.\n" +
                "usar empresa -> equivale a USE empresa, usar la base de datos que se creó.\n" +
                "tabla depto -> equivale al CREATE TABLE depto, crea la tabla dentro de la base de datos.\n" +
                "Inicio -> esta palabra inicia el arreglo de atributos dentro de la tabla\n" +
                "Fin -> es el viceversa de inicio, aquí damos por terminado el arreglo de la tabla, es decir, terminamos los atributos de la tabla que estamos usando/declarando\n" +
                "Después de declara los atributos con las palabras: \n" +
                "Letras-> que equivale a VARCHAR(200)\n" +
                "Numeros-> equivale a INT\n" +
                "Decimal-> equivale a Decimal(10,2)\n" +
                "Foranea-> equivale a FOREIGN KEY\n" +
                "Cerrar-> termina y cierra la declaración de toda la base de datos.");
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        try {
            // Cambia el tema aquí, puedes usar el tema de tu elección
            UIManager.setLookAndFeel(new FlatGradiantoDarkFuchsiaIJTheme()); // Por ejemplo, cambia a FlatLightLaf

            // Aplica el nuevo tema a la ventana
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        try {
            // Cambia el tema aquí, puedes usar el tema de tu elección
            UIManager.setLookAndFeel(new FlatArcOrangeIJTheme()); // Por ejemplo, cambia a FlatLightLaf

            // Aplica el nuevo tema a la ventana
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        JOptionPane.showMessageDialog(null,
                "Montoya Montes de Oca Angel Moises.\n"+
                        "Calderon Sastre Leonardo\n");
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Una vez que se selecciona exportar, se hace la conexion a WorkBench para crear la base de datos automaticamente, para ver dicha base de datos, puedes abrir phpMyAdmin o el mismo MySQL Workbench");
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String text = copJava.getText();
        String dbName = "";
        String[] lines = text.split("\n");
        for (String line : lines) {
            if (line.startsWith("NOMBRE DE LA BASE DE DATOS")) {
                dbName = line.substring("NOMBRE DE LA BASE DE DATOS".length()).trim();
                if (dbName.endsWith(";")) {
                    dbName = dbName.substring(0, dbName.length() - 1);
                }
                break;
            }
        }
        if (dbName.isEmpty()) {
            System.err.println("No se encontró el nombre de la base de datos en el texto.");
        }
        String javaCode = "import java.awt.GridLayout;\n" +
                "import javax.swing.JTextField;\n" +
                "import javax.swing.JFrame;\n" +
                "import javax.swing.JLabel;\n" +
                "import javax.swing.JButton;\n" +
                "import javax.swing.JOptionPane;\n" +
                "import java.awt.event.ActionEvent;\n" +
                "import java.awt.event.ActionListener;\n" +
                "import java.sql.Connection;\n" +
                "import java.sql.DriverManager;\n" +
                "import java.sql.PreparedStatement;\n" +
                "import java.sql.ResultSet;\n" +
                "import java.sql.SQLException;\n" +
                "import java.util.logging.Level;\n" +
                "import java.util.logging.Logger;\n" +
                "\n" +
                "public class Principal {\n" +
                "    public static void main(String args[]) throws SQLException {\n" +
                "final Connection connection;\n" +
                "connection = DriverManager.getConnection(\"jdbc:mysql://localhost:3306/"+dbName+"\", \"root\", \"\");\n";
        String tableName = "";
        int tableCount = 0;
        int attributeCount = 0;
        String attributeNames = "";
        for (String line : lines) {
            if (line.startsWith("Nombre de la tabla: ")) {
                if (tableCount > 0) {
                    javaCode += "                JButton btn" + tableCount + " = new JButton(\"Agregar\");\n";
                    javaCode += "                btn" + tableCount + ".addActionListener(new ActionListener() {\n";
                    javaCode += "                    @Override\n";
                    javaCode += "                    public void actionPerformed(ActionEvent e) {\n";
                    for (int i = 1; i <= attributeCount; i++) {
                        javaCode += "                        String atributo" + i + " = tf" + tableCount + i + ".getText();\n";
                    }
                    javaCode += "                        try {\n";
                    javaCode += "                            String query = \"INSERT INTO " + tableName + " (" + attributeNames + ") VALUES (";
                    for (int i = 1; i <= attributeCount; i++) {
                        javaCode += "?";
                        if (i < attributeCount) {
                            javaCode += ", ";
                        }
                    }
                    javaCode += ")\";\n";
                    javaCode += "                            PreparedStatement preparedStmt = connection.prepareStatement(query);\n";
                    for (int i = 1; i <= attributeCount; i++) {
                        javaCode += "                            preparedStmt.setString(" + i + ", atributo" + i + ");\n";
                    }
                    javaCode += "                            preparedStmt.execute();\n";
                    javaCode += "                            JOptionPane.showMessageDialog(null, \"Inserción exitosa\");\n";
                    javaCode += "                        } catch (SQLException ex) {\n";
                    javaCode += "                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);\n";
                    javaCode += "                        }\n";
                    javaCode += "                    }\n";
                    javaCode += "                });\n";
                    javaCode += "                JButton btnEliminar" + tableCount + " = new JButton(\"Eliminar todo\");\n";
                    javaCode += "                btnEliminar" + tableCount + ".addActionListener(new ActionListener() {\n";
                    javaCode += "                    @Override\n";
                    javaCode += "                    public void actionPerformed(ActionEvent e) {\n";
                    javaCode += "                        try {\n";
                    javaCode += "                            String query = \"DELETE FROM " + tableName + "\";\n";
                    javaCode += "                            PreparedStatement preparedStmt = connection.prepareStatement(query);\n";
                    javaCode += "                            preparedStmt.execute();\n";
                    javaCode += "                            JOptionPane.showMessageDialog(null, \"Eliminación exitosa\");\n";
                    javaCode += "                        } catch (SQLException ex) {\n";
                    javaCode += "                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);\n";
                    javaCode += "                        }\n";
                    javaCode += "                    }\n";
                    javaCode += "                });\n";
                    javaCode += "                v" + tableCount + ".add(btnEliminar" + tableCount + ");\n";
                    javaCode += "                v" + tableCount + ".add(btn" + tableCount + ");\n";
                    javaCode += "                v" + tableCount + ".pack();\n";
                    javaCode += "                v" + tableCount + ".setLocationRelativeTo(null);\n";
                    javaCode += "                v" + tableCount + ".setVisible(true);\n";
                }
                tableCount++;
                attributeCount = 0;
                attributeNames = "";
                tableName = line.substring("Nombre de la tabla: ".length());
                javaCode += "            JFrame v" + tableCount + " = new JFrame(\"" + tableName + "\");\n";
                javaCode += "            v" + tableCount + ".setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n";
                javaCode += "            v" + tableCount + ".setSize(600,400);\n";
                javaCode += "            GridLayout lay" + tableCount + " = new GridLayout(7,2);\n";
                javaCode += "            v" + tableCount + ".setLayout(lay" + tableCount + ");\n";
            } else if (line.startsWith("Atributo: ")) {
                attributeCount++;
                String attributeName = line.substring("Atributo: ".length(), line.indexOf("Tipo de Atributo:") - 1);
                javaCode += "            JLabel lbl" + tableCount + attributeCount + " = new JLabel(\"Digita " + attributeName + "\");\n";
                javaCode += "            v" + tableCount + ".add(lbl" + tableCount + attributeCount + ");\n";
                javaCode += "            JTextField tf" + tableCount + attributeCount + " = new JTextField();\n";
                javaCode += "            v" + tableCount + ".add(tf" + tableCount + attributeCount + ");\n";
                if (attributeCount == 1) {
                    attributeNames += attributeName;
                } else {
                    attributeNames += ", " + attributeName;
                }
            }
        }
        javaCode += "                JButton btn" + tableCount + " = new JButton(\"Agregar\");\n";
        javaCode += "                btn" + tableCount + ".addActionListener(new ActionListener() {\n";
        javaCode += "                    @Override\n";
        javaCode += "                    public void actionPerformed(ActionEvent e) {\n";
        for (int i = 1; i <= attributeCount; i++) {
            javaCode += "                        String atributo" + i + " = tf" + tableCount + i + ".getText();\n";
        }
        javaCode += "                        try {\n";
        javaCode += "                            String query = \"INSERT INTO " + tableName + " (" + attributeNames + ") VALUES (";
        for (int i = 1; i <= attributeCount; i++) {
            javaCode += "?";
            if (i < attributeCount) {
                javaCode += ", ";
            }
        }
        javaCode += ")\";\n";
        javaCode += "                            PreparedStatement preparedStmt = connection.prepareStatement(query);\n";
        for (int i = 1; i <= attributeCount; i++) {
            javaCode += "                            preparedStmt.setString(" + i + ", atributo" + i + ");\n";
        }
        javaCode += "                            preparedStmt.execute();\n";
        javaCode += "                            JOptionPane.showMessageDialog(null, \"Inserción exitosa\");\n";
        javaCode += "                        } catch (SQLException ex) {\n";
        javaCode += "                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);\n";
        javaCode += "                        }\n";
        javaCode += "                    }\n";
        javaCode += "                });\n";
        javaCode += "                JButton btnEliminar" + tableCount + " = new JButton(\"Eliminar todo\");\n";
        javaCode += "                btnEliminar" + tableCount + ".addActionListener(new ActionListener() {\n";
        javaCode += "                    @Override\n";
        javaCode += "                    public void actionPerformed(ActionEvent e) {\n";
        javaCode += "                        try {\n";
        javaCode += "                            String query = \"DELETE FROM " + tableName + "\";\n";
        javaCode += "                            PreparedStatement preparedStmt = connection.prepareStatement(query);\n";
        javaCode += "                            preparedStmt.execute();\n";
        javaCode += "                            JOptionPane.showMessageDialog(null, \"Eliminación exitosa\");\n";
        javaCode += "                        } catch (SQLException ex) {\n";
        javaCode += "                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);\n";

        javaCode += "                        }\n";
        javaCode += "                    }\n";
        javaCode += "                });\n";
        javaCode += "                v" + tableCount + ".add(btnEliminar" + tableCount + ");\n";
        javaCode += "                v" + tableCount + ".add(btn" + tableCount + ");\n";
        javaCode += "                v" + tableCount + ".pack();\n";
        javaCode += "                v" + tableCount + ".setLocationRelativeTo(null);\n";
        javaCode += "                v" + tableCount + ".setVisible(true);\n";
        javaCode += "            }\n";
        javaCode += "        }\n";

        codigo.setText(javaCode);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MySQLLActionPerformed(java.awt.event.ActionEvent evt ) {

    }

    private void GuardarLActionPerformed(java.awt.event.ActionEvent evt ) {
        // TODO add your handling code here:
    }

    private void CargarLActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel( new FlatDarkPurpleIJTheme());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Compilar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JMenu ayuda;
    private javax.swing.JTextArea codigo;
    private javax.swing.JTextArea copJava;
    private javax.swing.JTextArea entrada;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea salida;
    // End of variables declaration//GEN-END:variables
}
