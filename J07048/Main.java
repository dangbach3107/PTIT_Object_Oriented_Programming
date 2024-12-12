package J07048;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SANPHAM.in"));

        int t = Integer.parseInt(in.nextLine());

        SanPham a[] = new SanPham[t];

        for(int i = 0; i < t; i++){
            a[i] = new SanPham(in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()));
        }

        Arrays.sort(a);

        for(int i = 0; i < t; i++){
            System.out.println(a[i]);
        }
    }
}
