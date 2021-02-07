import compression.HuffmanCoding;
import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class HuffManCodingTest {

    @Test
    public void huffmanCodingEncodingTest(){
        HuffmanCoding app=new HuffmanCoding();
        RandomAccessFile fin;
        String fileName="";
        Scanner kb= new Scanner(System.in);
        try {
            System.out.print("Enter a file name : ");
            fileName=kb.next();
            fin=new RandomAccessFile(fileName,"r");
            app.compressFile(fileName,fin);
            fin.close();
        }catch (IOException e){
            System.err.println("Can not open " + fileName);
        }
    }

    @Test
    public void huffmanCodingDecodingTest(){
        HuffmanCoding app=new HuffmanCoding();
        RandomAccessFile fin;
        String fileName="";
        Scanner kb= new Scanner(System.in);
        try {
            System.out.print("Enter a file name : ");
            fileName=kb.next();
            fin=new RandomAccessFile(fileName,"r");
            app.decompressFile(fileName,fin);
            fin.close();
        }catch (IOException e){
            System.err.println("Can not open " + fileName);
        }
    }
}
