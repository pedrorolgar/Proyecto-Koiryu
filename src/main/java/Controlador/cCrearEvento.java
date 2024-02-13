package Controlador;

import Vista.CrearEvento;

/**
 * Controlador para la vista de CrearEvento.
 * Gestiona la actualización de estilos en la vista de CrearEvento.
 *
 * @author Pedro Rollán
 */
public class cCrearEvento {

  private final CrearEvento vista;

  /**
   * Constructor de la clase cCrearEvento.
   *
   * @param vista la vista de CrearEvento a controlar
   */
  public cCrearEvento(CrearEvento vista) {
    this.vista = vista;
  }

  /**
   * Actualiza los estilos de la vista de CrearEvento.
   * Configura el texto de marcador de posición para la descripción y el nombre del evento,
   * así como el tipo de botón para el botón de crear evento.
   */
  public void actualizarEstilos() {
    vista.getDescripcionEvento().putClientProperty("JTextField.placeholderText", "Añade una descripción al evento");
    vista.getNombreEvento1().putClientProperty("JTextField.placeholderText", "Introduce el nombre");
    vista.getCrearEvento().putClientProperty("JButton.buttonType", "roundRect");
  }

}
