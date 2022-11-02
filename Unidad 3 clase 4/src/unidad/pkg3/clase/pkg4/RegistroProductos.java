/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg3.clase.pkg4;

import java.util.ArrayList;

/**
 *
 * @author palto
 */
public class RegistroProductos {

    static ArrayList<Producto> productos;

    public RegistroProductos() {
        productos = new ArrayList<Producto>();
    }
    
    public static void agregarProducto(Producto nuevoProducto){
        if (buscarProducto(nuevoProducto.getCodigo())==false) {
            productos.add(nuevoProducto);
        }else{
            System.out.println("El producto ya existe");
        }
    }
    
    public static boolean buscarProducto(String codigo){
        boolean busca = false;
        for (Producto producto : productos) {
            if (producto.getCodigo()==codigo) {
                busca = true;
                break;
            }else{
                System.out.println("El producto no se encontro");
            }
        }
        return busca;       
    }
    
}
