package sorting;

public class CountingSort extends Sort{

    public CountingSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        return countingSort(array);
    }

    private int[] countingSort(int[] array) {

        int[] counting=new int[max];
        int[] result= new int[max];

        counting=accumulation(array);


        int max=counting[counting.length-1];

        for (int i = counting.length - 1; i >= 0; i--) {
            while (max>counting[i]){
                result[(max--)-1]=i+1;
            }
        }


        return result;
    }

    private int[] accumulation(int[] array) {
        int[] temp=new int[max];
        for (int i = 0; i < array.length; i++) {
            temp[array[i]]++;
        }

        for (int i = 1; i < temp.length; i++) {
            temp[i]+=temp[i-1];
        }

        return temp;
    }

}
