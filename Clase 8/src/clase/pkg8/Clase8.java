/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase.pkg8;

import Controlador.ImprimirControlador;
import Modelo.Persona;
import java.util.ArrayList;

/**
 *
 * @author palto
 */
public class Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ImprimirControlador i = new ImprimirControlador();
//        Persona p = new Persona();
        ArrayList cuentos = new ArrayList();
        ArrayList autos = new ArrayList();
        
        //Agrega el objeto desde la posicion 0
//        cuentos.add("POO2201");
//        cuentos.add(autos);
//        
//        Agrega el objeto desde la posicion indicada
//        cuentos.add(5, "Buenas Tardes");
        
        ArrayList ColoColo = new ArrayList();
        ColoColo.add(10);
        ColoColo.add(15);
        ColoColo.add(25);
 
        int goles = (int) ColoColo.get(2);
        System.out.println(goles);
        
        //Elimina una posicion
        ColoColo.remove(1);
        
        //Elimina todo el array lisgt
        ColoColo.clear();
    }
    
}
