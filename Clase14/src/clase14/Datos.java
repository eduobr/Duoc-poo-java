/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author palto
 */
public class Datos {
    Scanner tecla = new Scanner(System.in);
    ArrayList notas = new ArrayList();
    int numero = 0;
    
    public ArrayList pedirDatos(){
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese la nota n°:"+(i+1));
            numero = tecla.nextInt();
            notas.add(numero);
        }
        return notas;
    }
    public void mostrarNotas(ArrayList lista){
        for (int i = 0; i <lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}

