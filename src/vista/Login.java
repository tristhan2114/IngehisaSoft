/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.loginController;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author personal
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Interfaces
     */
    // instacia del controlador
    loginController metodoslogin = new loginController();

    // variable para caracter
    private Character kpress;

    public Login() {
        initComponents();
        this.setResizable(false); // no maximizable
        this.setSize(310, 328);  //tamaño
        this.setLocationRelativeTo(null); // centrar

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

        fondo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jPassClave = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(310, 290));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(255, 209, 115));
        fondo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fondo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("BIENVENIDO");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 160, 20));
        jLabel2.getAccessibleContext().setAccessibleName("INICIAR SESSION");

        txtUsuario.setText("cmullo");
        txtUsuario.setToolTipText("Ingrese usuario");
        fondo.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 170, -1));

        jPassClave.setText("ingehisa*temp*2019");
        jPassClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPassClaveKeyPressed(evt);
            }
        });
        fondo.add(jPassClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 170, -1));

        btnLogin.setBackground(new java.awt.Color(102, 204, 255));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 255));
        btnLogin.setText("Ingresar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        fondo.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 100, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Usuario: ");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setBackground(new java.awt.Color(204, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Contraseña:");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/login.png"))); // NOI18N
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 30, 50));

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 80, -1));

        jLabel5.setText("jLabel5");
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 280));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jPassClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassClaveKeyPressed
        kpress = evt.getKeyChar();
        if (kpress == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_jPassClaveKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // finalizamos la ejecucion
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPassClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void imagenFondo() {
        String ruta = System.getProperty("user.dir") + "\\resource\\img\\fondo.jpg";

        imagenFondo = new ImageIcon(ruta);
        imagenFondoRedimensionado = new ImageIcon(imagenFondo.getImage().getScaledInstance(jLabel5.getWidth(),
                jLabel5.getHeight(), java.awt.Image.SCALE_FAST));
        jLabel5.setIcon(imagenFondoRedimensionado);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
    }

    private void login() {
        String usuario = txtUsuario.getText();
        String clave = String.valueOf(jPassClave.getPassword());

        try {
            String[] rs = metodoslogin.validar_ingreso(usuario, clave);

            if (rs[0].equals("1")) {
                this.dispose();
                JOptionPane.showMessageDialog(null, "Bienvenido " + rs[2] + " " + rs[3] + "\n Has ingresado "
                        + "satisfactoriamente al sistema", "Mensaje de bienvenida",
                        JOptionPane.INFORMATION_MESSAGE);

                // jLabel1 :: nombre y apellido
                home home1 = new home();
                home1.jLabel1.setText("Bienvenido " + rs[2] + " " + rs[3]);
                home1.jLabel2.setText(rs[1]);
                // metodo para desabilitar
                if (!rs[4].equals("1")) {
                    home1.menuEquipo.setEnabled(false);
                    home1.jMenuItem2.setEnabled(false);
                    home1.menuIManoObra.setEnabled(false);
                    home1.jMenuItem5.setEnabled(false);
                    home1.jMenuItem3.setEnabled(false);
                }
                home1.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                        + "Por favor ingrese un usuario y/o contraseñía correctos", "Acceso denegado",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    // imagen logo fondo
    private ImageIcon imagenFondo;
    private ImageIcon imagenFondoRedimensionado;
}
