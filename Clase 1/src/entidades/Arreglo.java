/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author palto
 */
public class Arreglo {
    // un Arreglo es una lista de elementos del mismo tipo de dato.

    //    Se puede anotar de dos formas diferentes:
    //    1-int[]arreglo1;
    //    2-String arreglo2[];
    //    La forma estandar es la uno
    
    // Asignacion de tamaño
    //    arreglo1= new int[5];
    //    Se puede escribir en una sola linea asi:
    //    String []arreglo3 = new String[10];
    
    //Asignando valores a un Arreglo
    //    int []numeros = {1,0,5,10,20};
    //    para llamar a la posicion 0 del arreglo es: numeros[0]
    
    public void escribirNumero() {
        int[] numero = {1, 0, 5, 10, 20};
        for (int i = 1; i <= numero.length; i++) {
            System.out.println(numero[i-1]);
        }

    }
}
