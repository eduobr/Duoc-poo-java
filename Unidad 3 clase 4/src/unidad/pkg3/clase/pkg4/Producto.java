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
public abstract class Producto {

    protected String codigo;
    protected int precioBase;
    protected int stock;

    public Producto(String codigo, int precioBase, int stock) {
        this.codigo = codigo;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        if (precioBase > 0) {
            this.precioBase = precioBase;
        }
    }

}
