package recursion;

import base.InputTwoNumbersClass;

public class GCD extends InputTwoNumbersClass {

    public GCD(int n, int m) {
        super(n, m);
    }

    @Override
    public int calculation() {
        return gcd(n,m);
    }

    private int gcd(int n, int m) {
        //todo Euclidean algorithm
        return 0;
    }
}
