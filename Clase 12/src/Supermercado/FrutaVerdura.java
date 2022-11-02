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
public class FrutaVerdura extends Producto{
    private boolean organica;

    public FrutaVerdura(boolean organica, String codigo, int Valor, int Stock) {
        super(codigo, Valor, Stock);
        this.organica = organica;
    }

    public boolean isOrganica() {
        return organica;
    }

    public void setOrganica(boolean organica) {
        this.organica = organica;
    }

    @Override
    public int porcentajeDescuento(String dia) {
        int auxdescuento = 0;
        if ("Lunes".equals(dia)) {
            auxdescuento = (int)(super.valor*super.porcDescuento);
        }
        return auxdescuento;
    }

    @Override
    public int calcularTotal(int cantidad) {
        if (cantidad<stock) {
            return super.valor;
        }
        return 0;
    }
    
}
