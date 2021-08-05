/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

/**
 *
 * @author willi
 */
public class NodoArbol {

    public NodoArbol derecha;
    public NodoArbol izquierda;
    public int id;
    public String lexema;
    public String id_nodo;

    public NodoArbol() {
        this.derecha = null;
        this.izquierda = null;
        this.id = -1;
        this.lexema = "&";
        this.id_nodo = "node";
    }

    public NodoArbol(NodoArbol derecha, NodoArbol izquierda, int id, String lexema, String id_nodo) {
        this.derecha = derecha;
        this.izquierda = izquierda;
        this.id = id;
        this.lexema = lexema;
        this.id_nodo = id_nodo;
    }

}
