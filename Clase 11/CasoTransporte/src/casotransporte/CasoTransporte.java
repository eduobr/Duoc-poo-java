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
public class CasoTransporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicicleta bici;
        Automovil auto;
        Avion avion;
        Comercial comercial;
        Privado privado;
        
        bici = new Bicicleta('S',30,25,2,150000,0);
        auto = new Automovil('N',50,250,5,15000000,10000);
        avion = new Avion(1200,600,120,200,150000000,1000000);
        
        bici.obtenerCanasto();
        auto.obtener4x4();
        avion.obtenerAltura();
        avion.obtenerPasajeros();
        
        
        
    }
    
}
