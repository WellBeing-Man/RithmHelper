package recursion;



public class Maze {

    private int[][] map;
    private int currentPositionX, currentPositionY;
    private int max;

    public Maze(int[][] n) {
        map=n;
        max =n.length;
    }

    //Chaining method
    public Maze setCurrentPosition(int currentPositionX,int currentPositionY){
        this.currentPositionX=currentPositionX;
        this.currentPositionY=currentPositionY;
        return this;
    }


    private boolean findWay(int x, int y) {

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

    private void printMap(){
        for(int[] line : map){
            for(int row : line){
                System.out.print(row + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }



    public boolean explore(){
        boolean result;
        printMap();
        result=findWay(currentPositionX,currentPositionY);
        printMap();


        return result;
    }


    private enum PATH{
        WAY(0),WALL(1),VISITED(2),BLOCKED(3),EXIT(4);

        final private int TAG;

        public int getTag() {
            return TAG;
        }

        PATH(int s) {

            TAG =s;
        }
    }
}
