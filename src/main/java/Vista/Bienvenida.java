/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Pedro Rollán
 */
import Controlador.cBienvenida;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.util.ResourceBundle;
import lombok.Getter;

/**
 * La clase Bienvenida representa la ventana de bienvenida del sistema.
 * Esta ventana contiene información de bienvenida y enlaces de navegación.
 * Además, permite cambiar el idioma entre español e inglés.
 *
 * @author Pedro Rollán García
 */
@Getter
public class Bienvenida extends javax.swing.JFrame {

  /**
   * Creates new form Bienvenida
   */
  DescubrirCitas descubrir = new DescubrirCitas();
  cBienvenida Controlador = new cBienvenida(this);
  EventosArte eventosArte = new EventosArte();
  EventosFestivales eventosFestivales = new EventosFestivales();
  EventosNaturaleza eventosNaturaleza = new EventosNaturaleza();
  MiPerfil miPerfil = new MiPerfil();
  MisEventos misEventos = new MisEventos();
  ModificarPerfil modificarPerfil = new ModificarPerfil();

  /**
   * Constructor de la clase Bienvenida.
   * Crea una nueva instancia de Bienvenida, inicializa los componentes y aplica estilos.
   */
  public Bienvenida() {
    setVisible(true);
    FlatIntelliJLaf.setup();
    FlatLightLaf.setup();
    initComponents();
    Controlador.actualizarEstilos();

  }

