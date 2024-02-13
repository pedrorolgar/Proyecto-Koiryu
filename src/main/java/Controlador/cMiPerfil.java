package Controlador;

import Vista.MiPerfil;
import javax.swing.JPanel;

/**
 * Controlador para la vista de MiPerfil.
 * Gestiona la lógica relacionada con la visualización de diferentes paneles en la vista de MiPerfil.
 *
 * @author Pedro Rollán García
 */
public class cMiPerfil {

  private final MiPerfil Vista;

  /**
   * Constructor de la clase cMiPerfil.
   *
   * @param Vista la vista de MiPerfil a controlar
   */
  public cMiPerfil(MiPerfil Vista) {
    this.Vista = Vista;
  }

  /**
   * Muestra un panel especificado en la vista de MiPerfil.
   *
   * @param p el panel a mostrar
   */
  public void mostrarpanel(JPanel p) {
    p.setSize(1150, 800);
    p.setLocation(256, 0);

    Vista.getFrame().removeAll();
    Vista.getFrame().add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 800));
    Vista.getFrame().revalidate();
    Vista.getFrame().repaint();
  }
}
