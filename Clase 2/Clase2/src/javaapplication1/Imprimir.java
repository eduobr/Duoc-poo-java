/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author palto
 */
public class Imprimir {
    int [] a = {1,2,3,4,5};
    int [] b = {2,4,6,8,10};
    int [][] c = {{1,2},{2,3}}; // ARREGLO BIDIMENSIONAL
    String [] nombre = {"JIJO","Uretre","COKE","Perkin"};
    
    
    public void escribir(){
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    } 
    public void Sumar(){
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]+b[i]);
        }
    }
    public void EscribirArreglo2(){
        for (int num : b) {
            System.out.println(num);
            
        }
    }
    public void ArregloBidimensional(){
         for (int i = 0; i < 2; i++) {
             for (int j = 0; j < 2; j++) {
                  System.out.print(c[i][j]+" ");
             }
             System.out.println("");
        }
         
    }
    public void escrieNombre(){
        for (int i = 0; i < 4; i++) {
            System.out.println("Alumno Nª "+(i+1)+" : "+nombre[i]);
            
        }
    }
    public void promedio(){
        for (int i = 0; i < 2; i++) {
             for (int j = 0; j < 2; j++) {
                  System.out.println((c[i][j]+c[i][j])/4);
             }
        }
    }
}
