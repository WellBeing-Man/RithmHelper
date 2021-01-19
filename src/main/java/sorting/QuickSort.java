package sorting;

public class QuickSort extends Sort {
    public QuickSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        quickSort(array,0,max-1);
        return array;

    }

    private void quickSort(int[] array,int p, int r) {
        if(p<r){
            int q= partition(array,p,r);
            quickSort(array,p,q-1);
            quickSort(array,q+1,r);
        }
    }

    private int partition(int[] array, int p, int r) {

        int pivot=array[r];
        int i=p-1;
        int j=p;
        while (j<r){
            if(array[j]<pivot) {
                i++;
                swap(array,i,j);
            }
            j++;
        }
        swap(array,i+1,r);
        return i+1;
    }
}
