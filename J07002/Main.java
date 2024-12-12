import java.util.Scanner;
import java.io.*;
/*
 @author dangbach
 17/09/2024
 16:12
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long kq = 0;
        while(sc.hasNext())
        {
            String s = sc.next();
            try {
                kq += Integer.parseInt(s);
            } catch (Exception e) {

            }
        }
        System.out.println(kq);
    }
}
