package Controlador;

import Model.Usuarios;
import Vista.Bienvenida;
import Vista.Login;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 * Controlador para la vista de Login.
 * Gestiona la lógica y los eventos asociados a la vista de Login.
 *
 * @author Pedro Rollán García
 */
public class cLogin {

  private final Login Vista;

  /**
   * Constructor de la clase cLogin.
   *
   * @param Vista la vista de Login a controlar
   */
  public cLogin(Login Vista) {
    this.Vista = Vista;
  }

  /**
   * Actualiza los estilos de la vista de Login.
   * Configura el texto de marcador de posición para el nombre de usuario y la contraseña,
   * así como los iconos para cada campo de texto.
   */
  public void actualizarEstilos() {
    Vista.getUsuLogin().putClientProperty("JTextField.placeholderText", "Nombre de usuario");
    Vista.getContraLogin().putClientProperty("JTextField.placeholderText", "Contraseña");
    Vista.getUsuLogin().putClientProperty("FlatLaf.style", "arc:10");
    Vista.getContraLogin().putClientProperty("FlatLaf.style", "arc:10");
    Vista.getUsuLogin().putClientProperty("JTextField.leadingIcon", new FlatSVGIcon("imagenes/iconoUsuario.svg"));
    Vista.getContraLogin().putClientProperty("JTextField.leadingIcon", new FlatSVGIcon("imagenes/Password.svg"));
  }

  /**
   * Inicia sesión usando los datos ingresados en el formulario de login.
   * Comprueba si el usuario existe y si la contraseña es correcta.
   * Muestra mensajes de error o de bienvenida según corresponda.
   */
  public void iniciarPorDefecto() {
    String nombre = Vista.getUsuLogin().getText();
    String contrasena = String.valueOf(Vista.getContraLogin().getPassword());
    Usuarios usuario = Usuarios.encontrarPorNombreDeUsuario(nombre);
    if (usuario == null) {
      System.out.println("no se ha encontrado al usuario");
      JOptionPane.showMessageDialog(null, "El usuario no se ha encontrado o no existe", "Error", JOptionPane.WARNING_MESSAGE);
      return;
    }
    if (Usuarios.comprobarContraseña(contrasena, usuario)) {
      System.out.println("Funciona te has conectado " + nombre);
      JOptionPane.showMessageDialog(null, "Te has conectado con éxito", "Bienvenido", JOptionPane.WARNING_MESSAGE);
      new Bienvenida().setVisible(true);
      Vista.dispose();
    } else {
      System.out.println("La contraseña no es correcta");
      JOptionPane.showMessageDialog(null, "La contraseña no es correcta", "Error", JOptionPane.WARNING_MESSAGE);
    }
  }

  /**
   * Inicializa los eventos asociados a la vista de Login.
   * Configura el evento de clic del botón de login para iniciar sesión.
   */
  public void inicializarEventos() {
    Vista.getLoginBtn().addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent mouseEvent) {
      }

      @Override
      public void mousePressed(MouseEvent mouseEvent) {
      }

      @Override
      public void mouseReleased(MouseEvent mouseEvent) {
        iniciarPorDefecto();
      }

      @Override
      public void mouseEntered(MouseEvent mouseEvent) {
      }

      @Override
      public void mouseExited(MouseEvent mouseEvent) {
      }
    });
  }

  /**
   * Obtiene el usuario actualmente conectado basado en el nombre de usuario ingresado.
   *
   * @return el objeto Usuarios que representa al usuario actual, o null si no se encuentra
   */
  public Usuarios obtenerUsuarioActual() {
    String nombre = Vista.getUsuLogin().getText();
    Usuarios usuario = Usuarios.encontrarPorNombreDeUsuario(nombre);

    if (usuario != null) {
      System.out.println("Usuario actual: " + usuario.getNombreUsuario());
      return usuario;
    } else {
      System.out.println("No se ha encontrado al usuario");
      return null;
    }
  }

}
