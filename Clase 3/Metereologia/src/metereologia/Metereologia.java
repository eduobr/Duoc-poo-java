/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metereologia;

import java.util.Scanner;

/**
 *
 * @author palto
 */
public class Metereologia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidad, temperaturaNegativas;
        double valorTemperaturas, sumaTemperaturas;
        double mayorTemperaturas, menorTemperaturas;

        double[] temperaturas;

        Scanner ingreso = new Scanner(System.in);
        sumaTemperaturas = 0;
        temperaturaNegativas = 0;
        menorTemperaturas = 1000000;
        mayorTemperaturas = -373;

        System.out.println("¿Cuantas temperaturas desea ingresar?}");
        cantidad = ingreso.nextInt();
        System.out.println("");

        temperaturas = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            while (temperaturas[i]>mayorTemperaturas || temperaturas[i]<menorTemperaturas) {
                System.out.println("Ingrese la temperatura N°" + (i + 1) + ": ");
                valorTemperaturas = ingreso.nextInt();
                temperaturas[i] = valorTemperaturas;
                //temperaturas[i] = ingreso.nextInt(); es otra forma de hacerlo 
            }
        }

        for (int i = 0; i < cantidad; i++) {
            //calcula la suma temperaturas
            sumaTemperaturas += temperaturas[i];

            if (temperaturas[i] > mayorTemperaturas) {
                mayorTemperaturas = temperaturas[i];
            }

            if (temperaturas[i] < menorTemperaturas) {
                menorTemperaturas = temperaturas[i];
            }

            if (temperaturas[i] < 0) {
                temperaturaNegativas += 1;
            }
        }
        System.out.println("");
        System.out.println("El promedio de las temperaturas es: " + sumaTemperaturas / cantidad);
        System.out.println("La mayor temperatura es: " + mayorTemperaturas);
        System.out.println("La menor temperatura es:" + menorTemperaturas);
        System.out.println("La menor temperatura negativa es:" + temperaturaNegativas);
    }

}
