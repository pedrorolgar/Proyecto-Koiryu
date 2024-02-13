/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Bienvenida;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.JPanel;

/**
 *
 * @author Alumno
 */
public class cBienvenida {

  private final Bienvenida Vista;

  /**
   * Instantiates a new C login.
   *
   * @param Vista the vista
   */
  public cBienvenida(Bienvenida Vista) {
    this.Vista = Vista;
  }

  /**
   * Actualizar estilos.
   */
  public void actualizarEstilos() {
    Vista.getSearchTf().putClientProperty("JTextField.placeholderText", "Search");
    Vista.getSearchTf().putClientProperty("JTextField.leadingIcon", new FlatSVGIcon("imagenes/lupa.svg"));
  }

  public void mostrarpanel(JPanel p) {
    p.setSize(1150, 800);
    p.setLocation(0, 0);

    Vista.getFrame().removeAll();
    Vista.getFrame().add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 800));
    Vista.getFrame().revalidate();
    Vista.getFrame().repaint();
  }
  /*
  public static void IdiomaEspañol() {
    ResourceBundle idioma = ResourceBundle.getBundle("idioma");

    // Ejemplo de cómo establecer el texto de un botón
    Vistadescubrir.setText(idioma.getString());
    JButton boton = new JButton();
    boton.setText(idioma.getString("etiqueta_boton_abrir"));

    // Ejemplo de cómo establecer el texto de una etiqueta
    JLabel etiqueta = new JLabel();
    etiqueta.setText(idioma.getString("etiqueta_bienvenida"));
  }*/

}
