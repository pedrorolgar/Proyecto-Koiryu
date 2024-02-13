/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Bienvenida;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.JPanel;

/**
 * Controlador para la vista de Bienvenida.
 * Gestiona la actualización de estilos y la visualización de paneles en la vista.
 *
 * @author Pedro Rollán
 */
public class cBienvenida {

  private final Bienvenida Vista;

  /**
   * Constructor de la clase cBienvenida.
   *
   * @param Vista la vista de Bienvenida a controlar
   */
  public cBienvenida(Bienvenida Vista) {
    this.Vista = Vista;
  }

  /**
   * Actualiza los estilos de la vista de Bienvenida.
   * Configura el texto de marcador de posición y el icono de búsqueda para el campo de búsqueda.
   */
  public void actualizarEstilos() {
    Vista.getSearchTf().putClientProperty("JTextField.placeholderText", "Search");
    Vista.getSearchTf().putClientProperty("JTextField.leadingIcon", new FlatSVGIcon("imagenes/lupa.svg"));
  }

  /**
   * Muestra un panel en la vista de Bienvenida.
   *
   * @param p el panel a mostrar
   */
  public void mostrarpanel(JPanel p) {
    p.setSize(1150, 800);
    p.setLocation(0, 0);

    Vista.getFrame().removeAll();
    Vista.getFrame().add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 800));
    Vista.getFrame().revalidate();
    Vista.getFrame().repaint();
  }

}
