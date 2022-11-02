/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supermercado;

/**
 *
 * @author palto
 */
public abstract class Producto implements ProductoDescontable {

    protected String codigo;
    protected int valor;
    public int stock;

    public Producto() {
    }

    public Producto(String codigo, int Valor, int Stock) {
        this.codigo = codigo;
        this.valor = Valor;
        this.stock = Stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int Stock) {
        if (Stock >= 0) {
            this.stock = Stock;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int Valor) {
        this.valor = Valor;
    }

}
