/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Bienvenida;
import Vista.Login;
import com.formdev.flatlaf.extras.FlatSVGIcon;

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
}
