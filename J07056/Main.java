package J07056;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(in.nextLine());

        KhachHang a[] = new KhachHang[n];

        for(int i = 0; i < n; i++){
            String hoTen = in.nextLine();
            String tmp = in.nextLine();
            String[] tokens = tmp.trim().split("\\s+");
            KhachHang x = new KhachHang(hoTen, tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
            a[i] = x;
        }

        Arrays.sort(a);
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
}
