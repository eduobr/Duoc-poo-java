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
public class Documento {
    protected int codigo;
    protected String titulo;
    protected String autor;
    protected String editorial;
    protected String añoPublicacion;

    public Documento(int codigo, String titulo, String autor, String editorial, String añoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.añoPublicacion = añoPublicacion;
    }

    public String getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(String añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Documento " + "codigo:" + codigo + ", titulo:" + titulo + ", autor:" + autor + ", editorial:" + editorial + ", a\u00f1oPublicacion:" + añoPublicacion;
    }
  
    
    
}
