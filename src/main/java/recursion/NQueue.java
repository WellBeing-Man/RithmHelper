package recursion;

import base.ArrayBaseProblem;
import base.BooleanResult;
import base.MapBaseProblem;

public class NQueue extends ArrayBaseProblem implements BooleanResult {

    public NQueue(int n) {
        array=new int[n];
        max=n;
    }

    @Override
    public boolean calculate() {
        return nQueue(0);
    }

    private boolean nQueue(int level){

        //TODO Recursive nQueue
        return false;
    }

    private boolean promising(int level) {
        //TODO implementing promising
            return true;
    }

}
