/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase.pkg13;

/**
 *
 * @author palto
 */
public class C extends B{

    @Override
    public void metodo1() {
        saludar();
    }

    @Override
    public void metodo2() {
        System.out.println("Mi nombre es "+nombre);
    }

    @Override
    public void metodo3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hablar() {
        
    }
    
}
