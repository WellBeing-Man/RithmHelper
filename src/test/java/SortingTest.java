import org.junit.Test;
import sorting.SelectionSort;

import static org.junit.Assert.assertEquals;

public class SortingTest {
    @Test
    public void SortingTest() {
        int[] before={5,1,2,4,3};
        int[] after={1,2,3,4,5};

        assertEquals(new SelectionSort(before).sort(),after);
    }

}
