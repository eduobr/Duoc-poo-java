/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

import java.util.Arrays;

/**
 *
 * @author palto
 */
public class Ejercicio4 {

    public void Intercalar() {
        int numeros[] = {2, 7, 9, 8, 10};
        int numeros2[] = {3, 1, 5, 2, 3};
        int numerosIntercalado[] = new int[10];
        Arrays.sort(numeros);
        Arrays.sort(numeros2);
        for (int temporal : numeros) {
            System.out.println(temporal);
        }
        System.out.println("");
        for (int temporal : numeros2) {
            System.out.println(temporal);
        }
        System.out.println("");
        int i = 0;
        int contador = 0;
        while (i < 5) {
            if (i % 2 == 0) {
                numerosIntercalado[contador] = numeros[i];
                contador++;
            }else{
                numerosIntercalado[contador] = numeros2[i];
                contador++; 
            }
            i++;
        }
        for (int temporal : numerosIntercalado) {
            System.out.println(temporal);
        }

    }
}
