package base;

public abstract class MapBaseProblem {

    protected int[][] map;
    protected int currentPositionX, currentPositionY;

    protected abstract MapBaseProblem setCurrentPosition(int x, int y);

    void printMap(){
        for(int[] line : map){
            for(int row : line){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
