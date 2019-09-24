/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JFrame;

/**
 *
 * @author Tomoutch
 */
public class Ejercicio1 extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame fenetre = new Ejercicio1();
        fenetre.setContentPane(new Panneau());
        fenetre.setVisible(true);
           
    }
    
    public Ejercicio1()
    {
        setTitle("Mi premera Java");
        setVisible(true);
        setSize(400, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
