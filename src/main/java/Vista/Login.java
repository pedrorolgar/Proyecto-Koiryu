/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.cLogin;
import Model.Usuarios;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import lombok.Getter;

/**
 * The type Login.
 *
 * @author Pedro Rollán García
 */
@Getter
public class Login extends javax.swing.JFrame {

  /**
   * Creates new form Login
   */
  public Usuarios usuarioActual;

  public Login() {
    setVisible(true);
    FlatIntelliJLaf.setup();
    FlatLightLaf.setup();
    initComponents();
    cLogin controlador = new cLogin(this);
    controlador.actualizarEstilos();
    controlador.inicializarEventos();
    this.usuarioActual = controlador.obtenerUsuarioActual();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginBtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        goToRecuperar = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        goToSign = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        contraLogin = new javax.swing.JPasswordField();
        usuLogin = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Login Button.png"))); // NOI18N
        LoginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 525, 460, 63));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconoKoiryu_Blanco_sin_fondo_pequeña.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 26, 40, 40));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 78)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOGIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 58, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("koiryu");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 30, 80, 32));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DAM");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 59, 36, 18));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 50)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 159, 110));
        jLabel6.setText("MOMENTOS ÚNICOS!");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 830, 540, 103));

        goToRecuperar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        goToRecuperar.setForeground(new java.awt.Color(43, 159, 110));
        goToRecuperar.setText("Recupérala");
        goToRecuperar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goToRecuperar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToRecuperarMouseClicked(evt);
            }
        });
        getContentPane().add(goToRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 702, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 50)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("!DISFRUTA DE");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 775, 444, 103));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("¿No tienes una cuenta?");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 729, -1, -1));

        goToSign.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        goToSign.setForeground(new java.awt.Color(43, 159, 110));
        goToSign.setText("¡Únete!");
        goToSign.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goToSign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToSignMouseClicked(evt);
            }
        });
        getContentPane().add(goToSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 729, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("¿No recuerdas tu contraseña?");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 702, -1, -1));

        contraLogin.setBackground(new java.awt.Color(12, 50, 36));
        contraLogin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(contraLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 341, 460, 68));

        usuLogin.setBackground(new java.awt.Color(12, 50, 36));
        usuLogin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        usuLogin.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(usuLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 258, 460, 68));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura fondo Login.png"))); // NOI18N
        fondo.setText("jLabel2");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void goToRecuperarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToRecuperarMouseClicked
    new RecuperarContraseña().setVisible(true);
    dispose();// TODO add your handling code here:
  }//GEN-LAST:event_goToRecuperarMouseClicked

  private void goToSignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToSignMouseClicked
    new SignIn().setVisible(true);
    dispose();  // TODO add your handling code here:
  }//GEN-LAST:event_goToSignMouseClicked

  /**
   * Main.
   *
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
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Login().setVisible(true);

      }
    });
  }

  public Usuarios getUsuarioActual() {
    return usuarioActual;
  }

  public void setUsuarioActual(Usuarios usuarioActual) {
    this.usuarioActual = usuarioActual;
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginBtn;
    private javax.swing.JPasswordField contraLogin;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel goToRecuperar;
    private javax.swing.JLabel goToSign;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField usuLogin;
    // End of variables declaration//GEN-END:variables
}
