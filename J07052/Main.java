package J07052;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(in.nextLine());
        ThiSinh a[] = new ThiSinh[n];

        for(int i = 0; i < n; i++){
            a[i]  = new ThiSinh(in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()));
        }

        Arrays.sort(a);

        int soChiTieu = Integer.parseInt(in.nextLine());
        float diemChuan = a[soChiTieu - 1].getDiemXetTuyen();
        System.out.printf("%.1f\n", diemChuan);
        for(int i = 0 ;i < n; i++){
            if(a[i].getDiemXetTuyen() >= diemChuan) System.out.println(a[i] + " TRUNG TUYEN");
            else System.out.println(a[i] + " TRUOT");
        }
    }
}
