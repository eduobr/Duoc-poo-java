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
public class Automovil extends Transporte{
    private char es4x4;

    public Automovil(char es4x4, int velocidad, int potencia, int pasajeros, int costo, int consumo) {
        super(velocidad, potencia, pasajeros, costo, consumo);
        this.es4x4 = es4x4;
    }
    
    public void obtener4x4(){
            System.out.println("Es 4x4? "+es4x4);
    }
    
}
