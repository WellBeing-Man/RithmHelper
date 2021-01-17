package sorting;

import base.ArrayBaseProblem;


// sorting super class
abstract class Sort extends ArrayBaseProblem {
    public Sort(int[] array) {
       this.array=array;
       max=array.length;
    }

    public abstract int[] sort();
}
