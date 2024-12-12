package J07051;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("KHACHHANG.in"));

        int n = Integer.parseInt(in.nextLine());

        KhachHang a[] = new KhachHang[n];

        for(int  i = 0 ; i < n; i++){
            try {
                a[i] = new KhachHang(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()));
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

        Arrays.sort(a);

        for(int i = 0;i < n; i++){
            System.out.println(a[i]);
        }
    }
}
