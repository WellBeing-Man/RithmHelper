package compression;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class HuffmanCoding{

    private ArrayList<Run> runs;
    private Run theRoot;
    private MinHeap<Run> heap;

    private ArrayList<Run> traversalResult;

    private Run[] chars;

    public int codeword;
    public int codewordLen;

    public HuffmanCoding() {
        runs=new ArrayList<>();
        theRoot=null;
        chars=new Run[256];
    }

    public void collectRuns(RandomAccessFile randomAccessFile) throws IOException{
        /* todo
            1. store all runs into the heap
            2. while the heap size>1 do
                (1) perform extractMin two times
                (2) make  a combined tree
                (3) inert the combined tree into the heap
            3. Let theRoot be the root of the tree

         */
    }


    //for test code return array
    public Run[] traversal(){
            traversalResult=new ArrayList<>();
            preOrderTraversal(theRoot,0);
        return (Run[])traversalResult.toArray();
    }

    private void preOrderTraversal(Run node, int depth){
        for (int i = 0; i < depth; i++) {
            System.out.print(" ");
            if (node==null){
                System.out.println("null");
            } else {
                System.out.println(node.toString());
                traversalResult.add(node);
                preOrderTraversal(node.leftChild,depth+1);
                preOrderTraversal(node.rightChild,depth+1);
            }
        }

    }

    private void assignCodeWord(byte codeword,Run node){
        //todo
        // implement assigning code word
    }



    private void storeRunsIntoArray(Run p){
        if(p.leftChild==null && p.rightChild==null)
            insertToArray(p);
        else {
            storeRunsIntoArray(p.leftChild);
            storeRunsIntoArray(p.rightChild);
        }
    }

    private void insertToArray(Run p) {
        //todo implement inertToArray
    }

    public Run findRun(byte symbol, int length){
        // todo find the run object in chars array
        return null;
    }

    private void outputFrequencies(RandomAccessFile fIn, RandomAccessFile fOut) throws IOException{

        fOut.writeInt(runs.size());

        fOut.writeLong(fIn.getFilePointer());

        for (int i = 0; i < runs.size(); i++) {
            Run r= runs.get(i);
            fOut.write(r.symbol);
            fOut.writeInt(r.runLen);
            fOut.writeInt(r.freq);
        }
    }

    public void compressFile(String inFileName, RandomAccessFile fIn) throws IOException{
        String outFileName = new String(inFileName+".z");
        RandomAccessFile fOut=new RandomAccessFile(outFileName,"rw");

        collectRuns(fIn);
        outputFrequencies(fIn,fOut);
        createHuffmanTree();
        assignCodeWord((byte) 0,theRoot);
        storeRunsIntoArray(theRoot);
        fIn.seek(0);
        encode(fIn,fOut);
    }

    private void encode(RandomAccessFile fIn, RandomAccessFile fOut) {
        /*
        * todo
        *  while there remains bytes to read in the file{
        *   recognize a run;
        *   find the codeword for the run
        *   pack the codeword into the buffer
        *   if hte buffer becomes full
        *       wirte the buffer into the compressed file;
        *   }
        *
        * todo
        *   if buffer is not empty{
        *       append 0s into the buffer;
        *       write the buffer into the compressed file;
        *    }
        * */

    }

    private void createHuffmanTree() {
    }

    public void decompressFile(String inFileName, RandomAccessFile fIn) throws IOException {
        String outFilename = new String(inFileName+".dec");
        RandomAccessFile fOut=new RandomAccessFile(outFilename,"rw");

        inputFrequencies(fIn);
        createHuffmanTree();
        assignCodeWord((byte) 0,theRoot);
        decode(fIn,fOut);
    }

    private void decode(RandomAccessFile fIn, RandomAccessFile fOut) {
        //todo implement decode
    }

    private void inputFrequencies(RandomAccessFile fIn) throws IOException {
        int dataIndex=fIn.readInt();
        long charCount=fIn.readLong();
        runs.ensureCapacity(dataIndex);
        for (int i = 0; i < dataIndex; i++) {
            Run r= new Run();
            r.symbol=(byte) fIn.read();
            r.runLen=fIn.readInt();
            r.freq =fIn.readInt();
            runs.add(r);
        }
    }
}
