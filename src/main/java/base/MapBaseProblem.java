package base;

public abstract class MapBaseProblem {

    protected int[][] map;
    protected int currentPositionX, currentPositionY;
    protected int max;
    public abstract MapBaseProblem setCurrentPosition(int x, int y);

    protected void printMap(){
        for(int[] line : map){
            for(int row : line){
                System.out.print(row + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
