package base;

abstract public class InputOneNumberClass implements IntResult{

    protected int n;

    public InputOneNumberClass(int n) {
        this.n = n;
    }




    public int value(){
        return calculation();
    }


}
