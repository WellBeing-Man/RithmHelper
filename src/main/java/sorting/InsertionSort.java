package sorting;

public class InsertionSort extends Sort {

    public InsertionSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        return insertionSort(array);
    }


    private int[] insertionSort(int[] array){

        for(int i=max-1;i>0;i--){

            int j=i;
            while (array[j]<array[j-1]){
                array[j]=array[j-1];
                j--;
            }
            array[j]=array[i];
        }

     return array;
    }
}
