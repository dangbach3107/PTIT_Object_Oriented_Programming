package J05080;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        MonHoc[] monHocs = new MonHoc[t];
        for (int i = 0; i < t; i++) {
            String maMH = sc.nextLine();
            String tenMH = sc.nextLine();
            String nhom = sc.nextLine();
            String tenGV = sc.nextLine();
            monHocs[i] = new MonHoc(maMH, tenMH, nhom, tenGV);
        }
        Arrays.sort(monHocs);
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String gv = sc.nextLine();
            
            for (MonHoc monHoc : monHocs) {
                if (monHoc.getTenGV().equals(gv)) {
                    System.out.println("Danh sach cho giang vien " + monHoc.getTenGV() + ":");
                    break;
                }
            }

            for (MonHoc monHoc : monHocs) {
                if (monHoc.getTenGV().equals(gv)) {
                    System.out.println(monHoc);
                    
                }
            }
        }
    }
}
// 4
// THCS2D20
// Tin hoc co so 2 - D20
// 01
// Nguyen Binh An
// CPPD20
// Ngon ngu lap trinh C++ - D20
// 01
// Le Van Cong
// THCS2D20
// Tin hoc co so 2 - D20
// 02
// Nguyen Trung Binh
// LTHDTD19
// Lap trinh huong doi tuong - D19
// 01
// Nguyen Binh An
// 1
// Nguyen Binh An