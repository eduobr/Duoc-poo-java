/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author palto
 */
public class Unidad3 extends JFrame {

    public void Unidad3() {
        Inicio();
    }

    private void Inicio() {
        setTitle("Mi primera ventana Swing");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Unidad3 ejemplo = new Unidad3();
                ejemplo.setVisible(true);
            }
        });
    }

}
