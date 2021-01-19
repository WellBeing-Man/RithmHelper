package recursion;


import base.BooleanResult;
import base.MapBaseProblem;

public class Maze extends MapBaseProblem implements BooleanResult {



    public Maze(int[][] n) {
        map=n;
        max=n.length;
    }


    @Override
    public Maze setCurrentPosition(int x, int y) {
        currentPositionX=x;
        currentPositionY=y;
        return this;
    }

    @Override
    public boolean calculate() {
        // TODO recursive Maze
        return false;
    }

    public boolean explore(){
        printMap();
        boolean result=calculate();
        printMap();
        return result;
    }


    private enum PATH{
        WAY(0),WALL(1),VISITED(2),BLOCKED(3),EXIT(4);

        final private int tag;

        public int getTag() {
            return tag;
        }

        PATH(int s) {

            tag=s;
        }
    }
}
