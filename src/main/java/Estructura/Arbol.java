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
    
    public void agregar(String numero1, String signo, String numero2, int no_nodos){
        NodoArbol nuevo = new NodoArbol();
        nuevo.lexema = signo;
        nuevo.id = no_nodos++;
        nuevo.id_nodo = "node"+nuevo.id;
        nuevo.derecha = new NodoArbol();
        nuevo.derecha.lexema = numero2;
        nuevo.derecha.id = no_nodos++;
        nuevo.derecha.id_nodo = "node"+nuevo.derecha.id;
        
        nuevo.izquierda = new NodoArbol();
        nuevo.izquierda.lexema = numero1;
        nuevo.izquierda.id = no_nodos++;
        nuevo.izquierda.id_nodo = "node"+nuevo.izquierda.id;
        
        if (actual== null){
            actual = nuevo;
        } else {
            nuevo.derecha = actual;
            actual = nuevo;
        }
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
    
    public void imprimir(NodoArbol recorrer){
        if (recorrer!=null){
            imprimir(recorrer.izquierda);
            imprimir(recorrer.derecha);
            System.out.println(recorrer.lexema);
        }
    }
}
