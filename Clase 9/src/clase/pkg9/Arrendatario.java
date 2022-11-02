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
public class Arrendatario {

    private String nombre;
    private String rut;
    private int edad;
    private char sexo;
    private Departamento dpto;

    public Arrendatario() {
        dpto = new Departamento();
    }

    public Arrendatario(String nombre, String rut, int edad, char sexo, Departamento dpto) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.sexo=sexo;
        this.dpto = dpto;
    }


    public Departamento getDpto() {
        return dpto;
    }

    public void setDpto(Departamento dpto) {
        this.dpto = dpto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18 && edad <= 120) {
            this.edad = edad;
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo=='M' || sexo =='F') {
            this.sexo = sexo;
        }
        else{
            System.out.println("El sexo ingresado no es correcto");
        }
    }

}
