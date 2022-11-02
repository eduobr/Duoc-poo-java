/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacegrafica2;

import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author palto
 */
public class InterfaceGrafica2 extends JFrame{

    public void InterfaceGrafica2(){
        Inicio();
    }

    private void Inicio() {
        JButton boton = new JButton("Cerrar");
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });
        
        crearLayout(boton);
        
        setTitle("Boton cerrar");
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    private void crearLayout(JComponent... arg){
        Container pane = getContentPane();
        GroupLayout grupo1 = new GroupLayout(pane);
        pane.setLayout(grupo1);
        grupo1.setAutoCreateContainerGaps(true);
        grupo1.setHorizontalGroup(grupo1.createSequentialGroup().addComponent(arg[0]));
        grupo1.setVerticalGroup(grupo1.createSequentialGroup().addComponent(arg[0]));
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
           @Override
           public void run(){
               InterfaceGrafica2 i = new InterfaceGrafica2();
               i.setVisible(true);
           }
        });
        
    }

    
}
