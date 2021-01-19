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
            while (i<=q || j<=r){
                if(array[i]<array[j]){
                    temp[i]=array[i++];
                }else {
                    temp[j]=array[j++];
                }
            }

            while (i<q){
                temp[i]=array[i++];
            }
            while (j<r){
                temp[j]=array[j];
            }

            array=Arrays.copyOf(temp,max);
    }
}
