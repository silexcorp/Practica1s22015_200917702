/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structs;

/**
 *
 * @author lex
 */
public class LISTADOBLE {
    private NODOLISTADOBLE ini, fin;
    public int tamanio;
    public LISTADOBLE(){
        this.ini = this.fin = null;
        this.tamanio = 0;
    }
    
    public void insertar_lista_doble_inicio(LISTADOBLE lista, DATOLISTADOBLE datos){
        NODOLISTADOBLE nuevo;
        nuevo = new NODOLISTADOBLE(datos);
        if(lista_vacia(lista)){
            lista.fin = lista.ini = nuevo;
            lista.tamanio++;
        }else{
                lista.ini.sig = nuevo;
                nuevo.ant = lista.ini;
                lista.ini = nuevo;
                tamanio++;
        }
    }
    
    public void insertar_lista_doble_final(LISTADOBLE lista, DATOLISTADOBLE datos){
        NODOLISTADOBLE nuevo;
        nuevo = new NODOLISTADOBLE(datos);
        if(lista_vacia(lista)){
            lista.fin = lista.ini = nuevo;
            lista.tamanio++;
        }else{
                lista.fin.sig = nuevo;
                nuevo.ant = lista.fin;
                lista.fin = nuevo;
                tamanio++;
        }
    }
    
    public void eliminar_ini(LISTADOBLE lista){
        NODOLISTADOBLE aux = lista.ini;
        if(lista_vacia(lista)){
            System.out.println("LISTA VACIA, NO HAY NADA PARA Borrar XD");
        }else{
            if(lista.ini == lista.fin){
                lista.ini = lista.fin = null;
                lista.tamanio = 0;
            }else{
                lista.ini = aux.ant;
                lista.ini.sig = null;
                aux.sig = aux.ant = null;
                lista.tamanio--;
            }
        }
    }
    
    public void eliminar_fin(LISTADOBLE lista){
        NODOLISTADOBLE aux = lista.fin;
        if(lista_vacia(lista)){
            System.out.println("LISTA VACIA, NO HAY NADA PARA Borrar XD");
        }else{
            if(lista.ini == lista.fin){
                lista.ini = lista.fin = null;
                lista.tamanio = 0;
            }else{
                /*this.fin = this.fin.ant;
                this.fin.sig = null;
                aux.sig = aux.ant = null;*/
                lista.fin = lista.fin.sig;
                lista.fin.sig = null;
                aux.ant = aux.sig = null;
                lista.tamanio--;
            }
        }
    }
    
    public int buscar(){
        return 0;
    }
    
    public boolean lista_vacia(LISTADOBLE lista){
        return lista.ini == null;
    }
    
    public void mostrar_ini(LISTADOBLE lista){
        NODOLISTADOBLE temp = lista.fin;
        if(lista_vacia(lista)){
            System.out.println("LISTA VACIA, NO HAY NADA PARA VER XD");
        }else{
            for(int i = 0; i < lista.tamanio ; i++){
                System.out.println("ID: "+temp.dato.id_objeto);
                temp = temp.sig;
            }
        }
    }
    
    public void mostrar_fin(LISTADOBLE lista){
        NODOLISTADOBLE temp = lista.ini;
        if(lista_vacia(lista)){
            System.out.println("LISTA VACIA, NO HAY NADA PARA VER XD");
        }else{
            for(int i = lista.tamanio; i > 0; i--){
                System.out.println("ID: "+temp.dato.id_objeto);
                temp = temp.ant;
            }
        }
    }
    
}
