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
public class Carne extends Producto {

    private char categoria;
    private String pais;

    public Carne(char categoria, String pais, String codigo, int valor, int stock) {
        super(codigo, valor, stock);
        this.categoria = categoria;
        this.pais = pais;
    }


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        if (pais.length() >= 1) {
            this.pais = pais;
        }
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        if (categoria == 'V' || categoria == 'A' || categoria == 'C' || categoria == 'U' || categoria == 'N' || categoria == 'O') {
            this.categoria = categoria;
        }else{
            System.out.println("La categoria debe ser V, A, C, U, N, O");
        }
    }

    @Override
    public int porcentajeDescuento(String dia) {
        int auxdescuento = 0;
        if ("Miercoles".equals(dia)) {
            auxdescuento = (int)(super.valor*super.porcDescuento);
        }
        return auxdescuento;
    }

    @Override
    public int calcularTotal(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


}
