package J07010;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(in.nextLine());

        while (t-- > 0) {
            SinhVien x = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()));
            System.out.println(x);
        }
    }
}
