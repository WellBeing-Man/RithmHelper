package recursion;

import base.InputOneNumberClass;

public class Factorial extends InputOneNumberClass {


    public Factorial(int n) {
        super(n);
    }


    @Override
    protected int calculation(int n) {

        if(n<=0){
            return 1;
        }
        return n*calculation(n-1);
    }



}
