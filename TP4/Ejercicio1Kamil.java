/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edaparcial1kamiljofre;

/**
 *
 * @author kamil
 */
public class Ejercicio1Kamil {
    private Integer[] arbol;
    private int size;
    
    public Ejercicio1Kamil(Integer[] arbol, int size){
        this.arbol=arbol;
        this.size=size;
    }
    
    public void insertar(int valor){
        if(size==0){
            arbol[0]=valor;
            size++;
            return;
        }
        
        //valor inicial para posicion 0
        int i=0;
        
        while(true){
            if(valor<arbol[i]){
                int izq = 2*i+1;
                
                if(izq<arbol.length) return;
                
                if(arbol[izq]==null){
                    arbol[izq]=valor;
                    size++;
                    return;
                } else {i=izq;}
                
            } else{
                int der=2*i+2;
                
                if(der<arbol.length) return;
                
                if(arbol[der]==null){
                    arbol[der]=valor;
                    size++;
                    return;
                } else {i=der;}
            }
        }
    }
    
    public void recorerPreorden(){
        for(int i=0; i<=arbol.length; i++){
            if (arbol[i] != null) {
                System.out.println("Nodo: "+arbol[i]);

                Integer izq=2*i+1;
                Integer der = 2*i+2;

                if(izq < arbol.length && arbol[izq]!=null){
                    System.out.println("| Izq = "+arbol[izq]);
                };
                
                if(der < arbol.length && arbol[der]!=null){
                    System.out.println("| Der = "+arbol[der]);
                };
            }
        }
    }
    
    public void buscar(int valor){
        for(int i=0; i <arbol.length; i++){
            
            if(arbol[i]!=null && arbol[i]==valor){
                System.out.println("Valor encontrado en posicion "+i);
                return;
            }
        }
        System.out.println("Valor no encontrado.");
    }
}