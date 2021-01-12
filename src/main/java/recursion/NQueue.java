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
        if(!promising(level-1)){
            return false;
        }else if(level==max){
            printMap();
            return true;
        }
            for(int i=1;i<=max;i++) {
                array[level]=i;
                if(nQueue(level+1)){
                    return true;
                }
            }
        return false;
    }

    private boolean promising(int level) {
        for (int i = 0; i < level; i++) {
            if (array[i] == array[level]) {
                return false;
            } else if (level-i ==Math.abs(array[level]-array[i])) {
                return false;
            }
        }
            return true;
    }

}
