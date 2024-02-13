/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.MiPerfil;
import javax.swing.JPanel;

/**
 *
 * @author Pedro Rollán García
 */
public class cMiPerfil {

  private final MiPerfil Vista;

  /**
   * Instantiates a new C login.
   *
   * @param Vista the vista
   */
  public cMiPerfil(MiPerfil Vista) {
    this.Vista = Vista;
  }

  public void mostrarpanel(JPanel p) {
    p.setSize(1150, 800);
    p.setLocation(256, 0);

    Vista.getFrame().removeAll();
    Vista.getFrame().add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 800));
    Vista.getFrame().revalidate();
    Vista.getFrame().repaint();
  }
}
