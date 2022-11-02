/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package herencia;

/**
 *
 * @author palto
 */
public class Animal {
    public void calculo(){
        int a = 25;
        int b = 50;
        int c = a*b;
        System.out.println("La multiplicacion es: "+c);
    }
    public int calculo(int a, int b){
        int c=a*b;
        return c; 
    }
    
    public int calculo(int a, int b, int c){
        int d=a*b*c;
        return d;
    }
}
