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
public class NODOLISTADOBLE {
    
    public DATOLISTADOBLE dato;
    public NODOLISTADOBLE ant, sig;
    
    public NODOLISTADOBLE(){
        this.dato = null;
        this.ant = null;
        this.sig = null;
    }
    
    public NODOLISTADOBLE(DATOLISTADOBLE dato){
        this.dato = dato;
        this.ant = null;
        this.sig = null;
    }
    
    public DATOLISTADOBLE obtener_dato(){
        return this.dato;
    }
            
}
