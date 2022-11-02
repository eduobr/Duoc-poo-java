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
public interface ProductoDescontable {
    double porcDescuento = 0.08;
    public int porcentajeDescuento(String dia);
    public int calcularTotal(int cantidad);
}
