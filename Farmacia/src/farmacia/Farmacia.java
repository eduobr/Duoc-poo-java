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
public class Farmacia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Medicamento remedio;
        RegistroProductos rp;
        
        // crear remedio
        remedio = new Medicamento(true, 1, 9000, "Paracetamol");
        
        //obtener el total 
        System.out.println("Total: $"+remedio.totalizar(2, "lunes"));
        
        // agregar el remedio
        rp = new RegistroProductos();
        rp.agregarProductos(remedio);
        
        //listar
        rp.listar();
                
    }
    
}
