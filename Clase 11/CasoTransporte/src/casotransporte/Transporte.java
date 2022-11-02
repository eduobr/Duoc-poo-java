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
public class Transporte {
    //Atributos
    protected int velocidad, potencia, pasajeros;
    protected int costo, consumo;

    public Transporte(int velocidad, int potencia, int pasajeros, int costo, int consumo) {
        this.velocidad = velocidad;
        this.potencia = potencia;
        this.pasajeros = pasajeros;
        this.costo = costo;
        this.consumo = consumo;
    }
    
    public void obtenerVelocidad(){
        System.out.println("Velocidad: "+velocidad);
    }
    
    public void obtenerPotencia(){
        System.out.println("Potencia: "+potencia);
    }
    
    public void obtenerPasajeros(){
        System.out.println("Pasajeros: "+pasajeros);
    }
    
    public void obtenerCostro(){
        System.out.println("Costo: "+costo);
    }
    
    public void obtenerConsumo(){
        System.out.println("Consumo: "+consumo);
    }
    
    
    
}
