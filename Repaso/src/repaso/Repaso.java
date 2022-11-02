/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author palto
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Imprimir i = new Imprimir();
        i.Escribir();
        System.out.println("Ingrese un mensaje");
        Scanner teclado = new Scanner(System.in);
        String mensaje = teclado.nextLine();
        i.escribirMensaje(mensaje);

    }
}
