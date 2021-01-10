package base;

abstract public class InputTwoNumbersClass implements IntResult {

    protected int n;
    protected int m;

    public InputTwoNumbersClass(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public int value(){
        return calculation();
    }


}
