/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase14;

import java.util.ArrayList;

/**
 *
 * @author palto
 */
public class Calculo extends Datos implements Interface_Calculo{
    Datos a = new Datos();

    @Override
    public void promedio(ArrayList Lista2) {
        int suma =0;
        double promedio = 0;
        for (int i = 0; i < Lista2.size(); i++) {
            suma+= (Integer)Lista2.get(i);
        }
        promedio = suma/Lista2.size();
        System.out.println("Promedio:"+promedio);
    }

    @Override
    public void estado() {
        
    }
    public void notaMayorMenor(ArrayList list){
        list.sort(null); // pa ordenar
        System.out.println("Nota Maxima:"+list.get(list.size()-1));
        System.out.println("Nota Minima:"+list.get(0));
    }
}
