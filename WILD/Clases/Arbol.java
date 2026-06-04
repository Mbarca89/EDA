/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WILD.Clases;

/**
 *
 * @author kamil
 */
public class Arbol {
    
    private Nodo raiz;
    
    public Arbol(){
        this.raiz=null;
    }
    
    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }
    
    public Nodo getRaiz() {
        return raiz;
    }
    
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    public boolean estaVacio() {
        return raiz == null;
    }
    
    public boolean esHoja(Nodo nodo) {
        return nodo != null && nodo.getSi() == null && nodo.getNo() == null;
    }
    
    public Nodo responder(Nodo actual, boolean respuestaSi) {
        if (actual == null) {
            return null;
        }
        
        if (respuestaSi) {
            return actual.getSi();
        }
        
        return actual.getNo();
    }
    
    public void aprender(Nodo hoja, String animalNuevo, String preguntaNueva, boolean respuestaSiParaNuevo) {
        if (hoja == null || !esHoja(hoja)) {
            return;
        }
        
        String animalAnterior = hoja.getConsulta();
        hoja.setConsulta(preguntaNueva);
        
        if (respuestaSiParaNuevo) {
            hoja.setSi(new Nodo(animalNuevo));
            hoja.setNo(new Nodo(animalAnterior));
        } else {
            hoja.setSi(new Nodo(animalAnterior));
            hoja.setNo(new Nodo(animalNuevo));
        }
    }
    
    public void mostrarPreorden(Nodo raiz){
        if(raiz==null){
            return;
        }
        System.out.println(raiz.getConsulta()+" ");
        mostrarPreorden(raiz.getSi());
        mostrarPreorden(raiz.getNo());
    }
    
}
