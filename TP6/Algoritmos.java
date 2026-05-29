package TP6;

import java.util.Random;


public class Algoritmos {
    private Integer[] lista;
    
    public Algoritmos(int tamaño) {
        lista = new Integer[tamaño];
        
        if(tamaño==8){
            lista[0]=1;
            lista[1]=7;
            lista[2]=9;
            lista[3]=4;
            lista[4]=11;
            lista[5]=3;
            lista[6]=5;
            lista[7]=13;
        } else{
            Random random = new Random();
            for(int i=0; i<tamaño; i++){
                lista[i] = random.nextInt(101);
            }
        } 
    }

    public void agregarElemento(int posicion, int numero){
        lista[posicion]=numero;
    }

    public void mostrarLista(){
        System.out.println("Arreglo dado");
        for (Integer i : lista){
            System.out.print(i + " ");
        }System.out.println("\n");
    }

    public Integer[] getLista() {
        return lista;
    }
    
    
    public void bubbleSort(Integer[] lista){
        Integer[] listaBubble= lista.clone();
        
        long inicio = System.nanoTime();
        
        int i,j, temp;
        for(i = listaBubble.length -1 ; i>0 ; i--){
            for(j = 1 ; j<= i ; j++){
                if(listaBubble[j-1] > listaBubble[j]){
                    temp = listaBubble[j-1];
                    listaBubble[j-1] = listaBubble[j];
                    listaBubble[j]=temp;
                }
            }
        }
        
        long fin = System.nanoTime();
        long tiempoFinal = fin-inicio;
        
        System.out.println("Metodo ordenado por BubbleSort ("+tiempoFinal+" sg)");
        for (Integer num : listaBubble){
            System.out.print(num + " ");
        }System.out.println("\n");
    }
    
    
    public void insertionSort(Integer[] lista){
        Integer[] listaInsertion= lista.clone();
        long inicio = System.nanoTime();
        
        for(int i=1; i<listaInsertion.length; i++){
            int aux = listaInsertion[i];
            int j = i;
                while(j>0 && listaInsertion[j-1]>aux){
                    listaInsertion[j]=listaInsertion[j-1];
                    j=j-1;
                }
            listaInsertion[j]=aux;
        }
        
        long fin = System.nanoTime();
        long tiempoFinal = fin-inicio;
        
        System.out.println("Metodo ordenado por InsertionSort ("+tiempoFinal+" nano.sg)");
        for (Integer num : listaInsertion){
            System.out.print(num + " ");
        }System.out.println("\n");
    }
    
    //Inicio MergreSort
    public Integer[] mergeSort(Integer[] lista){
        Integer[] listaMergeSort = lista.clone();
        
        long inicio = System.nanoTime();
        
        int n = listaMergeSort.length;
        if(n<=1){
            return listaMergeSort;
        }
        
        int medio = n/2;
        Integer[] lista_izquierda = new Integer[medio];
        for(int i=0 ; i<=medio-1 ; i++){
            lista_izquierda[i] = listaMergeSort[i];
        }
        
        Integer[] lista_derecha = new Integer[n-medio];
        int j =0;
        for(int i=medio ; i<n ; i++){
            lista_derecha[j] = listaMergeSort[i];
            j++;
        }
        
        Integer[] izquierdaOrdenada = mergeSort(lista_izquierda);
        Integer[] derechaOrdenada = mergeSort(lista_derecha);
        
        long fin = System.nanoTime();
        long tiempoFinal = fin-inicio;
        
        return merge(izquierdaOrdenada, derechaOrdenada);
    }
    
    public Integer[] merge(Integer[] listaIzq, Integer[] listaDer){
        
        Integer[] resultado = new Integer[listaIzq.length+listaDer.length];
        
        int i=0;//indices arreglo izquierdo
        int j=0;//indices arreglo derecho
        int k=0;
        
        while(i<listaIzq.length && j<listaDer.length){
            if(listaIzq[i]<=listaDer[j]){
                resultado[k]=listaIzq[i];
                i++;
            } else{
                resultado[k]=listaDer[j];
                j++;
            }
          k++;
        }
        
        while(j<listaDer.length){
            resultado[k]=listaDer[j];
            j++;
            k++;
        }
        
        while(i<listaIzq.length){
            resultado[k]=listaIzq[i];
            i++;
            k++;
        }
        
        System.out.println(resultado.length);
        return resultado;
    }
    //Fin MergreSort
    

    public void busquedaBinaria(){
        
    }
    public void countSort(Integer[] lista){
        Integer[] listaCount = lista.clone();
        
        long inicio = System.nanoTime();
        
        int max = listaCount[0];
        
        for(int i=1; i<listaCount.length; i++){
            if(listaCount[i]>max){
                max=listaCount[i];
            }
        }
        
        int[] conteo = new int[max+1];
        
        for(int i=0; i<listaCount.length; i++){
            conteo[listaCount[i]]++;
        }
        
        int indice = 0;
        
        for(int i=0; i<conteo.length;i++){
            while(conteo[i]>0){
                listaCount[indice]=i;
                indice++;
                conteo[i]--;
            }
        }
        
        long fin = System.nanoTime();
        long total =fin-inicio;
        
        System.out.println("Metodo ordenado por CountSort("+total+" nano.sg)");
        for(Integer num : listaCount){
            System.out.print(num+" ");
        }System.out.println("\n");
    } 
    
    
    
    public void quickSort(Integer[] lista){
        Integer[] listaQuick = lista.clone();
        
        long inicio = System.nanoTime();
        q_sort(listaQuick, 0, listaQuick.length-1);
        long fin = System.nanoTime();
        
        long total = fin-inicio;
        System.out.println("Arreglo ordenado por QuickSort("+total+" nano.sg)");
        for(Integer num : listaQuick){
            System.out.print(num + " ");
        }System.out.println("\n");
    }
    public void q_sort(Integer[] listaQuick, int izq, int der){
        int pivot, guarda_izq, guarda_der;
        
        guarda_izq = izq;
        guarda_der = der;
        pivot = listaQuick[izq];
        
        while(izq<der){
            while(listaQuick[der]>=pivot && izq<der){
                der--;
            }
            if(izq!=der){
                listaQuick[izq]=listaQuick[der];
                izq++;
            }
            
            
            while(listaQuick[izq]<=pivot && (izq<der)){
                izq++;
            }
            if(izq!=der){
                listaQuick[der]=listaQuick[izq];
                der--;
            }
            
        }
        
        listaQuick[izq]=pivot;
        pivot=izq;
        
        izq = guarda_izq;
        der = guarda_der;
        
        if(izq<pivot){
            q_sort(listaQuick, izq, pivot-1);
        }
        
        if(der>pivot){
            q_sort(listaQuick,pivot+1,der);
        }
    }
}
