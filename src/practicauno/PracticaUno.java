/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicauno;
import structs.*;

/**
 *
 * @author lex
 */
public class PracticaUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world! XD");
        LISTADOBLE lista = new LISTADOBLE();
        DATOLISTADOBLE datos;
        for(int i = 1; i <5 ; i++){
            datos = new DATOLISTADOBLE();
            datos.id_objeto = i;
            lista.insertar_lista_doble_inicio(lista, datos);
        }
        
        System.out.println("El tamanio es de: "+lista.tamanio);
        lista.mostrar_ini(lista);
        
        lista.eliminar_fin(lista);
        System.out.println("El tamanio es de: "+lista.tamanio);
        //lista.mostrar_ini(lista);
        System.out.println("\n");
        lista.mostrar_fin(lista);
        
        //XD :p
        
        
    }
                
    
}
