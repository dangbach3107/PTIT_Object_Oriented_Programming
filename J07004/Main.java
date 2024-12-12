package J07004;
import java.util.Scanner;
import java.io.*;

/*
 @author dangbach
 17/09/2024
 16:22
 */

public class Main {
   public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int a[] = new int[1005];

        while (sc.hasNext()) {
            int n = sc.nextInt();
            a[n]++;
        }
        for(int i = 0; i <= 1000; i++)
        {
            if(a[i] != 0){
                System.out.println(i + " " + a[i]);
            }
        }
   } 
}
