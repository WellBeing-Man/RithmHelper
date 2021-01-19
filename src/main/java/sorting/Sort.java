package sorting;

import base.ArrayBaseProblem;


// sorting super class
public abstract class Sort extends ArrayBaseProblem {
    public Sort(int[] array) {
       this.array=array;
       max=array.length;
    }

    public abstract int[] sort();

    protected void swap(int[] array,int x,int y){
        int temp=array[x];
        array[x]=array[y];
        array[y]=temp;
    }
}
