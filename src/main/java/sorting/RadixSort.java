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

        return convertToIntArray(radixSort(convertToStringArray(array)));
    }



    private int[] convertToIntArray(String[] array) {
        int[] result=new int[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i]=Integer.parseInt(array[i]);
        }
        return result;
    }

    private String[] convertToStringArray(int[] array) {
        String[] result=new String[array.length];

        for (int i = 0; i < array.length; i++) {
            String value=String.valueOf(array[i]);
            while (value.length()<digits){
                value="0"+value;
            }
            result[i]=value;
        }

        return result;
    }

    private String[] radixSort(String[] array) {

        while (digits>0){
            int decimal=10;
            int length=max;
            int[] count = new int[decimal];
            int[] result=new int[length];
            int[] numbers=new int[length];

            for (int i = 0; i < array.length; i++) {
                numbers[i]=Integer.valueOf(String.valueOf(array[i].charAt(digits-1)));
                count[Integer.valueOf(String.valueOf(array[i].charAt(digits-1)))]++;
            }

            for (int i = 1; i < count.length; i++) {
                count[i]+=count[i-1];
            }

            for (int i = count.length - 1; i >= 0; i--) {
                while (length>count[i]){
                    result[(length)-1]=this.array[(length--)-1];
                }

                decimal=10;
            }
            this.array=result;
            digits--;
        }



        return array;
    }
}
