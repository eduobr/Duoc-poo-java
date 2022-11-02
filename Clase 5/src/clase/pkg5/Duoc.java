/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg5;

import java.util.Scanner;

/**
 *
 * @author palto
 */
public class Duoc {

    private Persona[] participantes;
    private int cantidad = 0, maximo;

    public Duoc(int largo) {
        participantes = new Persona[largo];
        this.maximo = largo;
    }

    public Persona[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Persona[] participantes) {
        this.participantes = participantes;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public void agregarPersona(Persona nuevoParticipante) {
        if (cantidad < maximo) {
            participantes[cantidad] = nuevoParticipante;
            cantidad = cantidad + 1;
        } else {
            System.out.println("No hay capacidad para agregar al participante");
        }
    }

    public void listarPersonas() {
        for (Persona temporal : participantes) {
            System.out.println("---------------------------");
            System.out.println("Nombre del computador " + temporal.getPc().getNombre());
            System.out.println("Nombre del Participante " + temporal.getUsername());
            System.out.println("Edad del Participante " + temporal.getEdad());
        }

    }

    public void buscarParticipante() {
        System.out.println("Busqueda del participante");
        System.out.println("Ingrese el rut participante");
        Scanner ingreso = new Scanner(System.in);
        String busqueda = ingreso.nextLine();
        for (Persona temporal : participantes) {
            if (temporal.getRut().equals(busqueda)) {
                System.out.println("La persona con el rut " + temporal.getRut() + " es:");
                System.out.println("Nombre del Participante " + temporal.getUsername());
                System.out.println("Edad del Participante " + temporal.getEdad());
            } else {
                System.out.println("El rut ingresado no es correcto");
            }
        }
    }

    public boolean buscarPersona(String rut) {
        boolean valida = false;
        for (Persona temporal : participantes) {
            if (temporal.getRut().equals(rut)) {
                valida = true;
                break;
            }
        }
        return valida;
    }

    public int ObtenerNovatos() {
        int contador = 0;
        for (Persona temporal : participantes) {
            if (temporal.isExperiencia() == false) {
                contador = +1;
            }
        }
        return contador;
    }

}
