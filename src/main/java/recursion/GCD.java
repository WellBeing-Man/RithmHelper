package recursion;

import base.InputTwoNumbersClass;

public class GCD extends InputTwoNumbersClass {

    public GCD(int n, int m) {
        super(n, m);
    }

    // Euclidean algorithm
    @Override
    protected int calculation(int n, int m) {
        if(m==0){
            return n;
        }
        return calculation(m,n%m);
    }
}
