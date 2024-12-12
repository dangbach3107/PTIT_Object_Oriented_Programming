package J07053;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("XETTUYEN.in"));
            int n = Integer.parseInt(in.nextLine());

            for(int i = 0; i < n; i++){
                ThiSinh x = new ThiSinh(in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()));
                System.out.println(x);
            }
        } catch (Exception e) {
        }
    }
}
