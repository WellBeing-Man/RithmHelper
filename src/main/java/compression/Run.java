package compression;

public class Run implements Comparable<Run>{

    public byte symbol;
    public int runLen;
    public int freq;

    public Run leftChild;
    public Run rightChild;

    public Run(byte symbol, int runLen, int freq) {
        //todo implement constructor
    }

    public Run(int freq) {
        //todo implement freq constructor
    }

    public Run() {
        //todo implement freq constructor
    }

    @Override
    public boolean equals(Object obj) {
        //todo implement equals
        return super.equals(obj);
    }

    @Override
    public int compareTo(Run o) {
        //todo implement compareTo by freq
        return 0;
    }
}
