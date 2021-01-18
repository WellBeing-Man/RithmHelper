import org.junit.Test;
import sorting.BubbleSort;
import sorting.InsertionSort;
import sorting.SelectionSort;

import static org.junit.Assert.assertEquals;

public class SortingTest {
    @Test
    public void SortingTest() {
        int[] before={5,1,2,4,3};
        int[] after={1,2,3,4,5};

        assertEquals(arrayToString(new SelectionSort(before).sort()),arrayToString(after));
        assertEquals(arrayToString(new BubbleSort(before).sort()),arrayToString(after));
        assertEquals(arrayToString(new InsertionSort(before).sort()),arrayToString(after));
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
