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
public class NODOMATRIZ {
    public DATOMATRIZ dato;
    public NODOMATRIZ izq, der, arr, aba;
    
    public NODOMATRIZ(){
        this.dato = null;
        this.izq = null;
        this.der = null;
        this.arr = null;
        this.aba = null;
    }
    
    public NODOMATRIZ(DATOMATRIZ dato){
        this.dato = dato;
        this.izq = null;
        this.der = null;
        this.arr = null;
        this.aba = null;
    }
}
