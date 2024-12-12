package J05014;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        GiaoVien[] gv = new GiaoVien[t];
        for(int i = 0; i < t; i++){
            String ten = sc.nextLine();
            String maXT = sc.nextLine();
            float diemTinHoc = Float.parseFloat(sc.nextLine());
            float diemChuyenMon = Float.parseFloat(sc.nextLine());
            gv[i] = new GiaoVien(ten, maXT, diemTinHoc, diemChuyenMon);
        }
        Arrays.sort(gv);
        for(GiaoVien i : gv) System.out.println(i);
    }
}
// 3
// Le Van Binh
// A1
// 7.0
// 3.0
// Tran Van Toan
// B3
// 4.0
// 7.0
// Hoang Thi Tam
// C2
// 7.0
// 6.0