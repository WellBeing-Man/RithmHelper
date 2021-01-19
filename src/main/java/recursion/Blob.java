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

        if(x<0 || y<0 || x>=max || y>=max){
            return 0;
        }else if(map[x][y] != PIXEL.BLUE.COLOR){
            return 0;
        }else{
            map[x][y]=PIXEL.RED.COLOR;
            return 1+countBlob(x+1,y)+countBlob(x-1,y)+
                    countBlob(x,y+1)+countBlob(x,y-1)+
                    countBlob(x+1,y+1)+countBlob(x+1,y-1)+
                    countBlob(x-1,y+1)+countBlob(x-1,y-1);
        }
    }

    private enum PIXEL{
        WHITE(0),BLUE(1),RED(2);

        PIXEL(int c) {
            COLOR = c;
        }
        final private int COLOR;
    }


}
