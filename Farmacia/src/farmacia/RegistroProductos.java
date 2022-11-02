/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package farmacia;

import java.util.ArrayList;

/**
 *
 * @author palto
 */
public class RegistroProductos {
    
    ArrayList<Producto> productos;

    public RegistroProductos() {
        productos = new ArrayList<Producto>();
    }
    
    public boolean verificarProducto(int codigo){
        boolean valida = false;
        for (Producto temporal:productos) {
            if (temporal.getCodigo()==codigo) {
                valida = true;
                break;
            }
        }
        return valida;
    }
    
    public void agregarProductos(Producto nuevoProducto){
        if (this.verificarProducto(nuevoProducto.getCodigo())==false) {
            productos.add(nuevoProducto);
        }else{
            System.out.println("El producto existe!!");
        }
    }
    
    public void listar(){
        for (Producto temporal:productos) {
            System.out.println(temporal.mostrar());
        }
    }
    
}
