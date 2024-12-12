package J05004;
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        SinhVien[] sinhVienList = new SinhVien[N];

        for (int i = 0; i < N; i++) {
            sinhVienList[i] = new SinhVien();
            sinhVienList[i].nhap(sc);
        }

        for (SinhVien sv : sinhVienList) {
            System.out.println(sv);
        }
    }
}