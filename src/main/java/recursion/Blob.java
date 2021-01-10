package recursion;

import base.IntResult;
import base.MapBaseProblem;

public class Blob extends MapBaseProblem implements IntResult {

    @Override
    public int calculation() {
        return countBlob(currentPositionX,currentPositionY,0);
    }

    @Override
    protected MapBaseProblem setCurrentPosition(int x, int y) {
        currentPositionX=x;
        currentPositionY=y;
        return null;
    }

    private int countBlob(int x,int y, int count){
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
