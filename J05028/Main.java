package J05028;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        DoanhNghiep[] dn = new DoanhNghiep[n];
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long soSV = Long.parseLong(sc.nextLine());
            dn[i] = new DoanhNghiep(ma, ten, soSV);
        }
        Arrays.sort(dn);
        for(DoanhNghiep i : dn){
            System.out.println(i);
        }
    }
}
// 4
// VIETTEL
// TAP DOAN VIEN THONG QUAN DOI VIETTEL
// 40
// FSOFT
// CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
// 300
// VNPT
// TAP DOAN BUU CHINH VIEN THONG VIET NAM
// 200
// SUN
// SUN*
// 50