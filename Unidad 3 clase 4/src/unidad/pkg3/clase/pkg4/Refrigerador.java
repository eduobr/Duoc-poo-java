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
public class Refrigerador extends Electrodomestico{
    private int cantidadPies;

    public Refrigerador(int cantidadPies, String marca, String codigo, int precioBase, int stock) {
        super(marca, codigo, precioBase, stock);
        this.cantidadPies = cantidadPies;
    }

    public int getCantidadPies() {
        return cantidadPies;
    }

    public void setCantidadPies(int cantidadPies) {
        this.cantidadPies = cantidadPies;
    }
    
    

    
}
