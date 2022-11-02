/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animal;

/**
 *
 * @author palto
 */
public class Caballo implements Animal {

    @Override
    public void avanzar() {
        System.out.println("Galopar");
    }

    @Override
    public void comer() {
        System.out.println("Comer");
    }
    
}
