package sorting;

import base.ArrayBaseProblem;

import java.util.Arrays;


// sorting super class
public abstract class Sort extends ArrayBaseProblem {
    public Sort(int[] input) {
       this.array= Arrays.copyOf(input,input.length);
       max=this.array.length;
    }

    public abstract int[] sort();

    protected void swap(int[] array,int x,int y){
        int temp=array[x];
        array[x]=array[y];
        array[y]=temp;
    }
}
