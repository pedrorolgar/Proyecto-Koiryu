/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.Usuarios;
import Vista.Bienvenida;
import Vista.Login;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 * The type C login.
 *
 * @author Pedro Rollán García
 */
public class cLogin {

  private final Login Vista;

  /**
   * Instantiates a new C login.
   *
   * @param Vista the vista
   */
  public cLogin(Login Vista) {
    this.Vista = Vista;
  }

  /**
   * Actualizar estilos.
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
   * Inicializar eventos.
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

      @Override
      public void mouseEntered(MouseEvent mouseEvent) {

      }

      @Override
      public void mouseExited(MouseEvent mouseEvent) {

      }
    });
  }
}
