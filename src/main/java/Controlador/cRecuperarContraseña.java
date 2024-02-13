package Controlador;

import Vista.Login;
import Vista.RecuperarContraseña;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

/**
 * Controlador para la vista de RecuperarContraseña.
 * Gestiona la lógica relacionada con la recuperación de contraseña.
 *
 * @author Pedro Rollán García
 */
public class cRecuperarContraseña {

  private final RecuperarContraseña Vista;

  /**
   * Constructor de la clase cRecuperarContraseña.
   *
   * @param Vista la vista de RecuperarContraseña a controlar
   */
  public cRecuperarContraseña(RecuperarContraseña Vista) {
    this.Vista = Vista;
  }

  /**
   * Actualiza los estilos de los componentes en la vista de RecuperarContraseña.
   * Configura el campo de texto con un marcador de posición y un icono.
   */
  public void actualizarEstilos() {
    Vista.getCorreoRecuperar().putClientProperty("JTextField.placeholderText", "TuCorreo@Gmail.com");
    Vista.getCorreoRecuperar().putClientProperty("FlatLaf.style", "arc:10");
    Vista.getCorreoRecuperar().putClientProperty("JTextField.leadingIcon", new FlatSVGIcon("imagenes/Vector.svg"));
  }

  /**
   * Inicia la recuperación de contraseña.
   * Envía un correo electrónico con instrucciones para recuperar la contraseña.
   */
  public void iniciarPorDefecto() {
    try {
      EmailUtil.confMail(Vista.getCorreoRecuperar().getText());
      new Login().setVisible(true);
      Vista.dispose();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Inicializa los eventos de la vista de RecuperarContraseña.
   * Define el comportamiento del botón de enviar al recuperar la contraseña.
   */
  public void inicializarEventos() {
    Vista.getEnviarRecuperar().addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent mouseEvent) {

      }

      @Override
      public void mousePressed(MouseEvent mouseEvent) {

      }

      @Override
      public void mouseReleased(MouseEvent mouseEvent) {
        try {
          EmailUtil.confMail(Vista.getCorreoRecuperar().getText());
          new Login().setVisible(true);
          Vista.dispose();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

      @Override
      public void mouseEntered(MouseEvent mouseEvent) {

      }

      @Override
      public void mouseExited(MouseEvent mouseEvent) {

      }
    });
  }
}
