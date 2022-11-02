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
public class Persona {

    private String rut, username;
    private int edad;
    private char sexo;
    private boolean experiencia;
    private Computador pc;

    public Persona() {
        pc = new Computador();
    }

    public Persona(String rut, String username, int edad, char sexo, boolean experiencia, Computador pc) {
        this.rut = rut;
        this.username = username;
        this.edad = edad;
        this.sexo = sexo;
        this.experiencia = experiencia;
        this.pc = pc;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18 && edad <= 40) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser igual o mayor a 18 y menor o igual a 40");
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo=='F') {
            this.sexo = sexo;
        }
        else{
            System.out.println("El sexo debe ser M o F");
        }
    }

    public boolean isExperiencia() {
        return experiencia;
    }

    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }

    public Computador getPc() {
        return pc;
    }

    public void setPc(Computador pc) {
        this.pc = pc;
    }
    
    public void imprimir(){
        System.out.println("Rut: "+getRut());
        System.out.println("Usernamet: "+getUsername());
        System.out.println("Edad: "+getEdad());
        System.out.println("Sexo: "+getSexo());
        System.out.println("Experiencia: "+isExperiencia());
        System.out.println("Datos del computador: ");
        System.out.println("Nombre: "+pc.getNombre());
        System.out.println("Tarjeta: "+pc.getTarjeta());
        System.out.println("Memoria: "+pc.getMemoria());
    }

}
