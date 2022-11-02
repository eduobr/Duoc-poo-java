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

public class SuplementoAlimenticio extends Producto{
    
    private int cantidadVitaminas; //es private ya que no hay herencia
    private String informacionVitaminas;

    public SuplementoAlimenticio() {
    }

    public SuplementoAlimenticio(int cantidadVitaminas, String informacionVitaminas, int codigo, int precioBase, String nombre) {
        super(codigo, precioBase, nombre);
        this.cantidadVitaminas = cantidadVitaminas;
        this.informacionVitaminas = informacionVitaminas;
    }
    

    @Override
    public void recargar() {
        super.precioBase = (int) (super.precioBase+(super.precioBase*0.2*cantidadVitaminas));
    }

    @Override
    public void descontar(String diaSemana) {
        if (diaSemana.equals("Lunes")) {
            super.precioBase = (int)(super.precioBase - super.precioBase*descuento);
        }
    }
    
    @Override
    public String mostrar(){
        return super.mostrar()+" Suplemento Alimenticio{ " + " cantidad vitaminas" + cantidadVitaminas+
                ", informacion Vitaminas"+informacionVitaminas+"]";
    }

    public int getCantidadVitaminas() {
        return cantidadVitaminas;
    }

    public void setCantidadVitaminas(int cantidadVitaminas) {
        this.cantidadVitaminas = cantidadVitaminas;
    }

    public String getInformacionVitaminas() {
        return informacionVitaminas;
    }

    public void setInformacionVitaminas(String informacionVitaminas) {
        this.informacionVitaminas = informacionVitaminas;
    }
    
}
