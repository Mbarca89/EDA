package TP3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Almacen {

    Map<String, Stack<Producto>> almacen = new HashMap<>();
    Map<String, Integer> capacidadMax = new HashMap<>();

    public Almacen() {
        capacidadMax.put("Electronica", 3);
        capacidadMax.put("Alimentos", 2);

        almacen.put("Electronica", new Stack<>());
        almacen.put("Alimentos", new Stack<>());
    }

    public void almacenarProducto() {

        if (ColaIngreso.ingreso.isEmpty()) {
            System.out.println("No hay productos pendientes de ingreso");
            return;
        }

        int elementos = ColaIngreso.ingreso.size();

        for (int i = 0; i < elementos; i++) {
            Producto producto = ColaIngreso.ingreso.poll();
            Stack<Producto> pila = almacen.get(producto.getCategoria());
            int capacidad = capacidadMax.get(producto.getCategoria());

            if (pila.size() < capacidad) {
                pila.push(producto);
                System.out.println("Producto almacenado: " + "\n" + producto);
                System.out.println("Capacidad restante: " + (capacidad - pila.size()));
                break;
            } else {
                ColaIngreso.ingreso.offer(producto);
                System.out.println("El almacen para " + producto.getCategoria() + " esta lleno, regresa a cola de ingreso");
            }

        }



    }
    public Producto despacharProducto(String categoria) {
    Stack<Producto> pila = almacen.get(categoria);

    if (pila == null || pila.isEmpty()) {
        System.out.println("No hay productos en " + categoria);
        return null;
    }

    Producto p = pila.pop();
    System.out.println("Producto despachado: " + p);

    return p;
}
    public void mostrarEstado() {
    System.out.println(" INFORME ACTUAL DEL ALMACEN");

    for (String categoria : almacen.keySet()) {
        Stack<Producto> pila = almacen.get(categoria);

        System.out.println("Categoria: " + categoria);
        System.out.println("Contenido: " + pila);
        System.out.println("Cantidad: " + pila.size());
        System.out.println("Capacidad max: " + capacidadMax.get(categoria));
    }
}
    
    public Producto buscarProducto (String categoria, String id){
        Stack<Producto> pila = almacen.get(categoria);
        
        if(pila==null || pila.isEmpty()){
            System.out.println("No hay productos en "+categoria);
            return null;
        }
        
        Stack<Producto> auxiliar = new Stack<>();
        Producto encontrado =null;
        
        while(!pila.isEmpty()){
            Producto p = pila.pop();
            
            if(p.getIDproducto().equals(id)){
                encontrado = p;
            }
            auxiliar.push(p);
        }
        
        
        //corregir original
        while(!auxiliar.isEmpty()){
            pila.push(auxiliar.pop());
        }
        
        if(encontrado !=null){
            System.out.println("Producto encontrado: "+ encontrado);
        } else{
            System.out.println("Producto no encontrado.");
        }
        
        
        return encontrado;
    }
    
}
