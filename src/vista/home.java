/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static vista.FrmApus.activoFrmResumen;

/**
 *
 * @author personal
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    // los demas Formularios
    FrmEquipo frmequipo;
    FrmMano_obra frmMano_obra;
    FrmApus frmApus;
    FrmMateriales frmmateriales;
    FrmTransporte frmtransporte;
    FrmApusPresupuesto freResumen;
    FrmOferta frmOferta;
    FrmUsuarios frmUsuarios;
    FrmIndirectos frmIndirectos;
    FrmDocumentos frmDocuments;
    private FrmIndirectoPoliza frmIndirectoPoliza;

    // imagen logo fondo
    private ImageIcon imagenFondo;
    private ImageIcon imagenFondoRedimensionado;

    // atributo que controla frmInternos abiertos o no
    public static boolean activoEquipo, activoManoObra, activoApus, activoMateriales, activoFrmResumen, activoTransporte, activoOferta, activoUsuarios, activoIndirecto, activoDocumentos, activoFrmIndirectoPoliza;

    public home() {
        initComponents();

        jLabel2.setVisible(false);
        jMenuItem11.setVisible(false);
        // escritorio
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // agregro el desktop al formulario padre
        //escritorio.setSize(1050, 650);
        setContentPane(escritorio);
        escritorio.setBackground(new Color(255, 252, 251));
        escritorio.setLayout(null);

        //imagen
        imagenFondo();
       
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
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        Imagen_fondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        menuEquipo = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuIManoObra = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuIApus = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        jMenuItem4.setText("jMenuItem4");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(153, 153, 255));
        escritorio = new javax.swing.JDesktopPane() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        escritorio.setBackground(Color.gray);
        escritorio.add(Imagen_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 340, 240));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabel1.setText("jLabel1");
        escritorio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 800, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel2");
        escritorio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jMenuBar1.setForeground(new java.awt.Color(102, 255, 204));

        jMenu2.setBackground(new java.awt.Color(153, 204, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ingehisa.png"))); // NOI18N
        jMenu2.setText("INGEHISA");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/login.png"))); // NOI18N
        jMenuItem3.setText("Usuarios");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/gestion.png"))); // NOI18N
        jMenuItem11.setText("Gestión");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuBar1.add(jMenu2);

        jMenu12.setBackground(new java.awt.Color(153, 204, 255));
        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/nominia.png"))); // NOI18N
        jMenu12.setText("INVENTARIOS");
        jMenu12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        menuEquipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/equipo.png"))); // NOI18N
        menuEquipo.setText("EQUIPO");
        menuEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEquipoActionPerformed(evt);
            }
        });
        jMenu12.add(menuEquipo);

        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/materiales.png"))); // NOI18N
        jMenuItem2.setText("MATERIAL");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem2);

        menuIManoObra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuIManoObra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mano_obra.png"))); // NOI18N
        menuIManoObra.setText("MANO DE OBRA");
        menuIManoObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIManoObraActionPerformed(evt);
            }
        });
        jMenu12.add(menuIManoObra);

        jMenuItem5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/transporte.png"))); // NOI18N
        jMenuItem5.setText("TRANSPORTE");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem5);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/presupuesto.png"))); // NOI18N
        jMenuItem9.setText("INDIRECTOS");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem9);

        jMenuBar1.add(jMenu12);

        jMenu3.setBackground(new java.awt.Color(153, 204, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/presupuesto.png"))); // NOI18N
        jMenu3.setText("ANALISIS");
        jMenu3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        menuIApus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuIApus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/apus.png"))); // NOI18N
        menuIApus.setText("APU");
        menuIApus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIApusActionPerformed(evt);
            }
        });
        jMenu3.add(menuIApus);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/documents.png"))); // NOI18N
        jMenuItem8.setText("Documentos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(153, 204, 255));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/apus.png"))); // NOI18N
        jMenu4.setText("PRESUPUESTO");
        jMenu4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMenuItem10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/oferta.png"))); // NOI18N
        jMenuItem10.setText("RES - OFERT");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/nominia.png"))); // NOI18N
        jMenuItem1.setText("OFERTAS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/salida.png"))); // NOI18N
        jMenu1.setText("Salir");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEquipoActionPerformed
        try {
            if (activoEquipo == true) {
                frmequipo.setLocation(23, 23);
                frmequipo.moveToFront();
                frmequipo.show();
            } else {
                activoEquipo = true;
                frmequipo = new FrmEquipo();
                escritorio.add(frmequipo);
                frmequipo.setLocation(23, 23);
                frmequipo.show();
            }
        } catch (Exception e) {
            e.getMessage();
            //System.out.println("err-  "+e.getMessage());
        }
    }//GEN-LAST:event_menuEquipoActionPerformed

    private void menuIManoObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIManoObraActionPerformed
        try {
            if (activoManoObra == true) {
                frmMano_obra.setLocation(23, 23);
                frmMano_obra.moveToFront();
                frmMano_obra.show();
            } else {
                activoManoObra = true;
                frmMano_obra = new FrmMano_obra();
                escritorio.add(frmMano_obra);
                frmMano_obra.setLocation(23, 23);
                frmMano_obra.show();
            }
        } catch (Exception e) {
            e.getMessage();
            //System.out.println("err-  "+e.getMessage());
        }
    }//GEN-LAST:event_menuIManoObraActionPerformed

    private void menuIApusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIApusActionPerformed
        try {
            if (activoApus == true) {
                frmApus.setLocation(23, 23);
                frmApus.moveToFront();
                frmApus.show();
            } else {
                activoApus = true;
                frmApus = new FrmApus();
                escritorio.add(frmApus);
                frmApus.setLocation(23, 23);
                frmApus.show();
            }
        } catch (Exception e) {
            e.getMessage();
            //System.out.println("err-  "+e.getMessage());
        }
    }//GEN-LAST:event_menuIApusActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        try {
            if (activoOferta == true) {
                frmOferta.setLocation(23, 23);
                frmOferta.moveToFront();
                frmOferta.show();
            } else {
                activoOferta = true;
                frmOferta = new FrmOferta();
                escritorio.add(frmOferta);
                frmOferta.setLocation(23, 23);
                frmOferta.show();
            }
        } catch (Exception e) {
            e.getMessage();
            System.out.println("err-  " + e.getMessage());
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        try {
            if (activoMateriales == true) {
                frmmateriales.setLocation(23, 23);
                frmmateriales.moveToFront();
                frmmateriales.show();
            } else {
                activoMateriales = true;
                frmmateriales = new FrmMateriales();
                escritorio.add(frmmateriales);
                frmmateriales.setLocation(23, 23);
                frmmateriales.show();
            }
        } catch (Exception e) {
            e.getMessage();
            //System.out.println("err-  "+e.getMessage());
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        try {
            if (activoFrmResumen == true) {
                freResumen.setLocation(23, 23);
                freResumen.setTitle("Presupuesto Manual");
                freResumen.moveToFront();
                freResumen.show();
            } else {
                activoFrmResumen = true;
                freResumen = new FrmApusPresupuesto();
                freResumen.setTitle("Presupuesto Manual");
                vista.home.escritorio.add(freResumen);
                freResumen.setLocation(23, 23);
                freResumen.show();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // FrmTransporte
        try {
            if (activoTransporte == true) {
                frmtransporte.setLocation(23, 23);
                frmtransporte.moveToFront();
                frmtransporte.show();
            } else {
                activoTransporte = true;
                frmtransporte = new FrmTransporte();
                escritorio.add(frmtransporte);
                frmtransporte.setLocation(23, 23);
                frmtransporte.show();
            }
        } catch (Exception e) {
            e.getMessage();
            //System.out.println("err-  "+e.getMessage());
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // Menu salir
        int resultado = JOptionPane.showConfirmDialog(this, "Esta seguro de cerrar el sistema","Confimación",JOptionPane.WARNING_MESSAGE);
        if(resultado==0){
            this.dispose();
            Login login = new Login();
            login.setVisible(true);
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // FrmUsuarios
        try {
            if (activoUsuarios == true) {
                frmUsuarios.setLocation(23, 23);
                frmUsuarios.moveToFront();
                frmUsuarios.show();
            } else {
                activoUsuarios = true;
                frmUsuarios = new FrmUsuarios();
                escritorio.add(frmUsuarios);
                frmUsuarios.setLocation(23, 23);
                frmUsuarios.show();
            }
        } catch (Exception e) {
            e.getMessage();
            //System.out.println("err-  "+e.getMessage());
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // FrmIndirectos
        try {
            if (activoIndirecto == true) {
                frmIndirectos.setLocation(10, 10);
                frmIndirectos.moveToFront();
                frmIndirectos.show();
            } else {
                activoIndirecto = true;
                frmIndirectos = new FrmIndirectos();
                escritorio.add(frmIndirectos);
                frmIndirectos.setLocation(10, 10);
                frmIndirectos.show();
            }
        } catch (Exception e) {
            e.getMessage();
            System.out.println("err-  "+e.getMessage());
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // FrmDocumentos
        try {
            if (activoDocumentos == true) {
                frmDocuments.setLocation(10, 10);
                frmDocuments.moveToFront();
                frmDocuments.show();
            } else {
                activoDocumentos = true;
                frmDocuments = new FrmDocumentos();
                escritorio.add(frmDocuments);
                frmDocuments.setLocation(10, 10);
                frmDocuments.show();
            }
        } catch (Exception e) {
            e.getMessage();
            System.out.println("err-  "+e.getMessage());
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
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
    }//GEN-LAST:event_jMenuItem11ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen_fondo;
    public static javax.swing.JDesktopPane escritorio;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    public static javax.swing.JMenuItem jMenuItem2;
    public static javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    public static javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    public static javax.swing.JMenuItem menuEquipo;
    private javax.swing.JMenuItem menuIApus;
    public static javax.swing.JMenuItem menuIManoObra;
    // End of variables declaration//GEN-END:variables

    private void imagenFondo() {
        try {
            String ruta_imagen = System.getProperty("user.dir") +"\\resource\\img\\inghisa.png";
            //Imagen_fondo.setSize(escritorio.getSize());
            Imagen_fondo.setSize(escritorio.getSize());

            imagenFondo = new ImageIcon(ruta_imagen);
            imagenFondoRedimensionado = new ImageIcon(imagenFondo.getImage().getScaledInstance(escritorio.getWidth(),
                    escritorio.getHeight(), java.awt.Image.SCALE_SMOOTH));
            Imagen_fondo.setIcon(imagenFondoRedimensionado);

            Imagen_fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            Imagen_fondo.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
