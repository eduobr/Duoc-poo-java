/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;

/**
 *
 * poo2201
 */
public class RegistrarDocumento {
    //declarar colección documentos que almacena objetos 
    //de la clase Documento
    static ArrayList<Documento> documentos;

    //crear colección
    public RegistrarDocumento() {
        documentos = new ArrayList<Documento>();
    }

    //agregar Documento a la colección sino existe
    public static void agregarDocumento(Documento nuevoDocumento) {
        if (verificarDocumento(nuevoDocumento.getCodigo()) == false) {
            documentos.add(nuevoDocumento);
        } else{
            System.out.println("Documento existe");
        }
    }

    //mostrar Documentos almacenados en la colección
    public static void listar() {
        for (Documento temporalDocumento : documentos) {
            System.out.println(temporalDocumento.toString());
        }
    }

    //método que devuelve true si el Documento se encuentra
    //en la colección sino retorna false
    public static boolean verificarDocumento(int codigo) {
        boolean valida = false;
        for (Documento temporalDocumento : documentos) {
            if (temporalDocumento.getCodigo() == codigo) {
                valida = true;
                break;
            }
        }
        return valida;
    }

    //eliminar documentos por código
    public static void eliminarDocumento(int codigo) {
        for (int i = 0; i < documentos.size(); i++) {
            if (documentos.get(i).getCodigo() == codigo) {
                documentos.remove(i);
                i = i - 1;
            }            
        }        
    }
}
