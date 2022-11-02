/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metereologia2;

/**
 *
 * @author palto
 */
public class Temperatura {
    double[] temperaturas;
    int posicion=0;
    
    public Temperatura(int largo){
        temperaturas = new double[largo];
    }
    
    public void agregarTemperatura(double temperatura){
        temperaturas[posicion]=temperatura;
        posicion = posicion+1;
    }
    
    public double devolverTemperatura(int posicion){
        return temperaturas[posicion];
    }
   
}
