package recursion;


import base.BooleanResult;
import base.MapBaseProblem;

public class Maze extends MapBaseProblem implements BooleanResult {

    private int max;

    public Maze(int[][] n) {
        map=n;
        max=n.length;
    }

    boolean findWay(int x, int y) {

        if(x<0 || y<0 || x>= max || y>= max)
            return false;
        else if(map[x][y] == PATH.EXIT.getTag()) {
            return true;
        }else if(map[x][y] != PATH.WAY.getTag()){
            return false;
        }else{
            map[x][y] = PATH.VISITED.getTag();
            if(findWay(x+1,y) || findWay(x-1,y) || findWay(x,y+1)|| findWay(x,y-1)) {
                return true;
            }
            map[x][y]=PATH.BLOCKED.getTag();
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
