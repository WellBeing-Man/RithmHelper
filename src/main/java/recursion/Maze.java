package recursion;



public class Maze {

    private int[][] map;
    private int currentPositionX, currentPositionY;

    public Maze(int[][] n) {
        map=n;
    }

    //Chaining method
    Maze setCurrentPosition(int currentPositionX,int currentPositionY){
        this.currentPositionX=currentPositionX;
        this.currentPositionY=currentPositionY;
        return this;
    }


    boolean findWay(int x, int y) {
        //todo recursive maze
        return true;
    }

    void printMap(){
        for(int[] line : map){
            for(int row : line){
                System.out.print(row + " ");
            }
            System.out.println();
        }
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
