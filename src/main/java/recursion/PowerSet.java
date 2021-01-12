package recursion;

import base.ArrayBaseProblem;
import base.IntResult;

public class PowerSet extends ArrayBaseProblem implements IntResult {

    int count;
    public PowerSet(int[] n) {
        array=n;
        count=1;
    }


    @Override
    public int calculation() {
        pSet(array);
        return count;
    }

    private void pSet(int[] array) {
        //TODO Recursive PowerSet
    }
}
