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
public class Libro extends Documento{
    
    private boolean prestamo;

    public Libro(boolean prestamo, int codigo, String titulo, String autor, String editorial, String añoPublicacion) {
        super(codigo, titulo, autor, editorial, añoPublicacion);
        this.prestamo = prestamo;
    }

    public boolean isPretamo() {
        return prestamo;
    }

    public void setPretamo(boolean pretamo) {
        this.prestamo = pretamo;
    }

    @Override
    public String toString() {
        return super.toString()+" prestamo:"+prestamo; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
