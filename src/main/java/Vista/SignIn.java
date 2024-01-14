/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.cSignIn;
import lombok.Getter;

/**
 * The type Sign in.
 * @author Pedro Rollán García
 */
@Getter
public class SignIn extends javax.swing.JFrame {

  /**
   * Creates new form Login
   */
  public SignIn() {
    initComponents();
    cSignIn Controlador = new cSignIn(this);
    Controlador.actualizarEstilos();
    Controlador.InicializarEventos();

  }

  /**
   * This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    SignInBtn = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    goToLogin = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    jLabel15 = new javax.swing.JLabel();
    usuSign = new javax.swing.JTextField();
    correoSign = new javax.swing.JTextField();
    contraSign = new javax.swing.JPasswordField();
    generoCb = new javax.swing.JComboBox<>();
    fondo = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    SignInBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SignUp Button.png"))); // NOI18N
    getContentPane().add(SignInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 525, 460, 63));

    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconoKoiryu_Blanco_sin_fondo_pequeña.png"))); // NOI18N
    getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 26, 40, 40));

    jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 78)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("SIGN IN");
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
    jLabel6.setText("AVENTURAS!");
    getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 830, 500, 103));

    goToLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    goToLogin.setForeground(new java.awt.Color(43, 159, 110));
    goToLogin.setText("¡Logeate!");
    goToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        goToLoginMouseClicked(evt);
      }
    });
    getContentPane().add(goToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 700, -1, -1));

    jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 50)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(255, 255, 255));
    jLabel12.setText("!ÚNETE A MILES DE");
    getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 775, 520, 103));

    jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel15.setForeground(new java.awt.Color(255, 255, 255));
    jLabel15.setText("¿Ya tienes cuenta?");
    getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 702, -1, -1));

    usuSign.setBackground(new java.awt.Color(12, 50, 36));
    usuSign.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    usuSign.setForeground(new java.awt.Color(255, 255, 255));
    getContentPane().add(usuSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 175, 460, 68));

    correoSign.setBackground(new java.awt.Color(12, 50, 36));
    correoSign.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    correoSign.setForeground(new java.awt.Color(255, 255, 255));
    getContentPane().add(correoSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 258, 460, 68));

    contraSign.setBackground(new java.awt.Color(12, 50, 36));
    contraSign.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    getContentPane().add(contraSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 341, 460, 68));

    generoCb.setBackground(new java.awt.Color(12, 50, 36));
    generoCb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    generoCb.setForeground(new java.awt.Color(255, 255, 255));
    generoCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro", " " }));
    generoCb.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        generoCbActionPerformed(evt);
      }
    });
    getContentPane().add(generoCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 421, 460, 68));

    fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura fondo Login.png"))); // NOI18N
    fondo.setText("jLabel2");
    getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 930));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void goToLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToLoginMouseClicked
    // TODO add your handling code here:
    new Login().setVisible(true);
    dispose();
  }//GEN-LAST:event_goToLoginMouseClicked

  private void generoCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoCbActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_generoCbActionPerformed

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
      java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new SignIn().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel SignInBtn;
  private javax.swing.JPasswordField contraSign;
  private javax.swing.JTextField correoSign;
  private javax.swing.JLabel fondo;
  private javax.swing.JComboBox<String> generoCb;
  private javax.swing.JLabel goToLogin;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JTextField usuSign;
  // End of variables declaration//GEN-END:variables
}
