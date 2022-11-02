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
public class Administrador {

    private Arrendatario[] arrendatario;
    private int cantidad;
    private int maximo;

    public Administrador(int numero) {
        arrendatario = new Arrendatario[numero];
        this.maximo = numero;
    }

    public Administrador(Arrendatario[] arrendatario, int cantidad, int maximo) {
        this.arrendatario = arrendatario;
        this.cantidad = cantidad;
        this.maximo = maximo;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Arrendatario[] getArrendatario() {
        return arrendatario;
    }

    public void setArrendatario(Arrendatario[] arrendatario) {
        this.arrendatario = arrendatario;
    }

    public void agregarArrendatario(Arrendatario arrendador) {
        if (cantidad < maximo) {
            arrendatario[cantidad] = arrendador;
            cantidad += 1;
        } else {
            System.out.println("No hay espacio para agregar al arrendatario");
        }
    }

    public void buscarPorRut(String rut) {
        for (Arrendatario arrendatario1 : arrendatario) {
            if (arrendatario1.getRut().equals(rut)) {
                System.out.println("el arrendatario de Rut" + rut + " esta registrador");
                break;
            } else {
                System.out.println("no se encontro");
                break;
            }
        }
    }

    public void listarArrendatarios() {
        for (Arrendatario temporal : arrendatario) {
            System.out.println("Arrendatario: " + temporal.getNombre() + " Rut:" + temporal.getRut() + " Edad:" + temporal.getEdad() + " Sexo:" + temporal.getSexo());
        }
    }

    public void listarDpto() {
        for (Arrendatario temporal : arrendatario) {
            System.out.println(temporal.getDpto().getNombre());
            System.out.println(temporal.getDpto().getDireccion());
            System.out.println(temporal.getDpto().getNumero());
        }
    }

}
