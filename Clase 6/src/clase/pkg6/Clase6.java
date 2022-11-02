/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg6;

import java.util.Scanner;

/**
 *
 * @author palto
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String tablero[][] = new String[3][3];
        Scanner ingreso = new Scanner(System.in);
        int n = 0, fila = 0, columna = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                tablero[i][j] = " ";
            }
        }

        System.out.println("  0    1   2");
        System.out.println("0_" + tablero[0][0] + "_|_" + tablero[0][1] + "_|_" + tablero[0][2] + "_");
        System.out.println("1_" + tablero[1][0] + "_|_" + tablero[1][1] + "_|_" + tablero[1][2] + "_");
        System.out.println("2 " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " ");
        while (n < 9) {
            System.out.println("Es su turno ingrese su fila");
            fila = ingreso.nextInt();
            int filaMaq = (int) (Math.random()*2);
            System.out.println("ingrese su Columna");
            columna = ingreso.nextInt();
            int columnaMaq = (int) (Math.random()*2);
            tablero[fila][columna] = "x";
            if(filaMaq == fila && columnaMaq==columna){
                filaMaq = (int) (Math.random()*2);
                columnaMaq = (int) (Math.random()*2);
            }
            tablero[filaMaq][columnaMaq] = "0";
            System.out.println("  0    1   2");
            System.out.println("0_" + tablero[0][0] + "_|_" + tablero[0][1] + "_|_" + tablero[0][2] + "_");
            System.out.println("1_" + tablero[1][0] + "_|_" + tablero[1][1] + "_|_" + tablero[1][2] + "_");
            System.out.println("2 " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " ");
            while (tablero[fila][columna] == "x" || tablero[fila][columna]=="0") {
                System.out.println("Esa posicion esta ocupada");
                System.out.println("Es su turno ingrese su fila");
                fila = ingreso.nextInt();
                System.out.println("ingrese su Columna");
                columna = ingreso.nextInt();

            }
            n = n + 1;
            System.out.println("");
            if(tablero[0][0] =="x" &&tablero[0][1] =="x" && tablero[0][2] =="x"){
                System.out.println("Ganaste!!");
                break;
            }
            if(tablero[1][0] =="x" &&tablero[1][1] =="x" && tablero[1][2] =="x"){
                System.out.println("Ganaste!!");
                break;
            }
            if(tablero[2][0] =="x" &&tablero[2][1] =="x" && tablero[2][2] =="x"){
                System.out.println("Ganaste!!");
                break;
            }
        }

    }

}
