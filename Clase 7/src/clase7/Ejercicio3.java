/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

import java.util.Scanner;

/**
 *
 * @author palto
 */
public class Ejercicio3 {

    public void IngresarNumero() {
        Scanner ingreso = new Scanner(System.in);
        double numeros[] = new double[5];
        int suma = 0;
        double maximo = 0;
        double minimo = 99999999;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            numeros[i] = ingreso.nextDouble();
            suma += numeros[i];
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        double promedio = suma/numeros.length;
        System.out.println("El promedio es "+promedio);
        System.out.println("La suma de las notas es "+suma);
        System.out.println("El numero minimo es "+minimo);
        System.out.println("El numero maximo es "+maximo);
    }
}
