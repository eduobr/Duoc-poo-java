/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BibliotecaUniv;

/**
 *
 * @author palto
 */
public class Revista extends Documento{
    private int volumen;
    private int numero;
    private String mesSalida;

    public Revista(int volumen, int numero, String mesSalida, int codigo, String titulo, String autor, String editorial, String añoPublicacion) {
        super(codigo, titulo, autor, editorial, añoPublicacion);
        this.volumen = volumen;
        this.numero = numero;
        this.mesSalida = mesSalida;
    }

    public String getMesSalida() {
        return mesSalida;
    }

    public void setMesSalida(String mesSalida) {
        this.mesSalida = mesSalida;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString()+" Revista:" + "volumen:" + volumen + ", numero:" + numero + ", mesSalida:" + mesSalida; //To change body of generated methods, choose Tools | Templates.
    }

}
