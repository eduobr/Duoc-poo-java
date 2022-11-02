/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unidad.pkg3.clase.pkg4;

/**
 *
 * @author palto
 */
public class Lavadora extends Electrodomestico{
    private char carga;

    public Lavadora(char carga, String marca, String codigo, int precioBase, int stock) {
        super(marca, codigo, precioBase, stock);
        this.carga = carga;
    }

    public char getCarga() {
        return carga;
    }

    public void setCarga(char carga) {
        this.carga = carga;
    }
        
    
}
