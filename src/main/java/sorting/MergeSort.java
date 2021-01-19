package sorting;

import java.util.Arrays;

public class MergeSort extends Sort {
    public MergeSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        mergeSort(array, 0, max-1);
        return array;
    }

    private void mergeSort(int[] array, int p, int r) {

        int q= (p+r)/2;

        if(p<r){
            mergeSort(array,p,q);
            mergeSort(array,q+1,r);
            merge(array,p,q,r);
        }
    }

    private void merge(int[] array, int p, int q, int r) {
            int[] temp=new int[max];
            int i=p;
            int j=q+1;
            int k=p;
            while (i<=q && j<=r){
                if(array[i]<array[j]){
                    temp[k++]=array[i++];
                }else {
                    temp[k++]=array[j++];
                }
            }

            while (i<=q){
                temp[k++]=array[i++];
            }
            while (j<=r){
                temp[k++]=array[j++];
            }

        for (int l = p; l <= r; l++) {
            array[l]=temp[l];
        }

    }
}
