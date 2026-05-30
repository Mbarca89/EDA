package TP6;


public class EdaTP6 {

    public static void main(String[] args) {
        
        Algoritmos lista = new Algoritmos(10);
        lista.mostrarLista();
        lista.bubbleSort(lista.getLista());
        lista.insertionSort(lista.getLista());
        lista.mergeSort(lista.getLista());//no se mostrarlo como corresponde
        //aca va busqueda binaria
        lista.countSort(lista.getLista());
        lista.quickSort(lista.getLista());
        lista.busquedaBinaria(lista.getLista(), 30);
    }
}
