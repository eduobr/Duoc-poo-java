/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package casotransporte;

/**
 *
 * @author palto
 */
public class Bicicleta extends Transporte{
    //definiendo atributos
    private char tieneCanasto;

    public Bicicleta(char tieneCanasto, int velocidad, int potencia, int pasajeros, int costo, int consumo) {
        super(velocidad, potencia, pasajeros, costo, consumo);
        this.tieneCanasto = tieneCanasto;
    }
    
    public void obtenerCanasto(){
         System.out.println("Tiene Canasto? "+tieneCanasto);
    }
    
    //Sobreescritura
    @Override
    public void obtenerPasajeros(){
        System.out.println("");
    }
    
    
    
}
