package sorting;

public class SelectionSort extends Sort {


    public SelectionSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        return selectionSort(array,max);
    }

    private int[] selectionSort(int[] array, int max) {

        for(int i= max-1;i >=0; i--){
            int largest=0;
            int target=0;
            for(int j=0;j<=i;j++){
                if(largest<array[j]){
                    largest=array[j];
                    target=j;
                }
            }
            swap(array,i,target);
        }
        return array;
    }


}
