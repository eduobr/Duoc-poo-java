/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase.pkg5;

/**
 *
 * @author palto
 */
public class Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duoc duocUC;
        Persona persona1,persona2,persona3,persona4;
        Computador pc1, pc2, pc3, pc4;
        
        pc1= new Computador("Acer","Graphics pro",10);
        pc2= new Computador("Mac","Tarjeta dedicada",4);
        pc3= new Computador("XPS","Graphics x7-1200",6);
        pc4= new Computador("Samsung s7-1250","Graphics pro",4);
        
        persona1 = new Persona("12345678-5","Juan",20,'M',true,pc1);
        persona2 = new Persona("12345678-2","Toma",25,'M',false,pc2);
        persona3 = new Persona("12345678-1","Elterrible",18,'F',true,pc3);
        persona4 = new Persona("12345678-8","Tody",21,'M',true,pc4);
        
        duocUC = new Duoc(4);
        duocUC.agregarPersona(persona1);
        duocUC.agregarPersona(persona2);
        duocUC.agregarPersona(persona3);
        duocUC.agregarPersona(persona4);
        
        
        System.out.println(duocUC.buscarPersona("12345678-8"));
        System.out.println("El numero de novatos es:"+duocUC.ObtenerNovatos());
        duocUC.buscarParticipante();
        
    }
    
}
