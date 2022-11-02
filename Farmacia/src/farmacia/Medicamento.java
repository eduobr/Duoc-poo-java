/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package farmacia;

/**
 *
 * @author palto
 */
public class Medicamento extends Producto{
    
    private boolean generico;

    public Medicamento() {
    }

    public Medicamento(boolean generico, int codigo, int precioBase, String nombre) {
        super(codigo, precioBase, nombre);
        this.generico = generico;
    }
    

    @Override
    public void recargar() {
        if (generico==false) {
            super.precioBase = (int)(0.2*super.precioBase+super.precioBase);
            
        }
    }

    @Override
    public void descontar(String diaSemana) {
        if (diaSemana.equals("lunes") && generico == true) {
            super.precioBase=(int)(super.precioBase-super.precioBase*descuento);
        }
    }
    
    public String mostrar(){
        return super.mostrar()+" medicamento[ generico="+generico+"]";
    }

    public boolean isGenerico() {
        return generico;
    }

    public void setGenerico(boolean generico) {
        this.generico = generico;
    }
    
    
}
