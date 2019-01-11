/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.apusController;
import controlador.presupuestoController;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.Apus;
import modelo.Presupuesto;

/**
 *
 * @author personal1
 */
public class FrmDocumentos extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmDocumentos
     */
    private apusController ctrApus = new apusController();
    private presupuestoController ctrPres = new presupuestoController();

    // rutas donde estan los archivos
    private String pathFileApus = System.getProperty("user.dir") + "\\resource\\fileApus\\";
    private String pathFilePresupuesto = System.getProperty("user.dir") + "\\resource\\filePresupuesto\\";
    JFileChooser selecArchivo = new JFileChooser();

    public FrmDocumentos() {
        initComponents();
        setIconifiable(true);
        setTitle("Documentos / Sistema");
        setTablesNoMoveHeader();
        setLlenarDatosTbl();
        
        setTblManual();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Documentos de APUS, PRESUPUESTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Filtro:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 40, -1, -1));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 37, 367, -1));

        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 11, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " APUS / Presupuestos  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Empresa", "Proyecto", "APUS", "Presupuestos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(45);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(45);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(45);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 60, 540, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 63, 570, 320));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Presupuestos Manuales  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Presupuesto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(45);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(45);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(45);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 370, 250));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 63, 390, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        home.activoDocumentos = false;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String txt = "";
        // cuando es click en [3]
        int column = jTable1.getSelectedColumn();
        //System.out.println("column "+column);
        int position = jTable1.getSelectedRow();
        if (column == 3) {
            txt = jTable1.getValueAt(position, 3).toString();
            //System.out.println("txt3 " + txt);
            if (txt.length() > 0) {
                // ultimo necesito el id de presupúesto                
                getExportFile(pathFileApus + txt); // txt :: la ruta
            }
        } else if (column == 4) {
            txt = jTable1.getValueAt(position, 4).toString();
            //System.out.println("txt4 " + txt);
            if (txt.length() > 0) {
                getExportFile(pathFilePresupuesto + txt);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        String txt = "";
        // cuando es click en [1]
        int column = jTable2.getSelectedColumn();
        //System.out.println("column "+column);
        int position = jTable2.getSelectedRow();
        if (column == 1) {
            txt = jTable2.getValueAt(position, 1).toString();
            //System.out.println("txt3 " + txt);
            if (txt.length() > 0) {
                // ultimo necesito el id de presupúesto                
                getExportFile(pathFilePresupuesto + txt); // txt :: la ruta
            }
        } 
    }//GEN-LAST:event_jTable2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmDocumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDocumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDocumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDocumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDocumentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    // hacer que cabecera se quede fija y columnas alineadas a la derecha
    private void setTablesNoMoveHeader() {
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
    }

    // limpiar tabla
    private void limpiarTabla() {
        DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
        model1.setRowCount(0);
    }

    private void limpiarTablaManual() {
        DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
        model1.setRowCount(0);
    }

    // cargamos los datos de apus
    private void setLlenarDatosTbl() {
        int rows = jTable1.getRowCount();
        if (rows > 0) {
            limpiarTabla();
        }
        List<Apus> listApus = ctrApus.getApusAll();
        List<Presupuesto> listPresupuesto = null;

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        for (Apus listApu : listApus) {
            //Sección 2
            Object[] fila = new Object[5];
            //Sección 3
            fila[0] = listApu.getId(); // Id apus
            fila[1] = listApu.getEmpresa(); // Empresa
            fila[2] = listApu.getProyecto(); // Proyect
            fila[3] = listApu.getUrl_file(); // Apus

            listPresupuesto = ctrPres.getPresupuestoByID_Apus(listApu.getId());
            if (listPresupuesto.isEmpty()) {
                fila[4] = "";
                // Sección 4
                modelo.addRow(fila);
            }
            int j = 0;
            for (Presupuesto presupuesto : listPresupuesto) {
                if (j == 0) {
                    fila[4] = presupuesto.getUrl_file();
                } else {
                    fila = new Object[5];
                    fila[0] = "";
                    fila[1] = "";
                    fila[2] = "";
                    fila[3] = "";
                    fila[4] = presupuesto.getUrl_file();
                }
                j++;
                //Sección 4
                modelo.addRow(fila);
            }
        }
        //Sección 5
        jTable1.setModel(modelo);
    }

    private void getExportFile(String file) {
        //selecArchivo.setSelectedFile(new File(file));
        if (selecArchivo.showDialog(null, "Descargar") == JFileChooser.APPROVE_OPTION) {
            //archivo = selecArchivo.getSelectedFile();
            String pathSalida = selecArchivo.getSelectedFile().getAbsolutePath() + ".xlsx";
            //System.out.println("entrada  " + file);
            //System.out.println("salida  " + pathSalida);
            File archivoOrigen; // archivo de entrada
            File archivoDestino;
            FileInputStream in = null;
            FileOutputStream out = null;
            boolean b;
            try {
                archivoOrigen = new File(file);
                archivoDestino = new File(pathSalida);

                /**
                 * Validamos que el archivo de origen exista. En caso de que no
                 * exista saldremos del método
                 */
                if (b = archivoOrigen.exists()) {
                    /**
                     * Validamos que el archivo de origen se pueda leer
                     */
                    if (b = archivoOrigen.canRead()) {
                        /**
                         * Creamos el lector y el escritor
                         */
                        in = new FileInputStream(archivoOrigen);
                        out = new FileOutputStream(archivoDestino);

                        /**
                         * Mientras se lee de un lado por otro lado se escribe
                         */
                        int c;
                        while ((c = in.read()) != -1) {
                            out.write(c);
                        }
                    }
                }
                // mensaje de confirmacion (exito)
                JOptionPane.showMessageDialog(null, "Archivo Descargado con exito");
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }

            } catch (Exception e) {
                System.out.println("error " + e.getMessage());
            }
        }
    }

    private void setTblManual() {
        if (jTable2.getRowCount() > 0) {
            limpiarTablaManual();
        }
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        List<Presupuesto> listPresupuesto = ctrPres.getPresupuestoByID_Manual();
        for (Presupuesto presupuesto : listPresupuesto) {
            //Sección 2
            Object[] fila = new Object[5];
            //Sección 3
            fila[0] = presupuesto.getId(); // Id apus
            fila[1] = presupuesto.getUrl_file(); // Empresa

            //Sección 4
            modelo.addRow(fila);
        }
        //Sección 5
        jTable2.setModel(modelo);
    }
    
}
