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
public class Avion extends Transporte {

    private double altura;

    public Avion(double altura, int velocidad, int potencia, int pasajeros, int costo, int consumo) {
        super(velocidad, potencia, pasajeros, costo, consumo);
        this.altura = altura;
    }

    public void obtenerAltura() {
        System.out.println("Altura: " + altura);
    }

    public void obtenerPotencia(int incremento) {
        System.out.println("Potencia: " + super.potencia + incremento);
    }
    
        
}
