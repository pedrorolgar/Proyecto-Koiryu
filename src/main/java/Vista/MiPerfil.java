/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

/**
 *
 * @author Pedro Rollán García
 */
public class MiPerfil extends javax.swing.JPanel {

  /**
   * Creates new form MiPerfil
   */
  public MiPerfil() {
    initComponents();
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

    jLabel2 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    jLabel13 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();
    EditarPerfilBtn = new javax.swing.JButton();
    misEventosBtn = new javax.swing.JButton();

    setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadirFotoGrande.png"))); // NOI18N
    add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 280, 180, 180));

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PaisajeFondo.png"))); // NOI18N
    add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1145, 319));

    jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 41)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Usuario");
    add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 338, -1, -1));

    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoTelefonoVerde.png"))); // NOI18N
    add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 393, 30, 30));

    jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 29)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(180, 241, 159));
    jLabel5.setText("123456789");
    add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 394, -1, -1));

    jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 29)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("Descripcion");
    add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 515, 1020, -1));

    jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 27)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    jLabel7.setText("Ciudad");
    add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 567, 960, -1));

    jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 27)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
    jLabel8.setText("Email");
    add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 659, 990, -1));

    jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 27)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(255, 255, 255));
    jLabel9.setText("Género");
    add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 613, 970, -1));

    jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoLocalizacion.png"))); // NOI18N
    add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 568, 30, 30));

    jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mailPerfil.png"))); // NOI18N
    add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 662, 30, 30));

    jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/genero.png"))); // NOI18N
    add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 613, 30, 30));

    jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoUsu.png"))); // NOI18N
    add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 361, 24, 24));

    jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libreta.png"))); // NOI18N
    add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 365, 24, 24));

    EditarPerfilBtn.setBackground(new java.awt.Color(122, 137, 159));
    EditarPerfilBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    EditarPerfilBtn.setForeground(new java.awt.Color(255, 255, 255));
    EditarPerfilBtn.setText("Editar Perfil");
    EditarPerfilBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    add(EditarPerfilBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 354, 291, 42));

    misEventosBtn.setBackground(new java.awt.Color(122, 137, 159));
    misEventosBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    misEventosBtn.setForeground(new java.awt.Color(255, 255, 255));
    misEventosBtn.setText("Mis Eventos");
    misEventosBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    add(misEventosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(842, 354, 291, 42));
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton EditarPerfilBtn;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JButton misEventosBtn;
  // End of variables declaration//GEN-END:variables
}
