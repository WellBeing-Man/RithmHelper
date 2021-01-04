package base;

abstract public class InputOneNumberClass {

    protected int n;

    public InputOneNumberClass(int n) {
        this.n = n;
    }

    protected abstract int calculation(int n);

    public int value(){
        return calculation(n);
    }
}
