package TP4;

public class ArbolBinario {
    private Integer[] arbol;

    public ArbolBinario(int niveles) {
        int capacidad = (int) Math.pow(2, niveles) -1;
        arbol = new Integer[capacidad];
    }

    public void insertar(int valor) {
        insertarRecursivo(0,valor);
    }

    public void insertarRecursivo (int indice, int valor) {
        if(indice >= arbol.length) {
            System.out.println("No hay lugar para insertar");
            return;
        }
        if(arbol[indice] == null) {
            arbol[indice] = valor;
        } else if (valor <= arbol[indice]) {
            insertarRecursivo(2*indice+1,valor);
        } else if (valor > arbol[indice]) {
            insertarRecursivo(2*indice+2,valor);
        }
    }

    public void inOrden() {
        inOrdenRecursivo(0);
    }
    public void inOrdenRecursivo(int indice) {
        if (indice >= arbol.length || arbol[indice] == null) {
            return;
        }

        inOrdenRecursivo(2 * indice + 1);
        System.out.print(arbol[indice] + " ");
        inOrdenRecursivo(2 * indice + 2);
    }



    public boolean buscar(int valor) {
       return buscarRecursivo(0, valor);
    }

    public boolean buscarRecursivo(int indice, int valor){
        if (indice >= arbol.length || arbol[indice] == null) {
            return false;
        }

        if (arbol[indice] == valor) {
            return true;
        }

        if (valor < arbol[indice]) {
            return buscarRecursivo(2 * indice + 1, valor);
        } else {
            return buscarRecursivo(2 * indice + 2, valor);
        }
    }

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario(10);

        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(20);
        arbol.insertar(14);
        arbol.insertar(22);

        System.out.println("Recorrido InOrden:");
        arbol.inOrden();

        System.out.println("\nBuscar 7: " + arbol.buscar(7));
        System.out.println("Buscar 20: " + arbol.buscar(20));
    }
}