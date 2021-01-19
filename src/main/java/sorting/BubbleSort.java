package sorting;

public class BubbleSort extends Sort {

    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        return bubbleSort(array);
    }


    private int[] bubbleSort(int[] a){
        for(int i=max-2;i>0;i--){
            for(int j=0;j<=i;j++){
                if(a[j]>a[j+1]){
                   swap(array,j,j+1);
                }
            }
        }
        return a;
    }
}
