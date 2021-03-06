/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.clasificacionController;
import controlador.materialesController;
import controlador.proveedorController;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.paint.Material;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.Clasificacion;
import modelo.Materiales;
import modelo.MaterialesDto;
import modelo.Proveedor;
import util.validaciones;
import static vista.home.activoFrmIndirectoPoliza;
import static vista.home.escritorio;

/**
 *
 * @author personal
 */
public class FrmMateriales extends javax.swing.JInternalFrame {

    /**
     * Creates new form materiales
     */
    private FrmIndirectoPoliza frmIndirectoPoliza;
    private final String path_imagen = System.getProperty("user.dir") + "\\resourse\\img\\materiales\\";
    private String name = "";

    private materialesController ctrMaterial = new materialesController();
    private validaciones vali = new validaciones();
    private Materiales datos = null;

    // variable para caracter
    private Character kpress;

    JFileChooser file = null;
    private JPanel contentPane;
    File fichero = null;
    String imagen = "";
    private String rutaImagenSelect = "";

    private String path_ = System.getProperty("user.dir") + "\\resource\\img\\";
    private String pathSaveImage = System.getProperty("user.dir") + "\\resource\\img\\material\\";

    private String imagenEdit = "";

    public FrmMateriales() {
        initComponents();

        jRadioButton1.setSelected(true);
        setIconifiable(true);
        setTitle("Materiales");

        jTextField1.setEditable(false);
        jButton5.setEnabled(false);
        txtdescripcion.setLineWrap(true);
        txtdescripcion.setWrapStyleWord(true);

        //  llenamos cbo por default
        llenarCboClasificacion();
        llenarCboProveedor();

        // carga de datos default en la tabla
        setEsquemaTable();
        getIdSgt();

        setTableMaterialesAll();
        setImageDefault();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ingehisa.png"))); // NOI18N
        jLabel1.setText("INGEHISA / Materiales");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 40));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "  Gestion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Descripción");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Proveedor");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Clasificaión");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Precio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 160, -1));

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane1.setViewportView(txtdescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 340, 80));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 160, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 160, -1));

        jTextField2.setText("jTextField2");
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 160, -1));

        jTextField3.setText("jTextField3");
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 160, -1));

        jButton3.setText("Nuevo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Unidad");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "  Imagen  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Imagen");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 150, 120));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setText("Buscar Imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 10, 180, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 810, 190));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "  Consulta  / ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "id_clasificacion", "id_proveedor", "Empresa", "Clasificación", "Descripción", "Unidad", "Precio", "Imagen"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(5).setMinWidth(200);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(6).setMinWidth(60);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(60);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 778, 152));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 280, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Filtro");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 25, -1, -1));

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 260, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Descripción");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 18, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Empresa");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 18, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Clasificación");
        jPanel2.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 18, -1, -1));

        jButton7.setText("Todos");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        jButton8.setText("Eliminar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 810, 230));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/cerrar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 38, 38));

        jButton6.setText("Gestión Proveedores y Clasificación");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        home.activoMateriales = false;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // jButton2 = btnEdit
        jButton5.setEnabled(false);
        jButton4.setEnabled(true);
        getIdSgt();
        setImageDefault();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        vali.soloLetra(evt);
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // BtnSave
        setSaveMaterial();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // precio
        vali.soloNumeroEvent(evt);
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Buscamos y cargamos imagen
        file = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter(
                "Formatos de Archivo JPEG(*.JPG;*.JPEG;*.PNG;*.GIF)", "png", "jpg", "jpeg", "gif");
        file.addChoosableFileFilter(filtro);
        file.setFileFilter(filtro);
        int seleccion = file.showOpenDialog(contentPane);

        //Si el usuario, pincha en aceptar
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            if (file.getSelectedFile().getName().endsWith(".jpg")
                    || file.getSelectedFile().getName().endsWith(".png")
                    || file.getSelectedFile().getName().endsWith(".jpeg")
                    || file.getSelectedFile().getName().endsWith(".gif")) {

                //Seleccionamos el fichero
                fichero = file.getSelectedFile();
                //Devuelve la ruta hasta llegar a la carpeta imagenes
                rutaImagenSelect = file.getSelectedFile().getAbsolutePath();
                //System.out.println("" + rutaImagenSelect);
                //System.out.println("" + file.getSelectedFile().getName());
                name = file.getSelectedFile().getName();
                //La imagen seleccionada se muestra en el lbfoto
                ImageIcon icon = new ImageIcon(rutaImagenSelect);
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_DEFAULT));
                jLabel8.setText(null);
                jLabel8.setIcon(icono);
            } else {
                JOptionPane.showConfirmDialog(null, "No es una imagen ", "Información", 2);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // FrmGestion Clasificacion y Proveedores
        try {
            if (activoFrmIndirectoPoliza == true) {
                frmIndirectoPoliza.setLocation(23, 23);
                frmIndirectoPoliza.moveToFront();
                frmIndirectoPoliza.show();
            } else {
                activoFrmIndirectoPoliza = true;
                frmIndirectoPoliza = new FrmIndirectoPoliza();
                escritorio.add(frmIndirectoPoliza);
                frmIndirectoPoliza.setLocation(23, 23);
                frmIndirectoPoliza.show();
            }
        } catch (Exception e) {
            e.getMessage();
            //System.out.println("err-  "+e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jButton4.setEnabled(false); // BtnSave
        jButton5.setEnabled(true); // BtnEdit

        int fila = jTable1.rowAtPoint(evt.getPoint());

        jTextField1.setText(jTable1.getValueAt(fila, 0).toString()); // id
        jComboBox2.setSelectedIndex(Integer.parseInt(jTable1.getValueAt(fila, 1).toString()) - 1); //clasificacion
        jComboBox1.setSelectedIndex(Integer.parseInt(jTable1.getValueAt(fila, 2).toString()) - 1); // proveedor

        jTextField3.setText(jTable1.getValueAt(fila, 6).toString()); // unidad
        txtdescripcion.setText(jTable1.getValueAt(fila, 5).toString()); // descripcion
        jTextField2.setText(jTable1.getValueAt(fila, 7).toString());// precio

        imagenEdit = jTable1.getValueAt(fila, 8).toString();
        //imagen
        String ruta = System.getProperty("user.dir") + "\\resource\\img\\material\\" + jTable1.getValueAt(fila, 8).toString();
        setImageReturn(ruta);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        kpress = evt.getKeyChar();
        if (kpress == KeyEvent.VK_ENTER) {
            getFiltoByMateriales();
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        setTableMaterialesAll();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setEditMaterial();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // eliminar segun seleccionados
        int[] selectTbl = jTable1.getSelectedRows();
        if (selectTbl.length > 0) {
            for (int i = 0; i < selectTbl.length; i++) {
                int id = Integer.parseInt(jTable1.getValueAt(selectTbl[i], 0).toString());
                ctrMaterial.setDeleteMaterial(id);
            }
            JOptionPane.showConfirmDialog(null, "Material Eliminado ", "Información", 2);
            setTableMaterialesAll();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMateriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMateriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMateriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMateriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMateriales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextArea txtdescripcion;
    // End of variables declaration//GEN-END:variables

    // llenamos el cbo de clasificacion
    private void llenarCboClasificacion() {
        // jComboBox2
        clasificacionController ctrClasi = new clasificacionController();
        List<Clasificacion> clasificaciones = (ArrayList<Clasificacion>) ctrClasi.getClasificacionAll();
        DefaultComboBoxModel cboModel = new DefaultComboBoxModel();
        for (Clasificacion clasificacione : clasificaciones) {
            cboModel.addElement(clasificacione);
        }
        jComboBox2.setModel(cboModel);
    }

    // llenamos el cbo de proveedor
    private void llenarCboProveedor() {
        // jComboBox1
        proveedorController ctrProvee = new proveedorController();
        List<Proveedor> proveedores = (ArrayList<Proveedor>) ctrProvee.getProveedoresAll();
        DefaultComboBoxModel cboModel = new DefaultComboBoxModel();
        for (Proveedor proveedor : proveedores) {
            cboModel.addElement(proveedor);
        }
        jComboBox1.setModel(cboModel);
    }

    // no move columnTable y hide 
    private void setEsquemaTable() {
        // jTable1
        jTable1.getTableHeader().setReorderingAllowed(false);
        // ocultar  columnas 1 y 2
        jTable1.getColumnModel().getColumn(1).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(1).setMinWidth(0);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(0);

        jTable1.getColumnModel().getColumn(2).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(2).setMinWidth(0);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(0);
    }

    // metodo para limpiar tabla
    private void clearTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }

    // datos de carga default de la tabla Materiales
    private void setTableMaterialesAll() {
        // jTable1
        int sizeRows = jTable1.getRowCount();
        if (sizeRows > 0) {
            clearTable();
        }
        List<MaterialesDto> list = ctrMaterial.getMaterialAll();

        if (list.isEmpty()) {
            // jLabel7
            jLabel7.setText("No hay registros");
        } else {
            jLabel7.setText("Total de registros: " + list.size());
        }
        addRowTable(list);
    }

    // imagen default carga
    private void setImageDefault() {
        String ruta = System.getProperty("user.dir") + "\\resource\\img\\default.png";
        ImageIcon icon = new ImageIcon(ruta);
        jLabel8.setSize(150, 120);

        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_DEFAULT));
        jLabel8.setText(null);
        jLabel8.setIcon(icono);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
    }

    // imagen default carga
    private void setImageReturn(String ruta) {
        ImageIcon icon = new ImageIcon(ruta);
        jLabel8.setSize(150, 120);

        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_DEFAULT));
        jLabel8.setText(null);
        jLabel8.setIcon(icono);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
    }

    // lleno el cuerpo de la tabla
    private void addRowTable(List<MaterialesDto> list) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row;
        for (MaterialesDto item : list) {
            row = new Object[9];
            row[0] = item.getId();
            row[1] = item.getId_clasificacion();
            row[2] = item.getId_proveedor();

            row[3] = item.getProveedor();
            row[4] = item.getClasificacion();

            row[5] = item.getDescripcion();
            row[6] = item.getUnidad();
            row[7] = item.getPrecio();
            row[8] = item.getUrl_imagen();

            model.addRow(row);
            row = null;
        }

        if (list.isEmpty()) {
            // jLabel7
            jLabel7.setText("No hay registros");
        } else {
            jLabel7.setText("Total de registros: " + list.size());
        }
        jTable1.setModel(model);
    }

    //metodo que trae el idSgt
    private void getIdSgt() {
        // jTextField1
        int idSgt = ctrMaterial.getIDSgt();
        jTextField1.setText("" + idSgt);
    }

    private void setSaveMaterial() {
        //jComboBox1, jComboBox2, txtdescripcion, jTextField3, jTextField2, la urlFile
        if (txtdescripcion.getText().length() > 0
                && jTextField3.getText().length() > 0) {
            try {
                datos = new Materiales();
                Proveedor pro = (Proveedor) jComboBox1.getSelectedItem();
                Clasificacion cla = (Clasificacion) jComboBox2.getSelectedItem();
                datos.setId_clasificacion(cla.getId());
                datos.setId_proveedor(pro.getId());
                datos.setDescripcion(txtdescripcion.getText());
                datos.setUnidad(jTextField3.getText());
                datos.setPrecio(Double.parseDouble(jTextField2.getText()));

                if (fichero == null) {
                    datos.setUrl_imagen("default.png");
                } else {
                    datos.setUrl_imagen(name);
                }

                //System.out.println("dto " + datos.toString());
                if (ctrMaterial.ingresar(datos)) {
                    JOptionPane.showConfirmDialog(this, "Material grabado con exito", "Confirmación", 2);
                    if (!datos.getUrl_imagen().equals("default.png")) {
                        copyImagenInsert(name, rutaImagenSelect);
                        //setTableMaterialesAll();
                        getMaterialByID(jTextField1.getText());
                    }
                }
                // de nuevo fichero null o vacio y modelo
                fichero = null;
                datos = null;
            } catch (Exception e) {
                //System.out.println("");
                e.getMessage();
            }
        } else {
            JOptionPane.showConfirmDialog(this, "Campos vacios", "Alerta", 2);
        }
    }

    private void setEditMaterial() {
        //jComboBox1, jComboBox2, txtdescripcion, jTextField3, jTextField2, la urlFile, jTextField1
        //jComboBox1, jComboBox2, txtdescripcion, jTextField3, jTextField2, la urlFile
        if (txtdescripcion.getText().length() > 0
                && jTextField3.getText().length() > 0) {
            try {
                boolean insertImgUpdate = false;
                datos = new Materiales();
                Proveedor pro = (Proveedor) jComboBox1.getSelectedItem();
                Clasificacion cla = (Clasificacion) jComboBox2.getSelectedItem();
                datos.setId_clasificacion(cla.getId());
                datos.setId_proveedor(pro.getId());
                datos.setDescripcion(txtdescripcion.getText());
                datos.setUnidad(jTextField3.getText());
                datos.setPrecio(Double.parseDouble(jTextField2.getText()));
                datos.setId(Integer.parseInt(jTextField1.getText()));

                if (fichero == null) {
                    if (!imagenEdit.equals("")) {
                        datos.setUrl_imagen(imagenEdit);
                    }
                } else {
                    datos.setUrl_imagen(name);
                    insertImgUpdate = true;
                }

                //System.out.println("dto " + datos.toString());
                if (ctrMaterial.actualizar(datos)) {
                    JOptionPane.showConfirmDialog(this, "Material editado con exito", "Confirmación", 2);
                    if (insertImgUpdate = true) {
                        copyImagenInsert(name, rutaImagenSelect);
                        setTableMaterialesAll();
                        getMaterialByID(jTextField1.getText());
                    }
                    imagenEdit = "";
                }
                // de nuevo fichero null o vacio y modelo
                fichero = null;
                datos = null;
            } catch (Exception e) {
                //System.out.println("");
                e.getMessage();
            }
        } else {
            JOptionPane.showConfirmDialog(this, "Campos vacios", "Alerta", 2);
        }
    }

    // metodo que copiara la imagen y almacenara dentro del if de insert
    private void copyImagenInsert(String name1, String rutaImagenSelect1) {
        File archivoOrigen; // archivo de entrada
        File archivoDestino;
        FileInputStream in = null;
        FileOutputStream out = null;
        boolean b;
        try {
            archivoOrigen = new File(rutaImagenSelect1);
            archivoDestino = new File(pathSaveImage + name1);

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

            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }

        } catch (Exception e) {
            //System.out.println("err-" + e.getMessage());
            e.getMessage();
        }
    }

    private void getFiltoByMateriales() {
        if (jTable1.getRowCount() > 0) {
            clearTable();
        }
        List<MaterialesDto> lista = null;
        // descripcion
        String dato = jTextField4.getText();
        if (jRadioButton1.isSelected()) {
            //System.out.println("dato " + dato);
            lista = ctrMaterial.getMaterialByDescripcion(dato);
        }
        // empresa
        if (jRadioButton2.isSelected()) {
            lista = ctrMaterial.getMaterialByEmpresa(dato);
        }
        // clasificacion
        if (jRadioButton3.isSelected()) {
            lista = ctrMaterial.getMaterialByClasificacion(dato);
        }
        addRowTable(lista);
    }

    private void getMaterialByID(String id){
        if (jTable1.getRowCount() > 0) {
            clearTable();
        }
        List<MaterialesDto> lista = ctrMaterial.getMaterialByID(id);
        addRowTable(lista);
    }
}

/*

trabajar con imagenes con ruta relativa usar el System user.dir  al proyecto

para esas imagenes crear un carpeta para las imagenes con su propio directorio

como nombre tendria el id del registro aqui van las imagenes
materiales/


aqui van los files
tambn con el id
apus/
presupuesto/

select count(id_clasificacion) from materiales where id_clasificacion=

select count(id_proveedor) from materiales where id_proveedor=

select materiales.id, materiales.descripcion, materiales.id_clasificacion, materiales.id_proveedor, materiales.precio, materiales.url_imagen,
clasificacion.descripcion as clasdescripc, proveedor.nombre as proveenombr
from materiales
left join clasificacion on clasificacion.id = materiales.id_clasificacion
left join proveedor on proveedor.id = materiales.id_proveedor
group by materiales.descripcion, materiales.id, clasificacion.descripcion, proveedor.nombre


http://basededatos.umh.es/sql/sql04.htm
http://www.tutorialesprogramacionya.com/postgresqlya/temarios/descripcion.php?cod=191&punto=33&inicio=


pagina de logo online
https://www.crearlogogratisonline.com/


 */
