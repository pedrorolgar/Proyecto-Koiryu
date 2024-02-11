/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Login;
import Vista.RecuperarContraseña;
import com.formdev.flatlaf.extras.FlatSVGIcon;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

/**
 * The type C recuperar contraseña.
 *
 * @author Pedro Rollán García
 */
public class cRecuperarContraseña {

    private final RecuperarContraseña Vista;

    /**
     * Instantiates a new C recuperar contraseña.
     *
     * @param Vista the vista
     */
    public cRecuperarContraseña(RecuperarContraseña Vista) {
        this.Vista = Vista;
    }

    /**
     * Actualizar estilos.
     */
    public void actualizarEstilos() {
        Vista.getCorreoRecuperar().putClientProperty("JTextField.placeholderText", "TuCorreo@Gmail.com");
        Vista.getCorreoRecuperar().putClientProperty("FlatLaf.style", "arc:10");
        Vista.getCorreoRecuperar().putClientProperty("JTextField.leadingIcon", new FlatSVGIcon("imagenes/Vector.svg"));
    }

    /**
     * Inicializar eventos.
     */
    public void inicializarEventos() {
        Vista.getEnviarRecuperar().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                try {
                    EmailUtil.confMail(Vista.getCorreoRecuperar().getText());
                    new Login().setVisible(true);
                    Vista.dispose();
                } catch (IOException e) {
                    throw new RuntimeException(e);
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
