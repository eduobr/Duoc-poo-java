/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg9;


/**
 *
 * @author palto
 */
public class Departamento {

    //Atributos
    private String nombre;
    private String direccion;
    private int numero;

    public Departamento() {
    }

    public Departamento(String nombre, String direccion, int numero) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero >= 101 && numero <= 2205) {
            this.numero = numero;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    

}
