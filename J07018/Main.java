package J07018;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("SINHVIEN.in"));
            int n = Integer.parseInt(in.nextLine());

            while (n-- > 0) {
                SinhVien x = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()));
                System.out.println(x);
            }
        } catch (Exception e) {
        }
    }
}
