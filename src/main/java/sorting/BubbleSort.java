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
        for(int i=0;i<max-1;i++){
            if(a[i]>a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        return a;
    }
}
