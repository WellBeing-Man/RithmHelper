package recursion;


import base.BooleanResult;
import base.MapBaseProblem;

public class Maze extends MapBaseProblem implements BooleanResult {

    public Maze(int[][] n) {
        map=n;
    }

    boolean findWay(int x, int y) {
        //todo recursive maze
        return true;
    }

    @Override
    protected MapBaseProblem setCurrentPosition(int x, int y) {
        currentPositionX=x;
        currentPositionY=y;
        return this;
    }

    @Override
    public boolean calculate() {
        return findWay(currentPositionX,currentPositionY);
    }

    private enum PATH{
        WAY(0),WALL(1),VISITED(3),BLOCKED(4);

        final private int tag;

        public int getTag() {
            return tag;
        }

        PATH(int s) {

            tag=s;
        }
    }
}
