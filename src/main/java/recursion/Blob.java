package recursion;

import base.IntResult;
import base.MapBaseProblem;

public class Blob extends MapBaseProblem implements IntResult {

    public Blob(int[][] n) {
        map=n;
        max=n.length;
    }

    @Override
    public int calculation() {
        //TODO recursive BLOB
        return 0;
    }

    @Override
    public Blob setCurrentPosition(int x, int y) {
        currentPositionX=x;
        currentPositionY=y;
        return this;
    }


}
