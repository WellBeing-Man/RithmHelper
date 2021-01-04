import org.junit.Test;
import recursion.Factorial;
import recursion.GCD;

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

}
