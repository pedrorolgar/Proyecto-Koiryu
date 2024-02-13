package Controlador;

import Vista.ModificarPerfil;

/**
 * Controlador para la vista de ModificarPerfil.
 * Gestiona la lógica relacionada con la actualización de estilos en la vista de ModificarPerfil.
 *
 * @author Pedro Rollán García
 */
public class cModificarPerfil {

  private final ModificarPerfil Vista;

  /**
   * Constructor de la clase cModificarPerfil.
   *
   * @param Vista la vista de ModificarPerfil a controlar
   */
  public cModificarPerfil(ModificarPerfil Vista) {
    this.Vista = Vista;

  }

  /**
   * Actualiza los estilos de los componentes en la vista de ModificarPerfil.
   * Configura los campos de texto con texto de marcador y los botones con estilo redondeado.
   */
  public void actualizarEstilos() {
    Vista.getEditarDescripcion().putClientProperty("JTextField.placeholderText", "Añade una descripcion");
    Vista.getEditarNombre().putClientProperty("JTextField.placeholderText", "Introduce el nombre");
    Vista.getEditarCorreo().putClientProperty("JTextField.placeholderText", "Introduce el correo");
    Vista.getCiudad().putClientProperty("JTextField.placeholderText", "Tokyo, Japón");
    Vista.getTelefono().putClientProperty("JTextField.placeholderText", "123456789");
    Vista.getEditarCambios().putClientProperty("JButton.buttonType", "roundRect");
  }
}
