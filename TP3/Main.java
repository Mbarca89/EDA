package TP3;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();

        Producto producto1 = new Producto("A001", "Televisor", "Electronica");
        Producto producto2 = new Producto("A001", "Licuadora", "Electronica");
        Producto producto3 = new Producto("A001", "Pava electrica", "Electronica");
        Producto producto4 = new Producto("A001", "Notebook", "Electronica");

        Producto producto5 = new Producto("B001", "Atun", "Alimentos");
        Producto producto6 = new Producto("B001", "Carne", "Alimentos");
        Producto producto7 = new Producto("B001", "Papa", "Alimentos");

        ColaIngreso.ingresarProducto(producto1);
        ColaIngreso.ingresarProducto(producto2);
        ColaIngreso.ingresarProducto(producto3);
        ColaIngreso.ingresarProducto(producto4);
        ColaIngreso.ingresarProducto(producto5);
        ColaIngreso.ingresarProducto(producto6);
        ColaIngreso.ingresarProducto(producto7);

        almacen.almacenarProducto();
        almacen.almacenarProducto();
        almacen.almacenarProducto();
        almacen.almacenarProducto();
        almacen.almacenarProducto();
        almacen.almacenarProducto();
        almacen.almacenarProducto();
    }
}