  /**
   * This method is called from within the constructor to initialize the form.
   *
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    frame = new javax.swing.JPanel();
    Español1 = new javax.swing.JLabel();
    Ingles = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    tituloBienvenida = new javax.swing.JLabel();
    textoBienvenida = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    SalirPagina = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    VistaArte = new javax.swing.JLabel();
    jLabel16 = new javax.swing.JLabel();
    jLabel17 = new javax.swing.JLabel();
    VistaInicio = new javax.swing.JLabel();
    VistaNaturaleza = new javax.swing.JLabel();
    jLabel29 = new javax.swing.JLabel();
    VistaFestivales = new javax.swing.JLabel();
    VistaDescubrir = new javax.swing.JLabel();
    CrearEvento = new javax.swing.JLabel();
    eventos2 = new javax.swing.JLabel();
    eventos = new javax.swing.JLabel();
    citas = new javax.swing.JLabel();
    jLabel36 = new javax.swing.JLabel();
    jLabel37 = new javax.swing.JLabel();
    jLabel38 = new javax.swing.JLabel();
    jLabel39 = new javax.swing.JLabel();
    jLabel40 = new javax.swing.JLabel();
    jLabel41 = new javax.swing.JLabel();
    jLabel42 = new javax.swing.JLabel();
    jLabel43 = new javax.swing.JLabel();
    irUsuario = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    searchTf = new javax.swing.JTextField();
    panelAbsoluto = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(53, 49, 48));
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    frame.setBackground(new java.awt.Color(53, 49, 48));
    frame.setOpaque(false);
    frame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    Español1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/España.png"))); // NOI18N
    Español1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    Español1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        Español1MouseClicked(evt);
      }
    });
    frame.add(Español1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

    Ingles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reino-unido.png"))); // NOI18N
    Ingles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    Ingles.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        InglesMouseClicked(evt);
      }
    });
    frame.add(Ingles, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

    getContentPane().add(frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 66, 1150, 800));

    jPanel3.setBackground(new java.awt.Color(75, 76, 73));
    jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    tituloBienvenida.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 25)); // NOI18N
    tituloBienvenida.setForeground(new java.awt.Color(255, 255, 255));
    tituloBienvenida.setText("BIENVENIDOS A KOIRYU");
    jPanel3.add(tituloBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 78, 327, 39));

    textoBienvenida.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
    textoBienvenida.setForeground(new java.awt.Color(255, 255, 255));
    textoBienvenida.setText("<html>\n<div style=\"text-align:justify;\">\nOs damos la bienvenida a Koiryu, Creada por alumnos del ciclo de Desarrollo  de Aplicaciones Multiplataforma.Esta idea para el proyecto fue ideada en la  asignatura de Empresa e iniciativa emprendedora donde trabajamos la idea de  proyecto y ahora gracias a las asignaturas de Desarrollo de Interfaces y Acceso  a datos le daremos forma y funcionalidad a la misma. Os recibimos a todos con  los brazos abiertos y esperamos que disfruteis de la experiencia. \n</div>\n</hmtl>");
    jPanel3.add(textoBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 198, 763, 166));

    jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconoKoiryu_Blanco_sin_fondo_pequeña.png"))); // NOI18N
    jLabel6.setText("jLabel6");
    jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 73, 51, 44));

    getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 349, 821, 395));

    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen hojas 1.png"))); // NOI18N
    getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 67, 1143, 429));

    SalirPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Open Door.png"))); // NOI18N
    SalirPagina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    SalirPagina.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        SalirPaginaMouseClicked(evt);
      }
    });
    getContentPane().add(SalirPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 18, 30, 30));

    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconoKoiryu_Blanco_sin_fondo_pequeña 1.png"))); // NOI18N
    getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1348, 13, 40, 40));

    jPanel1.setBackground(new java.awt.Color(51, 51, 51));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    VistaArte.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
    VistaArte.setForeground(new java.awt.Color(145, 158, 171));
    VistaArte.setText("Arte");
    VistaArte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    VistaArte.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        VistaArteMouseClicked(evt);
      }
    });
    jPanel1.add(VistaArte, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 50, 18));

    jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    jLabel16.setForeground(new java.awt.Color(99, 115, 129));
    jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/solar_heart-broken.png"))); // NOI18N
    jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 370, 16, 16));

    jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 26)); // NOI18N
    jLabel17.setForeground(new java.awt.Color(159, 255, 0));
    jLabel17.setText("Koiryu");
    jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 24, 90, 31));

    VistaInicio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
    VistaInicio.setForeground(new java.awt.Color(145, 158, 171));
    VistaInicio.setText("Home");
    VistaInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    VistaInicio.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        VistaInicioMouseClicked(evt);
      }
    });
    jPanel1.add(VistaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 50, 18));

    VistaNaturaleza.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
    VistaNaturaleza.setForeground(new java.awt.Color(145, 158, 171));
    VistaNaturaleza.setText("Naturaleza");
    VistaNaturaleza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    VistaNaturaleza.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        VistaNaturalezaMouseClicked(evt);
      }
    });
    jPanel1.add(VistaNaturaleza, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 246, 80, 18));

    jLabel29.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
    jLabel29.setForeground(new java.awt.Color(145, 158, 171));
    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Frame 588.png"))); // NOI18N
    jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 220, 20, 18));

    VistaFestivales.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
    VistaFestivales.setForeground(new java.awt.Color(145, 158, 171));
    VistaFestivales.setText("Festivales");
    VistaFestivales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    VistaFestivales.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        VistaFestivalesMouseClicked(evt);
      }
    });
    jPanel1.add(VistaFestivales, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 194, 80, -1));

    VistaDescubrir.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
    VistaDescubrir.setForeground(new java.awt.Color(145, 158, 171));
    VistaDescubrir.setText("Descubrir");
    VistaDescubrir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    VistaDescubrir.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        VistaDescubrirMouseClicked(evt);
      }
    });
    jPanel1.add(VistaDescubrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 370, 80, 18));

    CrearEvento.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
    CrearEvento.setForeground(new java.awt.Color(145, 158, 171));
    CrearEvento.setText("Crear Evento");
    CrearEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    CrearEvento.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        CrearEventoMouseClicked(evt);
      }
    });
    jPanel1.add(CrearEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 280, 110, 18));

    eventos2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
    eventos2.setForeground(new java.awt.Color(145, 158, 171));
    eventos2.setText("Eventos");
    jPanel1.add(eventos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 160, 60, 18));

    eventos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    eventos.setForeground(new java.awt.Color(99, 115, 129));
    eventos.setText("EVENTOS");
    jPanel1.add(eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 129, 90, 15));

    citas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    citas.setForeground(new java.awt.Color(99, 115, 129));
    citas.setText("CITAS");
    jPanel1.add(citas, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 338, 90, 15));

    jLabel36.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    jLabel36.setForeground(new java.awt.Color(99, 115, 129));
    jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
    jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 71, 16, 16));

    jLabel37.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    jLabel37.setForeground(new java.awt.Color(99, 115, 129));
    jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chevron-down (1).png"))); // NOI18N
    jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 71, 16, 16));

    jLabel38.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    jLabel38.setForeground(new java.awt.Color(99, 115, 129));
    jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/layout.png"))); // NOI18N
    jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 280, 16, 16));

    jLabel39.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    jLabel39.setForeground(new java.awt.Color(99, 115, 129));
    jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/layers.png"))); // NOI18N
    jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 160, 16, 16));

    jLabel40.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
    jLabel40.setForeground(new java.awt.Color(145, 158, 171));
    jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Frame 588.png"))); // NOI18N
    jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 194, 20, 18));

    jLabel41.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
    jLabel41.setForeground(new java.awt.Color(145, 158, 171));
    jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Frame 588.png"))); // NOI18N
    jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 246, 20, 18));

    jLabel42.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    jLabel42.setForeground(new java.awt.Color(99, 115, 129));
    jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chevron-down (1).png"))); // NOI18N
    jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 280, 16, 16));

    jLabel43.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    jLabel43.setForeground(new java.awt.Color(99, 115, 129));
    jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chevron-down (1).png"))); // NOI18N
    jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 160, 16, 16));

    irUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    irUsuario.setForeground(new java.awt.Color(255, 255, 255));
    irUsuario.setText("Usuario");
    irUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    irUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        irUsuarioMouseClicked(evt);
      }
    });
    jPanel1.add(irUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 810, -1, 22));

    jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profile.png"))); // NOI18N
    jLabel8.setText("jLabel8");
    jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 801, 40, 40));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 256, 863));

    jPanel2.setBackground(new java.awt.Color(75, 76, 73));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    searchTf.setBackground(new java.awt.Color(52, 53, 50));
    searchTf.setForeground(new java.awt.Color(255, 255, 255));
    jPanel2.add(searchTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 12, 282, 42));

    getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 0, 1144, 66));

    panelAbsoluto.setBackground(new java.awt.Color(53, 49, 48));
    panelAbsoluto.setForeground(new java.awt.Color(53, 49, 48));
    panelAbsoluto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    getContentPane().add(panelAbsoluto, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 0, 1150, 870));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void VistaDescubrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VistaDescubrirMouseClicked
    // TODO add your handling code here:
    frame.setVisible(true);
    Controlador.mostrarpanel(new DescubrirCitas());
  }//GEN-LAST:event_VistaDescubrirMouseClicked

  private void VistaNaturalezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VistaNaturalezaMouseClicked
    // TODO add your handling code here:
    frame.setVisible(true);
    Controlador.mostrarpanel(new EventosNaturaleza());
  }//GEN-LAST:event_VistaNaturalezaMouseClicked

  private void VistaArteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VistaArteMouseClicked
    // TODO add your handling code here:
    frame.setVisible(true);
    Controlador.mostrarpanel(new EventosArte());
  }//GEN-LAST:event_VistaArteMouseClicked

  private void VistaFestivalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VistaFestivalesMouseClicked
    // TODO add your handling code here:
    frame.setVisible(true);
    Controlador.mostrarpanel(new EventosFestivales());
  }//GEN-LAST:event_VistaFestivalesMouseClicked

  private void CrearEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearEventoMouseClicked
    // TODO add your handling code here:
    frame.setVisible(true);
    Controlador.mostrarpanel(new CrearEvento());
  }//GEN-LAST:event_CrearEventoMouseClicked

  private void irUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_irUsuarioMouseClicked
    // TODO add your handling code here:
    frame.setVisible(true);
    Controlador.mostrarpanel(new MiPerfil());
  }//GEN-LAST:event_irUsuarioMouseClicked

  private void VistaInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VistaInicioMouseClicked
    // TODO add your handling code here:
    frame.setVisible(false);
    setVisible(true);

  }//GEN-LAST:event_VistaInicioMouseClicked

  private void Español1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Español1MouseClicked
    // TODO add your handling code here:
    ResourceBundle idioma = ResourceBundle.getBundle("idiomaES");
    VistaDescubrir.setText(idioma.getString("navigation.discover"));
    eventos.setText(idioma.getString("navigation.eventos"));
    citas.setText(idioma.getString("navigation.citas"));
    VistaInicio.setText(idioma.getString("navigation.home"));
    eventos2.setText(idioma.getString("navigation.eventos"));
    VistaFestivales.setText(idioma.getString("navigation.festivals"));
    VistaArte.setText(idioma.getString("navigation.art"));
    VistaNaturaleza.setText(idioma.getString("navigation.nature"));
    CrearEvento.setText(idioma.getString("navigation.createEvent"));
    tituloBienvenida.setText(idioma.getString("Bienvenida.title"));
    textoBienvenida.setText(idioma.getString("Bienvenida.message"));
  }//GEN-LAST:event_Español1MouseClicked

  private void InglesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InglesMouseClicked
    // TODO add your handling code here:
    ResourceBundle idioma = ResourceBundle.getBundle("idioma");
    VistaDescubrir.setText(idioma.getString("navigation.discover"));
    eventos.setText(idioma.getString("navigation.eventos"));
    citas.setText(idioma.getString("navigation.citas"));
    VistaInicio.setText(idioma.getString("navigation.home"));
    eventos2.setText(idioma.getString("navigation.eventos"));
    VistaFestivales.setText(idioma.getString("navigation.festivals"));
    VistaArte.setText(idioma.getString("navigation.art"));
    VistaNaturaleza.setText(idioma.getString("navigation.nature"));
    CrearEvento.setText(idioma.getString("navigation.createEvent"));
    tituloBienvenida.setText(idioma.getString("Bienvenida.title"));
    textoBienvenida.setText(idioma.getString("Bienvenida.message"));

  }//GEN-LAST:event_InglesMouseClicked

  private void SalirPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirPaginaMouseClicked
    // TODO add your handling code here:
    System.exit(0);
  }//GEN-LAST:event_SalirPaginaMouseClicked

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
      java.util.logging.Logger.getLogger(Bienvenida.class
        .getName()).log(java.util.logging.Level.SEVERE, null, ex);

    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Bienvenida.class
        .getName()).log(java.util.logging.Level.SEVERE, null, ex);

    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Bienvenida.class
        .getName()).log(java.util.logging.Level.SEVERE, null, ex);

    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Bienvenida.class
        .getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Bienvenida().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel CrearEvento;
  private javax.swing.JLabel Español1;
  private javax.swing.JLabel Ingles;
  private javax.swing.JLabel SalirPagina;
  private javax.swing.JLabel VistaArte;
  private javax.swing.JLabel VistaDescubrir;
  private javax.swing.JLabel VistaFestivales;
  private javax.swing.JLabel VistaInicio;
  private javax.swing.JLabel VistaNaturaleza;
  private javax.swing.JLabel citas;
  private javax.swing.JLabel eventos;
  private javax.swing.JLabel eventos2;
  private javax.swing.JPanel frame;
  private javax.swing.JLabel irUsuario;
  private javax.swing.JLabel jLabel16;
  private javax.swing.JLabel jLabel17;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel29;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel36;
  private javax.swing.JLabel jLabel37;
  private javax.swing.JLabel jLabel38;
  private javax.swing.JLabel jLabel39;
  private javax.swing.JLabel jLabel40;
  private javax.swing.JLabel jLabel41;
  private javax.swing.JLabel jLabel42;
  private javax.swing.JLabel jLabel43;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel panelAbsoluto;
  private javax.swing.JTextField searchTf;
  private javax.swing.JLabel textoBienvenida;
  private javax.swing.JLabel tituloBienvenida;
  // End of variables declaration//GEN-END:variables

}
