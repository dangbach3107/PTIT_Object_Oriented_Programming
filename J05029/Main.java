package J05029;

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
        int q = Integer.parseInt(sc.nextLine());
        for(int j = 0; j < q; j++){
            String s = sc.nextLine();
            String tmp[] = s.split(" ");
            long x = Long.parseLong(tmp[0]);
            long y = Long.parseLong(tmp[1]);
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n", x, y);
            for(DoanhNghiep i : dn){
                if(i.getSoSV() >= x && i.getSoSV() <= y){
                    System.out.println(i);
                }
            }
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