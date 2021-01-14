package recursion;

import base.ArrayBaseProblem;
import base.IntResult;

public class PowerSet extends ArrayBaseProblem implements IntResult {

    int count;
    private boolean[] include;

    public PowerSet(int[] n) {
        array=n;
        max=n.length;
        include=new boolean[max];
        count=1;
    }


    @Override
    public int calculation() {
        pSet(0);
        return count;
    }

    private void pSet(int k) {
        if(k==max){
            for(int i=0;i<max;i++){
                if(include[i])
                    System.out.print(array[i]+ " ");
            }
            System.out.println();
            count++;
            return;
        }

        include[k]=false;
        pSet(k+1);
        include[k]=true;
        pSet(k+1);
    }


    protected void printArray(int[] array) {
        for (int a:array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
