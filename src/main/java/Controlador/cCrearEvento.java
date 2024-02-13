package Controlador;

import Vista.CrearEvento;

public class cCrearEvento {

  private final CrearEvento vista;

  public cCrearEvento(CrearEvento vista) {
    this.vista = vista;

  }

  public void actualizarEstilos() {
    vista.getDescripcionEvento().putClientProperty("JTextField.placeholderText", "Añade una descripcion al evento");
    vista.getNombreEvento1().putClientProperty("JTextField.placeholderText", "Introduce el nombre");
  }

}
