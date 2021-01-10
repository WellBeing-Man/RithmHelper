package recursion;


import base.BooleanResult;
import base.MapBaseProblem;

public class Maze extends MapBaseProblem implements BooleanResult {

    public Maze(int[][] n) {
        map=n;
    }

    boolean findWay(int x, int y) {

        if(x<0 || y<0 || x>= max || y>= max)
            return false;
        else if(map[x][y] == PATH.EXIT.TAG) {
            return true;
        }else if(map[x][y] != PATH.WAY.TAG){
            return false;
        }else{
            map[x][y] = PATH.VISITED.TAG;
            if(findWay(x+1,y) || findWay(x-1,y) || findWay(x,y+1)|| findWay(x,y-1)) {
                return true;
            }
            map[x][y]=PATH.BLOCKED.TAG;
            return false;
        }
    }

    @Override
    public Maze setCurrentPosition(int x, int y) {
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
