/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Tomoutch
 */
public class Panneau extends JPanel {
    
  public void paintComponent(Graphics g){
    g.drawString("Tiens ! Le Site du Zéro !", 10, 20);
  }               
    
}
