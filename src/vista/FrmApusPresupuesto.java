/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.EsquemaPresupuesto;
import modelo.EsquemaPresupuestoManual;
import modelo.EsquemaPresupuestoManual.tableDts;
import modelo.FormatoApus;
import org.apache.poi.ss.usermodel.Workbook;
import sun.swing.table.DefaultTableCellHeaderRenderer;
import util.validaciones;

/**
 *
 * @author Jonathan
 */
public class FrmApusPresupuesto extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmApusPresupuesto
     */
    // variable para caracter
    private Character kpress;

    // instancia de validaciones
    final private validaciones validacion;

    // variables para exportar contenido a excel
    JFileChooser selecArchivo = new JFileChooser();
    File archivo;
    Workbook wb;

    public FrmApusPresupuesto() {
        validacion = new validaciones();
        initComponents();
        setTitle("Presupuesto / Oferta");
        setIconifiable(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField9 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextField1.setText("PARQUE ACUATICO DE MILAGRO");

        jTextField2.setText("MALECON DEL VELERO");

        jTextField3.setText("INGENIERIA HIDROSANITARIA");

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField4.setText("OFERTA: INGEHISA");

        jTextField5.setText("Guayaquil, ");

        jTextField6.setText("jTextField6");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("SUBTOTAL");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("IVA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("TOTAL");

        jTextField7.setText("jTextField7");

        jTextField8.setText("jTextField8");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nota: En esta oferta no se incluye lo siguiente:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(456);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(456);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(456);
        }

        jTextField9.setText("0");
        jTextField9.setPreferredSize(new java.awt.Dimension(21, 20));
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Calcular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Generar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "RUBRO", "UNIDAD", "CANTIDAD", "PRECIO UNIT", "PRECIO TOT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(40);
            table.getColumnModel().getColumn(0).setPreferredWidth(40);
            table.getColumnModel().getColumn(0).setMaxWidth(55);
            table.getColumnModel().getColumn(1).setMinWidth(480);
            table.getColumnModel().getColumn(1).setPreferredWidth(480);
            table.getColumnModel().getColumn(1).setMaxWidth(480);
            table.getColumnModel().getColumn(2).setMinWidth(60);
            table.getColumnModel().getColumn(2).setPreferredWidth(60);
            table.getColumnModel().getColumn(2).setMaxWidth(60);
            table.getColumnModel().getColumn(3).setMinWidth(70);
            table.getColumnModel().getColumn(3).setPreferredWidth(70);
            table.getColumnModel().getColumn(3).setMaxWidth(70);
            table.getColumnModel().getColumn(4).setMinWidth(90);
            table.getColumnModel().getColumn(4).setPreferredWidth(90);
            table.getColumnModel().getColumn(4).setMaxWidth(90);
            table.getColumnModel().getColumn(5).setMinWidth(90);
            table.getColumnModel().getColumn(5).setPreferredWidth(90);
            table.getColumnModel().getColumn(5).setMaxWidth(90);
        }

        jButton5.setText("--");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(3, 3, 3)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2)
                                .addComponent(jButton5))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        FrmApus.activoFrmResumen = false;
        home.activoFrmResumen = false;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed
        // table Calculo keyPress tabla Resumen
        kpress = evt.getKeyChar();
        if (kpress == KeyEvent.VK_ENTER) {
            setEventTableResumenPresupuesto();

            /*int position = table.getSelectedRow();
            table.setRowHeight(position, 50);
            String dto = table.getValueAt(position, 1).toString();
            table.setValueAt( dto + "<br>", position, 1);*/
        }// fin keyPress
    }//GEN-LAST:event_tableKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // AGREGO NUEVA CELDA EN BLANCO
        // aqui la consulta
        //Sección 1 
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        //Sección 2
        Object[] fila = new Object[6];
        //Sección 3
        fila[0] = " ";
        fila[1] = " ";
        fila[2] = " ";
        fila[3] = "0";
        fila[4] = "0.0";
        fila[5] = "0.0";
        //Sección 4
        modelo.addRow(fila);
        //Sección 5
        table.setModel(modelo);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // pensar como hacer el for de la tabla
        calTableSubTot();
        calIvaAndTot();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        // accion de iva
        kpress = evt.getKeyChar();
        if (kpress == KeyEvent.VK_ENTER) {
            calIvaAndTot();
        }
    }//GEN-LAST:event_jTextField9KeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Eliminar un registro
        //Sección 1
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        //Sección 2
        int position = table.getSelectedRow();
        //Sección 3
        if (position < 0) {
            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar una fila de la tabla");
        } else {
            //Sección 4
            int confirmar = JOptionPane.showConfirmDialog(null,
                    "Esta seguro que desea Eliminar el registro? ");
            //Sección 5 
            if (JOptionPane.OK_OPTION == confirmar) {
                //Sección 6
                model.removeRow(position);
                //Sección 7
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //METODO EXPORTAR PRESUPUESTO / OFERTA :_: MANUALMENTE
        if (selecArchivo.showDialog(null, "Exportar") == JFileChooser.APPROVE_OPTION) {
            archivo = selecArchivo.getSelectedFile();
            if (archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")) {
                //Cambia con el nombre de tu JTABLE
                // List<FormatoApus> datos = getSquemaExport();  PENSAR
                //JOptionPane.showMessageDialog(null, Exportar(archivo, datos) + "\n Formato ." + archivo.getName().substring(archivo.getName().lastIndexOf(".") + 1));
            } else {
                JOptionPane.showMessageDialog(null, "Elija un formato valido.");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmApusPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmApusPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmApusPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmApusPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmApusPresupuesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    // hacer que cabecera se quede fija y columnas alineadas a la derecha
    private void setTablesNoMoveHeader() {
        table.getTableHeader().setReorderingAllowed(false);

        DefaultTableCellRenderer cellRenderer = new DefaultTableCellHeaderRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.RIGHT);
        // table 2 al 5
        for (int i = 2; i < 6; ++i) {
            table.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
            table.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }

        // no editable        
        /*table.setModel(new DefaultTableModel(){
            final boolean [] tableColums = {true, true, false, false,false,false};
            @Override
            public boolean isCellEditable(int i, int column) {   
                return this.tableColums[column]; 
            }
        });*/
    }

    // limpiar tabla
    private void limpiarTabla() {
        DefaultTableModel model1 = (DefaultTableModel) table.getModel();
        model1.setRowCount(0);
    }

    // agrego los datos
    public void llenarTabla(List<EsquemaPresupuesto> dto) {
        // pongo las columnas fijas y no editable
        setTablesNoMoveHeader();
        int sizeRowCountTable = table.getRowCount();
        if (sizeRowCountTable > 0) {
            limpiarTabla();
        }//Sección 1 
        /*DefaultTableModel modelo1 = (DefaultTableModel) table.getModel();
        String l[] = {"NO","DESCRIPCION","UNIDAD","CANTIDAD","PRECIO UNITARIO","PRECIO TOTAL"};
        modelo1.addColumn(l);*/

        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        //String l[] = {"NO","DESCRIPCION","UNIDAD","CANTIDAD","PRECIO UNITARIO","PRECIO TOTAL"};
        //modelo.addColumn(l);

        for (EsquemaPresupuesto esquemaPresupuesto : dto) {
            //Sección 2
            Object[] fila = new Object[6];
            //Sección 3
            fila[0] = esquemaPresupuesto.getCodigo(); // descripcion
            fila[1] = esquemaPresupuesto.getRubro(); // unidad
            fila[2] = esquemaPresupuesto.getUnidad(); // cantidad
            fila[3] = esquemaPresupuesto.getCantidad(); // tarifa (vacio)
            fila[4] = esquemaPresupuesto.getPreUnit(); // cost unit (vacio)
            fila[5] = esquemaPresupuesto.getPreTotM(); // cost unit (vacio)
            //Sección 4
            modelo.addRow(fila);
        }
        //Sección 5
        table.setModel(modelo);

    }

    private void setEventTableResumenPresupuesto() {
        int sizeRows = table.getRowCount();
        if (sizeRows > 0) {
            // vamos a calcular precio total
            int position = table.getSelectedRow();
            // traigo valor de cantidad [3]
            String cant = table.getValueAt(position, 3).toString();
            if (!cant.equals("")) { // columna cantidad no nula
                int cantAux = validacion.soloNumero(cant);
                // R:[5]  = [3] * [4]
                double precUnit = validacion.solomoney(table.getValueAt(position, 4).toString());
                table.setValueAt(String.valueOf(precUnit), position, 4); // pongo el valor de validaciones

                double presiTot = (double) Math.round((cantAux * precUnit) * 100d) / 100d; // solo 2 decimales
                table.setValueAt(String.valueOf(presiTot), position, 5); //R: pongo el valor 

                table.setValueAt(String.valueOf(cantAux), position, 3); // pongo el valor de validaciones

                setDatosFrmApusWithPresupuestp();
                calTableSubTot();

            }// verificacion de columna cantidad no nula   
        }
    }

    //funcion de calculo Sutbtotal
    private void calTableSubTot() {
        int sizeRows = table.getRowCount();
        if (sizeRows > 0) {
            double acumSubTot = 0;
            for (int position = 0; position < sizeRows; ++position) {
                // vamos a calcular precio total
                //position = table.getSelectedRow();
                // traigo valor de cantidad [3]
                String cant = table.getValueAt(position, 3).toString();
                if (!cant.equals("")) { // columna cantidad no nula
                    int cantAux = validacion.soloNumero(cant);
                    // R:[5]  = [3] * [4]
                    double precUnit = validacion.solomoney(table.getValueAt(position, 4).toString());
                    table.setValueAt(String.valueOf(precUnit), position, 4); // pongo el valor de validaciones

                    double presiTot = (double) Math.round((cantAux * precUnit) * 100d) / 100d; // solo 2 decimales
                    table.setValueAt(String.valueOf(presiTot), position, 5); //R: pongo el valor 
                    table.setValueAt(String.valueOf(cantAux), position, 3); // pongo el valor de validaciones

                    acumSubTot += presiTot;

                }// verificacion de columna cantidad no nula   

            }
            // devuelve el subtotal
            jTextField6.setText(String.valueOf(acumSubTot));
        }
    }

    // funcion que desabilita componentes --> claro si viene la orden de apus
    public void setClickResumenApus() {
        jPanel1.setVisible(false);
        jTextField4.setVisible(false);
        jButton2.setVisible(false);
        jTextField5.setVisible(false);
    }

    private void calIvaAndTot() {
        // valor IVA
        int iva = validacion.soloNumero(jTextField9.getText());
        System.out.println("iva " + iva);
        jTextField9.setText(String.valueOf(iva));

        // valor de subtotal
        double subTot = validacion.solomoney(jTextField6.getText());
        System.out.println("subTot " + subTot);
        // donde va el valor de calIva = iva * subtotal
        double iva1 = Double.parseDouble(jTextField9.getText()) / 100;
        System.out.println("iva /100 " + iva1);
        double calIva = (double) Math.round(((iva1) * subTot) * 100d) / 100d;
        System.out.println("calIva " + calIva);
        jTextField7.setText(String.valueOf(calIva));

        // colocamos el valor total
        double presiTot = (double) Math.round((subTot + calIva) * 100d) / 100d; // solo 2 decimales
        jTextField8.setText(String.valueOf(presiTot));

        setDatosFrmApusWithPresupuestp();
    }

    private void setDatosFrmApusWithPresupuestp() {
        String[] ss = new String[3];
        ss[0] = jTextField1.getText();
        ss[1] = jTextField2.getText();
        ss[2] = jTextField3.getText();

        FrmApus.auxT = ss;
    }

    // ESQUEMA LISTA DEL PRESUPUESTO MAMUAL
    private EsquemaPresupuestoManual getEsquemaPresupuestoManual() {
        // clase MAIN
        EsquemaPresupuestoManual aux = null;

        // clase para almacenar los datos de la tabla
        List<tableDts> dt = new ArrayList<>();
        // entidad de la lista  *** crear otra clase aparte para saltar el error
        //tableDts entity = new tableDts();
        
        
        // atributo para almacenar cuantos registros hay en la tabla
        int sizeColumRows = table.getColumnCount();
        for (int i = 0; i < sizeColumRows; ++i) {
          //  entity = new  tableDts();
            
            //entity = null;
        }

        return aux;
    }
    // EXPORTAR PRESUPUESTO / OFERTA :::: MANUALMENTE
    // LOGICA:: ACUMULADOR DE NUMERACION
    //       :: VERIFICAR SI EL DATO DE DESCRIPCION ES UN SUBTITULO
    //       :: NO PONER VALOR EN SI ES EN SUBTITULO

}
