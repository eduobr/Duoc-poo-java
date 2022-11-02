/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

/**
 *
 * @author palto
 */
public abstract class Producto implements Controlable {

    protected int codigo;
    protected int precioBase;
    protected String nombre;

    public Producto() {
    }

    public Producto(int codigo, int precioBase, String nombre) {
        this.codigo = codigo;
        this.precioBase = precioBase;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() >= 3) {
            this.nombre = nombre;
        } else {
            System.out.println("Texto");
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        if (precioBase > 0) {
            this.precioBase = precioBase;
        } else {
            System.out.println("Texto");
        }
    }

    public abstract void recargar();

    public String mostrar() {
        return "Produto{" + " codigo= " + codigo + ", precio= " + precioBase + ", nombre: " + nombre + "}";
    }

    public int totalizar(int cantidad, String dia) {
        int total;
        recargar();
        descontar(dia);
        total=cantidad*precioBase;
        return total;
    }
    
    

}
