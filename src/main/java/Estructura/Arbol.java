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
public class Arbol {
    public NodoArbol raiz;
    public int no_nodos;
    public NodoArbol actual;
    
    public Arbol(){
        raiz = null;
        actual = raiz;
        no_nodos=0;
    }
    
    public void agregar(int numero1, String signo, int numero2){
        
    }
    
    public void suma_nodos(Arbol actual, Arbol aux){
        Arbol au1 = new Arbol();
        au1.raiz = new NodoArbol();
        au1.raiz.lexema = "+";
        au1.raiz.id = 10;
        au1.raiz.id_nodo = "node"+au1.raiz.id;
        au1.raiz.izquierda = actual.raiz;
        au1.raiz.derecha = aux.raiz;
        this.raiz = au1.raiz;
    }
}
