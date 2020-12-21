/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import java.util.LinkedList;

/**
 *
 * @author Chuy
 */
public class ArbolBinario {
   private NodoDoble raiz;
    private int num_nodos;
    private int alt;

    public ArbolBinario() {
        raiz = null;
        num_nodos = 0;
        alt = 0;
    }
    

    public void insertar(int dato){
       if(existe(dato))return;
       NodoDoble nuevo = new NodoDoble(dato);
          if (raiz == null)
              raiz = nuevo;
          else
          {
              NodoDoble anterior = null;
              NodoDoble tmp = raiz;
              while (tmp != null)
              {
                  anterior = tmp;
                  if (dato < tmp.getDato())
                      tmp = tmp.getPrev();
                  else
                      tmp = tmp.getNext();
              }
              if (dato < anterior.getDato())
                  anterior.setPrev(nuevo);
              else
                  anterior.setNext(nuevo);
          }
          num_nodos++;
    }

    public NodoDoble getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoDoble raiz) {
        this.raiz = raiz;
    }

    public int getNumNodos() {
        return num_nodos;
    }
    

    public void preorden(NodoDoble aux,LinkedList recorrido){
          if (aux != null)
          {
              recorrido.add(aux.getDato());
              preorden (aux.getPrev(),recorrido);
              preorden (aux.getNext(),recorrido);
          }
    }

    public void inorden(NodoDoble aux,LinkedList recorrido){
          if (aux != null)
          {
              inorden (aux.getPrev(),recorrido);
              recorrido.add(aux.getDato());
              inorden (aux.getNext(),recorrido);
          }
    }

    public void postorden(NodoDoble aux,LinkedList recorrido){
          if (aux != null)
          {
              postorden (aux.getPrev(),recorrido);
              postorden (aux.getNext(),recorrido);
              recorrido.add(aux.getDato());
          }
    }

    public void porNivel(NodoDoble aux,LinkedList recorrido){
        LinkedList<NodoDoble> cola = new LinkedList<NodoDoble>();
        cola.addLast(aux);
        while(cola.size()> 0){
            NodoDoble tmp = cola.pollFirst();
            recorrido.add(tmp.getDato());
            if(tmp.getPrev()!=null){
                cola.addLast(tmp.getPrev());
            }
            if(tmp.getNext()!=null){
                cola.addLast(tmp.getNext());
            } 
        }
    }
    
    //Metodo para verificar si hay un nodo en el arbol
    public boolean existe(int dato) {
        NodoDoble aux = raiz;
        while (aux!=null) {
            if (dato==aux.getDato())
                return true;
            else
                if (dato>aux.getDato())
                    aux=aux.getNext();
                else
                    aux=aux.getPrev();
        }
        return false;
    }
    
    
    private void altura (NodoDoble aux,int nivel)  {
        if (aux != null) {    
            altura(aux.getPrev(),nivel+1);
            alt = nivel;
            altura(aux.getNext(),nivel+1);
        }
    }
    //Devuleve la altura del arbol
    public int getAltura(){
        altura(raiz,1);
        return alt;
    }
}
