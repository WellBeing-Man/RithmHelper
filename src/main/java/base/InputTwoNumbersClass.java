package base;

abstract public class InputTwoNumbersClass {

    protected int n;
    protected int m;

    public InputTwoNumbersClass(int n, int m) {
        this.n = n;
        this.m = m;
    }

    protected abstract int calculation(int n,int m);

    public int value(){
        return calculation(n,m);
    }
}
