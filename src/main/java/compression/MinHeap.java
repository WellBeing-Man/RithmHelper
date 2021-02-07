package compression;

import sorting.heap.HeapSort;

public class MinHeap<T>{

    T[] heap;
    int max;
    public MinHeap() {
        heap= (T[])new Object[10];
        max=0;
    }


    public void insert(T input){
       // todo implement input
    }

    public T pop(){
        // todo implement input pop
        return null;
    }


    public void printHeap(){
        for (int i = 1; i <= max; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    private void heapify(T[] array, int i) {
        // todo implement min - heapify
    }

    private void swap(T[] array,int x,int y){
        T temp=array[x];
        array[x]=array[y];
        array[y]=temp;
    }
}
