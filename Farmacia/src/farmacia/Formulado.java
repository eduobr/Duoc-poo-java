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
public class Formulado extends Medicamento{
    private String contraindicaciones;

    public Formulado(String contraindicaciones, boolean generico, int codigo, int precioBase, String nombre) {
        super(generico, codigo, precioBase, nombre);
        this.contraindicaciones = contraindicaciones;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }
    
    @Override
    public String mostrar(){
        return super.mostrar()+ " Formulado { contraindicaciones"+contraindicaciones+"}";
    }
    

    
}
