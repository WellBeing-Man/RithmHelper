import org.junit.Test;
import sorting.*;

import static org.junit.Assert.assertEquals;

public class SortingTest {
    @Test
    public void SortingTest() {
        int[] beforeCase={5,1,2,4,3};
        int[] afterCase={1,2,3,4,5};

        int[] beforeCase1={3,1,2,6,4,9,7};
        int[] afterCase1={1,2,3,4,6,7,9};

        int[] beforeCase2={4,8,6,3,2,1,5,9,7};
        int[] afterCase2={1,2,3,4,5,6,7,8,9};

        int[] beforeCase3={33,1,0,150,350,11,2,17,5,7};
        int[] afterCase3= {0,1,2,5,7,11,17,33,150,350};




        assertEquals(arrayToString(new SelectionSort(beforeCase).sort()),arrayToString(afterCase));
        assertEquals(arrayToString(new BubbleSort(beforeCase).sort()),arrayToString(afterCase));
        assertEquals(arrayToString(new InsertionSort(beforeCase).sort()),arrayToString(afterCase));
        assertEquals(arrayToString(new MergeSort(beforeCase).sort()),arrayToString(afterCase));

        assertEquals(arrayToString(new SelectionSort(beforeCase1).sort()),arrayToString(afterCase1));
        assertEquals(arrayToString(new BubbleSort(beforeCase1).sort()),arrayToString(afterCase1));
        assertEquals(arrayToString(new InsertionSort(beforeCase1).sort()),arrayToString(afterCase1));
        assertEquals(arrayToString(new MergeSort(beforeCase1).sort()),arrayToString(afterCase1));

        assertEquals(arrayToString(new SelectionSort(beforeCase2).sort()),arrayToString(afterCase2));
        assertEquals(arrayToString(new BubbleSort(beforeCase2).sort()),arrayToString(afterCase2));
        assertEquals(arrayToString(new InsertionSort(beforeCase2).sort()),arrayToString(afterCase2));
        assertEquals(arrayToString(new MergeSort(beforeCase2).sort()),arrayToString(afterCase2));

        assertEquals(arrayToString(new SelectionSort(beforeCase3).sort()),arrayToString(afterCase3));
        assertEquals(arrayToString(new BubbleSort(beforeCase3).sort()),arrayToString(afterCase3));
        assertEquals(arrayToString(new InsertionSort(beforeCase3).sort()),arrayToString(afterCase3));
        assertEquals(arrayToString(new MergeSort(beforeCase3).sort()),arrayToString(afterCase3));

    }



    String arrayToString(int[] array){
        String result="";

        for (int a:array
             ) {
            result+=String.valueOf(a);
        }

        return result;
    }

}
