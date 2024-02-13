/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.Usuarios;
import Vista.Login;
import Vista.SignIn;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 * Controlador para la vista SignIn.
 * Gestiona la lógica relacionada con la creación de nuevos usuarios.
 *
 * @author Pedro Rollán García
 */
public class cSignIn {

  private final SignIn Vista;

  /**
   * Constructor de la clase cSignIn.
   *
   * @param Vista la vista SignIn a controlar
   */
  public cSignIn(SignIn Vista) {
    this.Vista = Vista;
  }

  /**
   * Actualiza los estilos de los componentes en la vista SignIn.
   * Configura los campos de texto con marcadores de posición y iconos.
   */
  public void actualizarEstilos() {
    Vista.getUsuSign().putClientProperty("JTextField.placeholderText", "Nombre de usuario");
    Vista.getCorreoSign().putClientProperty("JTextField.placeholderText", "TuCorreo@Gmail.com");
    Vista.getContraSign().putClientProperty("JTextField.placeholderText", "Contraseña");
    Vista.getUsuSign().putClientProperty("FlatLaf.style", "arc:10");
    Vista.getContraSign().putClientProperty("FlatLaf.style", "arc:10");
    Vista.getCorreoSign().putClientProperty("FlatLaf.style", "arc:10");
    Vista.getGeneroCb().putClientProperty("FlatLaf.style", "arc:10");
    Vista.getUsuSign().putClientProperty("JTextField.leadingIcon", new FlatSVGIcon("imagenes/iconoUsuario.svg"));
    Vista.getContraSign().putClientProperty("JTextField.leadingIcon", new FlatSVGIcon("imagenes/Password.svg"));
    Vista.getCorreoSign().putClientProperty("JTextField.leadingIcon", new FlatSVGIcon("imagenes/Vector.svg"));
  }

  /**
   * Inicia el proceso de registro de un nuevo usuario.
   * Crea un nuevo objeto de usuario y lo guarda en la base de datos.
   */
  public void iniciarPorDefecto() {
    String nombreUsuario = Vista.getUsuSign().getText();
    String contraseñaUsuario = String.valueOf(Vista.getContraSign().getPassword());
    String correoUsuario = Vista.getCorreoSign().getText();
    String generoUsuario = Vista.getGeneroCb().getSelectedItem().toString();
    if (!(nombreUsuario.isEmpty() && correoUsuario.isEmpty() && generoUsuario.isEmpty() && contraseñaUsuario.isEmpty())) {
      Usuarios usuario = new Usuarios(nombreUsuario, correoUsuario, generoUsuario, contraseñaUsuario);
      System.out.println(usuario);
      if (Usuarios.guardarUsuarios(usuario)) {
        System.out.println("Se ha guardado el usuario");
        JOptionPane.showMessageDialog(null, "Usuario creado con éxito", "Bienvenido/a", JOptionPane.WARNING_MESSAGE);

        new Login().setVisible(true);
        Vista.dispose();

      } else {
        System.out.println("No se ha guardado el usuario");
        JOptionPane.showMessageDialog(null, "No ha sido posible crear al usuario", "Error", JOptionPane.WARNING_MESSAGE);

      }
    }
  }

  /**
   * Inicializa los eventos de la vista SignIn.
   * Define el comportamiento del botón de SignIn.
   */
  public void InicializarEventos() {
    Vista.getSignInBtn().addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
        // Lógica para el evento de clic en el botón SignIn
        iniciarPorDefecto();
      }

      @Override
      public void mousePressed(MouseEvent e) {

      }

      @Override
      public void mouseReleased(MouseEvent e) {

      }

      @Override
      public void mouseEntered(MouseEvent e) {

      }

      @Override
      public void mouseExited(MouseEvent e) {

      }
    });;
  }
}
