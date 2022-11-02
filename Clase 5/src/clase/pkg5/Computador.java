/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg5;

/**
 *
 * @author palto
 */
public class Computador {

    private String nombre;
    private String tarjeta;
    private int memoria;

    public Computador() {
    }

    public Computador(String nombre, String tarjeta, int memoria) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
        this.memoria = memoria;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        if (memoria > 0) {
            this.memoria = memoria;
        }else{
            System.out.println("La memoria tiene que ser mayor a 0");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        if (tarjeta.length() >= 2) {
            this.tarjeta = tarjeta;
        } else {
            System.out.println("La tarjeta debe tener minimo 2 caracteres");
        }
    }

}
