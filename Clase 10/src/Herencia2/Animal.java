/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Herencia2;

/**
 *
 * @author palto
 */
public class Animal{
    int patas = 4;
    protected int orejas;
    private int cola = 1;
    
    protected void comer(){
        System.out.println("el animal esta Tomando tody");
    }
    
    public void dormir(){
        System.out.println("el animal esta dormirririritody");
    }
    
    protected void gritar(){
        System.out.println("el animal se esta gritaaaandtoody");
    }
}
