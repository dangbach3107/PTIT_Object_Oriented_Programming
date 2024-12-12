package J07046;

import java.io.*;
import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner in = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(in.nextLine());

        KhachHang a[] = new KhachHang[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = new KhachHang(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
        }

        Arrays.sort(a);

        for(int i = 0; i < n; i++)
        {
            System.out.println(a[i]);
        }
    }
}
