/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase.pkg9;

/**
 *
 * @author palto
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    
    //1)Ingresar 3 departamentos
    //2)Ingresar 3 arrendatarios asociados a un departamento
    //3)en clase arrendatarios validar la edad mas de 18 menor a 120
    //4)validar que el arrendatario sea masculino o femenino
    //5)validar que el numero del depto sea entre 1001-2205
    //6)Buscar los arrendatarios por rut
    //7)Crear un metodo para listar los arrendatarios
    //8)listar solo los departamentos
    //9)contar los arrendatarios masculinos,femeninos

    public static void main(String[] args) {
        Arrendatario arrendatario1,arrendatario2,arrendatario3;
        Departamento d1 = new Departamento("departamento1","chile con peru",1);
        Departamento d2 = new Departamento("departamento2","bolivia con lituania",2);
        Departamento d3 = new Departamento("departamento3","uruguay con canada",23);
        arrendatario1 = new Arrendatario("pedro","12345678-9",20,'M',d1);
        arrendatario2 = new Arrendatario("juan","12345679-9",28,'M',d2);
        arrendatario3 = new Arrendatario("diego","12345668-9",34,'M',d3);
        Administrador a = new Administrador(3);
        a.agregarArrendatario(arrendatario1);
        a.agregarArrendatario(arrendatario2);
        a.agregarArrendatario(arrendatario3);
        a.listarArrendatarios();
        a.listarDpto();
        
    }
    
}
