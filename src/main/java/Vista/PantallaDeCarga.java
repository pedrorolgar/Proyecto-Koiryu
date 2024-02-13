/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Pantalla de carga que muestra una barra de progreso mientras se inicializa la aplicación.
 * Una vez que la barra de progreso alcanza el 100%, la pantalla de carga se cierra y se abre la pantalla de inicio de sesión.
 *
 * Esta clase extiende JFrame y es utilizada para mostrar una pantalla de carga al iniciar la aplicación.
 *
 * @author Pedro Rollán García
 */
public class PantallaDeCarga extends javax.swing.JFrame {

  private int porcentaje = 0;

  /**
   * Constructor que inicializa la pantalla de carga.
   * Se crea un hilo que incrementa el porcentaje de carga hasta llegar al 100%.
   * Después de alcanzar el 100%, se cierra la pantalla de carga y se abre la pantalla de inicio de sesión.
   */
  public PantallaDeCarga() {
    setUndecorated(true);
    FlatIntelliJLaf.setup();
    initComponents();
    carga.setStringPainted(true);
    setVisible(true);
    this.setLocationRelativeTo(null);
    porcentaje = 0;
    Thread t = new Thread() {
      @Override
      public void run() {
        while (porcentaje < 100) {
          carga.setValue(porcentaje);
          try {
            Thread.sleep(1);
          } catch (InterruptedException ex) {
            Logger.getLogger(PantallaDeCarga.class.getName()).log(Level.SEVERE, null, ex);
          }
          porcentaje++;
        }
        removeAll();
        setVisible(false);
        new Login().setVisible(true);

      }
    };
    t.start();

  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    carga = new javax.swing.JProgressBar();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setUndecorated(true);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    carga.setBackground(new java.awt.Color(0, 0, 0));
    carga.setForeground(new java.awt.Color(159, 255, 0));
    getContentPane().add(carga, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 410, 10));

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconoKoiryu_Blanco_sin_fondo_grande.jpg"))); // NOI18N
    getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 410));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  /**
   * Método principal para iniciar la aplicación.
   *
   * @param args los argumentos de la línea de comandos
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    new PantallaDeCarga();
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
      java.util.logging.Logger.getLogger(PantallaDeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(PantallaDeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(PantallaDeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(PantallaDeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Splash().setVisible(true);
//
//            }
//        });
    //</editor-fold>
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Splash().setVisible(true);
//
//            }
//        });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JProgressBar carga;
  private javax.swing.JLabel jLabel1;
  // End of variables declaration//GEN-END:variables

  /**
   * Abrir principal.
   */
  public void abrirPrincipal() {
    java.awt.EventQueue.invokeLater(() -> {
      new Login().setVisible(true);
    });
  }
}
