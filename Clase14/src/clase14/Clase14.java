/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase14;

/**
 *
 * @author palto
 */
public class Clase14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Datos d = new Datos();
        Calculo c = new Calculo();
        //d.pedirDatos();
//        d.mostrarNotas(d.pedirDatos());
//        c.promedio(d.pedirDatos());
        c.notaMayorMenor(d.pedirDatos());
    }
    
}
