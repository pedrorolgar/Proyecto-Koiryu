/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.Usuarios;
import Vista.SignIn;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * The type C sign in.
 * @author Pedro Rollán García
 */
public class cSignIn {

  private final SignIn Vista;

  /**
   * Instantiates a new C sign in.
   *
   * @param Vista the vista
   */
  public cSignIn(SignIn Vista) {
    this.Vista = Vista;
  }

  /**
   * Actualizar estilos.
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
    Vista.getContraSign().putClientProperty("JTextField.leadingIcon", new FlatSVGIcon("imagenes/password.svg"));
    Vista.getCorreoSign().putClientProperty("JTextField.leadingIcon", new FlatSVGIcon("imagenes/Vector.svg"));
  }

  /**
   * Inicializar eventos.
   */
  public void InicializarEventos() {
    Vista.getSignInBtn().addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
        String nombreUsuario = Vista.getUsuSign().getText();
        String contraseñaUsuario = String.valueOf(Vista.getContraSign().getPassword());
        String correoUsuario = Vista.getCorreoSign().getText();
        String generoUsuario = Vista.getGeneroCb().getSelectedItem().toString();
        if (!(nombreUsuario.isEmpty() && correoUsuario.isEmpty() && generoUsuario.isEmpty() && contraseñaUsuario.isEmpty())) {
          Usuarios usuario = new Usuarios(nombreUsuario, correoUsuario, generoUsuario, contraseñaUsuario);
          System.out.println(usuario);
          if (Usuarios.guardarUsuarios(usuario)) {
            System.out.println("Se ha guardado el usuario");
          } else {
            System.out.println("No se ha guardado el usuario");
          }

        }
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
