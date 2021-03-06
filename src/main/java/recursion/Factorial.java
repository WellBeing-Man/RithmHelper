package recursion;

import base.InputOneNumberClass;

public class Factorial extends InputOneNumberClass {


    public Factorial(int n) {
        super(n);
    }


    @Override
    public int calculation() {
        return factorial(n);
    }

    private int factorial(int n) {
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
}
