package J07005;

import java.io.*;

/*
 @author dangbach
 17/09/2024
 16:22
 */

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        int[] count = new int[1000]; 

        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        for(int i = 0; i < 100000; i++){
            count[dis.readInt()]++;
        }

        for (int i = 0; i <= 1000; i++) {
            if(count[i] != 0)
                System.out.println(i + " " + count[i]);
        }
    }
}