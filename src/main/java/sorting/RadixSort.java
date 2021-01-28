package sorting;

public class RadixSort extends Sort {

    public RadixSort(int[] array) {
        super(array);
    }

    private int digits=0;

    public RadixSort setDigits(int digits) {
        this.digits = digits;
        return this;
    }

    @Override
    public int[] sort() {
         //TODO Radix Sort
        return new int[0];
    }
}
