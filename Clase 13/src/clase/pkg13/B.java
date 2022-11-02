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
public abstract class B implements A {

    public String nombre = "Pepito";
    protected int edad = 27;

    public void saludar() {
        System.out.println("Buenas Tardes");
    }
    
    public abstract void hablar();
    
    

}
