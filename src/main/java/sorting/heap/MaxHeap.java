package sorting.heap;


public class MaxHeap {

    int[] heap;
    int max;
    public MaxHeap() {
        heap=new int[10];
        max=0;
    }


    public void insert(int input){
        max++;
        heap[max]=input;

        int now=max;
        int parent=(max)/2;
        while (parent>=1){
            if(heap[parent]<heap[now]){
                swap(heap,parent,now);
            }else{
                break;
            }
            now=parent;
            parent=parent/2;
        }
    }

    public int pop(){
        int result=heap[1];
        swap(heap,1,max);
        max--;
        heapify(heap,1);
        return result;
    }


    public void printHeap(){
        for (int i = 1; i <= max; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    private void heapify(int[] array, int i) {
        if(i * 2 > max-1){
            return;
        }

        int k;

        if(array[i*2]> array[i*2 +1]){
            k = i*2;
        }else {
            k = i*2 +1;
        }

        if(array[i]> array[k]){
            return;
        }
        swap(array,i,k);
        heapify(array,k);
    }

    private void swap(int[] array,int x,int y){
        int temp=array[x];
        array[x]=array[y];
        array[y]=temp;
    }

}
