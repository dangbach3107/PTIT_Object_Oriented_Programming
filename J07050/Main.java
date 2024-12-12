package J07050;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MATHANG.in"));

        int n = Integer.parseInt(in.nextLine());

        MatHang a [] = new MatHang[n];

        for(int i = 0; i < n; i++){
            a[i] = new MatHang(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()));
        }

        Arrays.sort(a);

        for(int  i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
}
