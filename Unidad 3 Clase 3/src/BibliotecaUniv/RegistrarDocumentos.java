/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BibliotecaUniv;

import java.util.ArrayList;

/**
 *
 * @author palto
 */
public class RegistrarDocumentos {

    static ArrayList<Documento> documentos;

    public RegistrarDocumentos() {
        documentos = new ArrayList<Documento>();
    }
    
    public static boolean verificarDocuemento(int codigo){
        boolean valida = false;
        for (Documento temporal : documentos) {
            if (temporal.getCodigo() == codigo) {
                valida = true;
                break;
            }
        }
        return valida;
    }
    
    public static void agregarDocumento(Documento nuevoDocumento){
        if (verificarDocuemento(nuevoDocumento.getCodigo())==false) {
            documentos.add(nuevoDocumento);
        }else{
            System.out.println("El producto ya existe");
        }
    }
    
    public static void eliminarDocumento(int codigo){
        for (int i = 0; i < documentos.size(); i++) {
            if (documentos.get(i).getCodigo()==codigo) {
                documentos.remove(i);
            }
        }
    }
    
    public static void listar(){
        for (Documento temporal : documentos) {
            System.out.println(temporal);
        }
    }
    
            

}
