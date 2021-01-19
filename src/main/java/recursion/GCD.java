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

    private int gcd(int a, int b) {
        if(b<=0){
            return a;
        }
        return gcd(b,a%b);
    }
}
