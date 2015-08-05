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
public class DATOMATRIZ {
    public int id_objeto;
    public String nombre_objeto;
    public String img_objeto;
    public NODOLISTADOBLE ant, sig;
        
        public DATOMATRIZ(){
            this.id_objeto = 0;
            this.nombre_objeto = "";
            this.img_objeto = "";
        }
        public DATOMATRIZ(int id, String nombre, String img){
            this.id_objeto = id;
            this.nombre_objeto = nombre;
            this.img_objeto = img;
        }
}
