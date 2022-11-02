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
public abstract class Electrodomestico extends Producto implements ProductoDescontable {

    protected String marca;

    public Electrodomestico(String marca, String codigo, int precioBase, int stock) {
        super(codigo, precioBase, stock);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.length() >= 2) {
            this.marca = marca;
        }
    }

}
