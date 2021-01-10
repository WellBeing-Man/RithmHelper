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
        return countBlob(currentPositionX,currentPositionY);
    }

    @Override
    public Blob setCurrentPosition(int x, int y) {
        currentPositionX=x;
        currentPositionY=y;
        return this;
    }

    private int countBlob(int x,int y){
        //TODO recursive counting blob
        return 0;
    }

    private enum PIXEL{
        WHITE(0),BLUE(1),RED(2);

        PIXEL(int c) {
            COLOR = c;
        }
        final private int COLOR;
    }


}
