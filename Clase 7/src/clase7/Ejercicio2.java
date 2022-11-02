/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

/**
 *
 * @author palto
 */
public class Ejercicio2 {

    public void Imprimir() {
        int secuencia[] = new int[20];
        int i = 0;
        while (i < 19) {
            secuencia[i] = i + 1;
            secuencia[i + 1] = i + 5;
            System.out.println(secuencia[i]);
            System.out.println(secuencia[i + 1]);
            i = i + 2;
        }
    }

}

