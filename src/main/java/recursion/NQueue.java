package recursion;

import base.BooleanResult;
import base.MapBaseProblem;

public class NQueue extends MapBaseProblem implements BooleanResult {

    public NQueue(int[][] n) {
        map=n;
    }

    @Override
    public NQueue setCurrentPosition(int x, int y) {
        currentPositionX=x;
        currentPositionY=y;
        return this;
    }

    @Override
    public boolean calculate() {
        return nQueue(currentPositionX,currentPositionY);
    }

    private boolean nQueue(int x,int y){
        //TODO implement N-Queue problem
        return true;
    }

    public boolean explore(){
        printMap();
        boolean result=nQueue(currentPositionX,currentPositionY);
        printMap();
        return result;
    }

}
