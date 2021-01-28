import org.junit.Test;
import recursion.*;

import static org.junit.Assert.*;

public class RecursionTest {

    @Test
    public void FactorialTest(){
        assertEquals(new Factorial(0).value(),1);
        assertEquals(new Factorial(1).value(),1);
        assertEquals(new Factorial(2).value(),2);
        assertEquals(new Factorial(3).value(),6);
        assertEquals(new Factorial(4).value(),24);
        assertEquals(new Factorial(10).value(),3628800);
        assertEquals(new Factorial(11).value(),39916800);
    }

    @Test
    public void GCDTest(){
        assertEquals(new GCD(30,12).value(),6);
        assertEquals(new GCD(264, 780).value(),12);
        assertEquals(new GCD(64782, 82201).value(),1);
        assertEquals(new GCD(6666,121).value(),11);
    }

    @Test
    public void MazeTest(){

        int[][] map1={
                {0,0,0,0,0,0,0,1},
                {0,1,1,0,1,1,0,1},
                {0,0,0,1,0,0,0,1},
                {0,1,0,0,1,1,0,0},
                {0,1,1,1,0,0,1,1},
                {0,1,0,0,0,1,0,1},
                {0,0,0,1,0,0,0,1},
                {0,1,1,1,0,1,0,4},
        };


        int[][] map2={
                {0,1,0,1,0,1,0,1},
                {0,0,0,0,1,0,0,1},
                {0,1,1,0,1,0,1,1},
                {0,1,0,0,1,0,0,4},
                {0,1,1,0,1,0,1,1},
                {0,1,1,0,1,0,1,1},
                {0,1,1,0,1,0,1,1},
                {0,0,0,0,0,0,1,1}
        };

        int[][] map3={
                {1,1,1,1,1,0,1,1,1},
                {1,0,1,0,1,0,1,0,1},
                {1,0,0,0,0,0,0,0,1},
                {1,0,1,1,0,1,0,1,1},
                {1,0,0,0,0,1,0,1,1},
                {1,0,1,1,0,1,0,1,1},
                {1,0,0,0,0,1,0,0,1},
                {1,1,1,1,1,1,1,1,1}
        };


        assertTrue(new Maze(map1).setCurrentPosition(0,0).explore());
        assertTrue(new Maze(map2).setCurrentPosition(0,0).explore());
        assertFalse(new Maze(map3).setCurrentPosition(1,1).explore());

    }


    @Test
    public void BlobTest() {

        int[][] map={
                {1,0,0,0,0,0,0,1},
                {0,1,1,0,0,1,0,0},
                {1,1,0,0,1,0,1,0},
                {0,0,0,0,0,1,0,0},
                {0,1,0,1,0,1,0,0},
                {0,1,0,1,0,1,0,0},
                {1,0,0,0,1,0,0,1},
                {0,1,1,0,0,1,1,1},
        };

        Blob blob=new Blob(map);

        assertEquals(blob.setCurrentPosition(0,0).calculation(),5);
        assertEquals(blob.setCurrentPosition(7,7).calculation(),13);
        assertEquals(blob.setCurrentPosition(6,0).calculation(),5);
        assertEquals(blob.setCurrentPosition(0,7).calculation(),1);
    }


    @Test
    public void NQueueTest(){


        assertTrue(new NQueue(5).calculate());
        assertTrue(new NQueue(6).calculate());
        assertTrue(new NQueue(8).calculate());
    }

    @Test
    public void PowerSetTest(){
       assertEquals(new PowerSet(new int[]{1, 2, 3}).calculation(),9);
       assertEquals(new PowerSet(new int[]{1, 2, 3,4}).calculation(),17);
       assertEquals(new PowerSet(new int[]{1, 2, 3,4,5}).calculation(),33);
       assertEquals(new PowerSet(new int[]{1, 2, 3,4,5,6}).calculation(),65);
       assertEquals(new PowerSet(new int[]{1, 2, 3,4,5,6,7}).calculation(),129);


    }
}
