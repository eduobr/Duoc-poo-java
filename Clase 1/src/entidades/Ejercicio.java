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
public class Ejercicio {
    //Definir 2 arreglos de tamaño 5 y se debe mostrar en pantalla la suma
    //de sus elementos respectivos

    public void sumaDeArreglos() {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 0, 1, 0, 1};
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]+b[i]);
        }
    }

}
