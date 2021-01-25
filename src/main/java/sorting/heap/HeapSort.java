package sorting.heap;

import sorting.Sort;

import java.util.Arrays;

public class HeapSort extends Sort {
    public HeapSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        int[] heapArray=new int[max+1];
        for (int i = 0; i < array.length; i++) {
            heapArray[i+1]=array[i];
        }
        max=heapArray.length;
        array=heapSort(heapArray);

        int[] result=new int[array.length-1];
        for (int i = 0; i < result.length; i++) {
            result[i]=array[i+1];
        }

        return result;
    }

    private int[] heapSort(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            heapify(array,i);
        }

        for (int i = array.length - 1; i >1; i--) {
            if(array[i]<array[1])
                 swap(array,1,i);
            max--;
            heapify(array,1);
        }


        return array;
    }

    private void heapify(int[] array, int i) {
        if(i * 2 > max-1 || i*2+1 > max-1){
            return;
        }

        int k=-1;

        if(array[i*2]> array[i*2 +1]){
            k = i*2;
        }else {
            k = i*2 +1;
        }

        if(array[i]> array[k]){
            return;
        }
        swap(array,i,k);
        heapify(array,k);
    }
}
