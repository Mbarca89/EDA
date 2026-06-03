/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author kamil
 */
public class Arbol {
    
    private Nodo raiz;
    
    public Arbol(){
        this.raiz=null;
    }
    
    public void insertar(String consulta){
        raiz = insertarRecursivo(raiz, consulta);
    }
    
    private Nodo insertarRecursivo(Nodo actual, String consulta){
        if(actual == null){
            return new Nodo(consulta);
        }
        
        int comparacion = consulta.compareTo(actual.getConsulta());
        
        if(comparacion < 0){
            actual.setSi(insertarRecursivo(actual.getSi(), consulta));
        } else if(comparacion > 0){
            actual.setNo(insertarRecursivo(actual.getNo(), consulta));
        }
        
        return actual;
    }
    
    public void mostrarPreorden(Nodo raiz){
        if(raiz==null){
            return;
        }
        System.out.println(raiz.getConsulta()+" ");
        System.out.println(raiz.getSi()+ " ");
        System.out.println(raiz.getNo()+" ");
    }
    
}
