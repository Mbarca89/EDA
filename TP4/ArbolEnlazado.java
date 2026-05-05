package TP4;

public class ArbolEnlazado {
    private Nodo raiz;
    private static class Nodo {
        int valor;
        Nodo izquierdo;
        Nodo derecho;

        Nodo(int valor) {
            this.valor = valor;
        }
    }

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }

        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }

        return actual;
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return false;
        }

        if (actual.valor == valor) {
            return true;
        }

        if (valor < actual.valor) {
            return buscarRecursivo(actual.izquierdo, valor);
        } else {
            return buscarRecursivo(actual.derecho, valor);
        }
    }

    public void InOrden() {
        InOrdenRecursivo(raiz);
        System.out.println();
    }

    private void InOrdenRecursivo(Nodo actual) {
        if (actual == null) {
            return;
        }

        InOrdenRecursivo(actual.izquierdo);
        System.out.print(actual.valor + " ");
        InOrdenRecursivo(actual.derecho);
    }

    public static void main(String[] args) {

        ArbolEnlazado arbolEnlazado = new ArbolEnlazado();

        arbolEnlazado.insertar(5);
        arbolEnlazado.insertar(30);
        arbolEnlazado.insertar(17);
        arbolEnlazado.insertar(22);
        arbolEnlazado.insertar(44);
        arbolEnlazado.insertar(13);
        arbolEnlazado.insertar(19);
        arbolEnlazado.insertar(33);

        arbolEnlazado.InOrden();

        System.out.println("Buscar 44 " + arbolEnlazado.buscar(44));
        System.out.println("Buscar 100 " + arbolEnlazado.buscar(100));
    }
}


