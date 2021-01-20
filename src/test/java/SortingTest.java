import org.junit.Test;
import sorting.*;
import sorting.heap.HeapSort;
import sorting.heap.MaxHeap;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SortingTest {
    @Test
    public void SortingTest() {

        ArrayList<int[]> input=new ArrayList<>();
        ArrayList<int[]> output=new ArrayList<>();


        int[] beforeCase={5,1,2,4,3};
        int[] afterCase={1,2,3,4,5};

        int[] beforeCase1={3,1,2,6,4,9,7};
        int[] afterCase1={1,2,3,4,6,7,9};

        int[] beforeCase2={4,8,6,3,2,1,5,9,7};
        int[] afterCase2={1,2,3,4,5,6,7,8,9};

        int[] beforeCase3={33,1,0,150,350,11,2,17,5,7};
        int[] afterCase3= {0,1,2,5,7,11,17,33,150,350};

        input.add(beforeCase);
        input.add(beforeCase1);
        input.add(beforeCase2);
        input.add(beforeCase3);

        output.add(afterCase);
        output.add(afterCase1);
        output.add(afterCase2);
        output.add(afterCase3);

        for (int i = 0; i < input.size(); i++) {
            assertEquals(arrayToString(new SelectionSort(input.get(i)).sort()),arrayToString(output.get(i)));
            assertEquals(arrayToString(new BubbleSort(input.get(i)).sort()),arrayToString(output.get(i)));
            assertEquals(arrayToString(new InsertionSort(input.get(i)).sort()),arrayToString(output.get(i)));
            assertEquals(arrayToString(new MergeSort(input.get(i)).sort()),arrayToString(output.get(i)));
            assertEquals(arrayToString(new QuickSort(input.get(i)).sort()),arrayToString(output.get(i)));
            assertEquals(arrayToString(new HeapSort(input.get(i)).sort()),arrayToString(output.get(i)));
            assertEquals(arrayToString(new CountingSort(input.get(i)).sort()),arrayToString(output.get(i)));
        }

    }

    @Test
    public void MaxHeapTest(){
        MaxHeap heap=new MaxHeap();
        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);

        heap.printHeap();

        heap.pop();
        heap.pop();
        heap.printHeap();
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
