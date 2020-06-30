package analizador_lexico_jflex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adrian
 */
public class Jflex extends javax.swing.JFrame {
    String tituloPanel="Sin titulo";
    
    
    public Jflex() {
        initComponents();
        this.setLocationRelativeTo(null);                   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textSalida = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        container = new javax.swing.JTabbedPane();
        pn_tab = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textEntrada = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbResultados = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador léxico Java");
        setResizable(false);

        jPanel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jScrollPane1.setBorder(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(555, 172));

        textSalida.setEditable(false);
        textSalida.setColumns(20);
        textSalida.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        textSalida.setForeground(new java.awt.Color(0, 0, 255));
        textSalida.setRows(5);
        textSalida.setBorder(null);
        jScrollPane1.setViewportView(textSalida);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Salida", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new_file.png"))); // NOI18N
        jButton2.setToolTipText("Nuevo archivo");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setRequestFocusEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 7, 30, 27));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png"))); // NOI18N
        jButton3.setToolTipText("Analizar");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setRequestFocusEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 7, 30, 27));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 10, 20));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open.png"))); // NOI18N
        jButton4.setToolTipText("Abrir archivo");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setRequestFocusEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 7, 30, 27));

        pn_tab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pn_tab.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jScrollPane2.setBorder(null);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(555, 172));

        textEntrada.setColumns(20);
        textEntrada.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        textEntrada.setRows(5);
        textEntrada.setAlignmentX(0.0F);
        textEntrada.setAlignmentY(0.0F);
        textEntrada.setBorder(null);
        jScrollPane2.setViewportView(textEntrada);

        javax.swing.GroupLayout pn_tabLayout = new javax.swing.GroupLayout(pn_tab);
        pn_tab.setLayout(pn_tabLayout);
        pn_tabLayout.setHorizontalGroup(
            pn_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1129, Short.MAX_VALUE)
        );
        pn_tabLayout.setVerticalGroup(
            pn_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );

        container.addTab("Sin titulo", pn_tab);

        tbResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Nombre", "Encontrado"
            }
        ));
        jScrollPane3.setViewportView(tbResultados);
        if (tbResultados.getColumnModel().getColumnCount() > 0) {
            tbResultados.getColumnModel().getColumn(0).setMinWidth(250);
            tbResultados.getColumnModel().getColumn(0).setPreferredWidth(250);
            tbResultados.getColumnModel().getColumn(0).setMaxWidth(250);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(container)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new_file.png"))); // NOI18N
        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open.png"))); // NOI18N
        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
                tituloPanel="Sin titulo";
                container.add(tituloPanel, pn_tab);
                textEntrada.setText("");
                textSalida.setText("");
                tbResultados.setModel(new DefaultTableModel(
                    new Object [][] {{null, null}},
                    new String [] {"Nombre", "Encontrado"}
                ));
                tablaSize();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        abrir_archivo();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        compilar(textEntrada.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        abrir_archivo();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jMenuItem1.doClick();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane container;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pn_tab;
    private javax.swing.JTable tbResultados;
    private javax.swing.JTextArea textEntrada;
    private javax.swing.JTextArea textSalida;
    // End of variables declaration//GEN-END:variables

    public void abrir_archivo(){
        String ruta = "", contenido="";
        JFileChooser file = new JFileChooser();
         FileNameExtensionFilter filtro = new FileNameExtensionFilter("Documentos (.*txt),(.*java),(.*jps)","txt","java","jps");
         file.setFileFilter(filtro);
         int resultado = file.showOpenDialog(this);
        
        if (resultado != JFileChooser.CANCEL_OPTION){
             ruta = file.getSelectedFile().getAbsolutePath().replace("\\", "/");

             FileReader fr = null;
	     BufferedReader entrada = null;
		try {
		    fr = new FileReader(ruta);
		    entrada = new BufferedReader(fr);
                    int i = 0;
                        while(entrada.ready()){
			       contenido += entrada.readLine()+"\n";
                               i++;
                        }
                 }catch(IOException e) {
			 e.printStackTrace();
		   }finally{
		      try{                    
			 if(null != fr){   
				fr.close();     
			  }                  
			}catch (Exception e2){ 
				e2.printStackTrace();
			}
		   }
                String[] nombre = ruta.split("/");
                tituloPanel = nombre[nombre.length-1];
                container.add(tituloPanel, pn_tab);
                textEntrada.setText(contenido);
        }//termina if
                
    }
    public void compilar(String contenido){
       int pr=0,id=0,ne=0,nd=0,sd=0,cm=0,cl=0,ca=0,oAND=0,oOR=0,oaMOD=0,oaSUMA=0,
            oaRESTA=0,oaMULTI=0,oaDIVI=0,oaAcento=0,orIgualdad=0,orMayor_que=0,orMenor_que=0,
            orMayor_igual_que=0,orMenor_igual_que=0,orDiferente=0,orNegación=0,asignacion=0,
            comilla_doble=0,apostrofe=0,parentesis_abierto=0,parentesis_cerrado=0,corchete_abierto=0,
            corchete_cerrado=0,llave_abierto=0,llave_cerrado=0,punto_y_coma=0,dos_puntos=0,punto=0,	
            coma=0;
        String informe= "";
        ArrayList<GestionaToken> lista = new ArrayList();
        
        try {
            BufferedReader reader = new BufferedReader(new BufferedReader(new StringReader(contenido)));
                Analizador analizador = new Analizador(reader);
                    while (true) {
                        GestionaToken gToken = analizador.yylex();
                        if (analizador.hayTokens()) {
                            String lexema = gToken.getLexema();
                            String token = gToken.getToken();                                                        
                            lista.add(gToken);
                            switch(token){
                                case "Palabra reservada": pr++; break; 
                                case "IDENTIFICADOR": id++; break; 
                                case "Número entero": ne++; break; 
                                case "Numero decimal": nd++; break; 
                                case "Simbolo desconocido": sd++; break; 
                                case "Comentario multilinea": cm++; break; 
                                case "Comentario de una linea": cl++; break; 
                                case "Cadena": ca++; break; 
                                case "AND": oAND++; break; 
                                case "OR": oOR++; break; 
                                case "MOD": oaMOD++; break; 
                                case "Suma": oaSUMA++; break; 
                                case "Resta": oaRESTA++; break; 
                                case "Multiplicación": oaMULTI++; break; 
                                case "División": oaDIVI++; break; 
                                case "Acento circunflejo": oaAcento++; break; 
                                case "Igualdad": orIgualdad++; break; 
                                case "Mayor que": orMayor_que++; break; 
                                case "Menor que": orMenor_que++; break; 
                                case "Mayor igual que": orMayor_igual_que++; break; 
                                case "Menor igual que": orMenor_igual_que++; break; 
                                case "Diferente": orDiferente++; break; 
                                case "Negación": orNegación++; break; 
                                case "Asignación": asignacion++; break; 
                                case "Comillas dobles": comilla_doble++; break; 
                                case "Apostrofe": apostrofe++; break; 
                                case "Paréntesis abierto": parentesis_abierto++; break; 
                                case "Paréntesis cerrado": parentesis_cerrado++; break; 
                                case "Corchete abierto": corchete_abierto++; break; 
                                case "Corchete cerrado": corchete_cerrado++; break; 
                                case "Llave abierta": llave_abierto++; break; 
                                case "Llave cerrada": llave_cerrado++; break; 
                                case "Punto y coma": punto_y_coma++; break; 
                                case "Dos puntos": dos_puntos++; break; 
                                case "Punto": punto++; break; 
                                case "Coma": coma++; break; 
                            }//termina switch
                            
                        } else {
                            break;
                        }//termina else
                    }//termina while                    
        } catch (FileNotFoundException ex) {
            System.err.println("No existe el archivo");
        } catch (IOException ex) {
            System.err.println("No se puede leer del archivo");
        } catch (Exception  ex) {
            //System.err.println("error");
        } 
        if(lista.size()>0){
            String[][] datos = new String[lista.size()][2];
            for (int i = 0; i < lista.size(); i++) {
                datos[i][1]= lista.get(i).getLexema();
                datos[i][0]= lista.get(i).getToken();
            }
            tbResultados.setModel(new DefaultTableModel(
                    datos,
                    new String [] {"Nombre", "Encontrado"}
                ));
            tablaSize();
        }else{
            tbResultados.setModel(new DefaultTableModel(
                    new Object [][] {{"No hay", "datos"}},
                    new String [] {"Nombre", "Encontrado"}
                ));
            tablaSize();
        }
         informe = "Archivo "+tituloPanel+" analizado correctamente.  "
                            + "\nInformes: "
                            + "\nEl analizador detecto los siguiente: "
                            + "\nPalabras reservadas: "+pr
                            + "\nIdentificadores: "+id
                            + "\nNúmeros enteros: "+ne
                            + "\nNúmeros decimales: "+nd
                            + "\nSímbolos desconocidos: "+sd
                            + "\nComentario multi-línea:  "+cm
                            + "\nComentario de una sola línea: "+cl
                            + "\nCadenas: "+ca
                            + "\nOperador LOGICO AND (&): "+oAND
                            + "\nOperador LOGICO OR (|): "+oOR
                            + "\nOperador ARITMETICO MOD (%): "+oaMOD
                            + "\nOperador ARITMETICO SUMA (+): "+oaSUMA
                            + "\nOperador ARITMETICO RESTA (-): "+oaRESTA
                            + "\nOperador ARITMETICO MULTIPLICACIÓN (*): "+oaMULTI
                            + "\nOperador ARITMETICO DIVISIÓN (/): "+oaDIVI
                            + "\nOperador ARITMETICO Acento circunflejo (^): "+oaAcento
                            + "\nOperador RELACIONAL Igualdad (==): "+orIgualdad
                            + "\nOperador RELACIONAL Mayor que (>): "+orMayor_que
                            + "\nOperador RELACIONAL Menor que (<): "+orMenor_que
                            + "\nOperador RELACIONAL Mayor igual que (>=): "+orMayor_igual_que
                            + "\nOperador RELACIONAL Menor igual que (<=): "+orMenor_igual_que
                            + "\nOperador RELACIONAL Diferente (!=): "+orDiferente
                            + "\nOperador RELACIONAL Negación (!): "+orNegación
                            + "\nSímbolo Asignación (=): "+asignacion
                            + "\nSímbolo Comilla doble (“): "+comilla_doble
                            + "\nSímbolo Apostrofe (‘): "+apostrofe
                            + "\nSímbolo Paréntesis abierto (: "+parentesis_abierto
                            + "\nSímbolo Paréntesis cerrado ): "+parentesis_cerrado
                            + "\nSímbolo Corchete abierto ([): "+corchete_abierto
                            + "\nSímbolo Corchete cerrado (]): "+corchete_cerrado
                            + "\nSímbolo Llave abierto ({): "+llave_abierto
                            + "\nSímbolo Llave cerrado (}): "+llave_cerrado
                            + "\nSímbolo Punto y coma (;): "+punto_y_coma
                            + "\nSímbolo Dos puntos (:): "+dos_puntos
                            + "\nSímbolo Punto (.): "+punto
                            + "\nSímbolo Coma (,): "+coma;
                    textSalida.setText(informe);
    }
    public void tablaSize(){
        if (tbResultados.getColumnModel().getColumnCount() > 0) {
            tbResultados.getColumnModel().getColumn(0).setMinWidth(250);
            tbResultados.getColumnModel().getColumn(0).setPreferredWidth(250);
            tbResultados.getColumnModel().getColumn(0).setMaxWidth(250);
        }
    }
}
