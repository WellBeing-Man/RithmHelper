package dynamicprogramming;

import base.InputOneNumberClass;

public class Fibonacci implements DynamicProgrammingProblem<Integer> {

    private int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    @Override
    public Integer bottomUp() {
        return bottomUp(n);
    }

    @Override
    public Integer memoization() {
        return memoization(n);
    }

    private Integer bottomUp(int n) {

        return 0;
    }

    private Integer memoization(int n) {

        return 0;
    }
}
