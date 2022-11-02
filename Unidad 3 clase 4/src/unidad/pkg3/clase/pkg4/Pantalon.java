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
public class Pantalon extends Producto {

    private String tipo;
    private char sexo;

    public Pantalon(String tipo, char sexo, String codigo, int precioBase, int stock) {
        super(codigo, precioBase, stock);
        this.tipo = tipo;
        this.sexo = sexo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("jeans") || tipo.equals("cotele") || tipo.equals("tela")) {
            this.tipo = tipo;

        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'H') {
            this.sexo = sexo;
        }
    }

}
