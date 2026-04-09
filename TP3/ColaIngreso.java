package TP3;

import java.util.LinkedList;
import java.util.Queue;

public class ColaIngreso {
    public static Queue<Producto> ingreso = new LinkedList<>();

    public static boolean ingresarProducto (Producto producto) {
        System.out.println("Ingresando producto: \n" +
                "Nombre: " + producto.getNombreProducto() + "\n" +
                "Codigo: " + producto.getIDproducto() + "\n" +
                "Categoria: " + producto.getCategoria() + "\n");
        return ingreso.add(producto);
    }

}
