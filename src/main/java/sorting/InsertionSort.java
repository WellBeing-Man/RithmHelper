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

        for (int i = 1; i < max; i++) {
            int temp = array[i];
                for (int j = i - 1; j >= 0; j--) {
                    if (temp < array[j]) {
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
     return array;
    }
}
