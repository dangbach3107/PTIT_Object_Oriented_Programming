package J05065;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        NhanVien[] nv = new NhanVien[t];
        for(int i = 0; i < t; i++) {
            String tmp = sc.nextLine();
            String ma = tmp.substring(0, 7);
            String ten = tmp.substring(8);
            nv[i] = new NhanVien(ma, ten);
            if(nv[i].getMaChucVu().equals("GD") && NhanVien.getGd() > 1){
                nv[i].setMaChucVu("NV");
            }
            else if(nv[i].getMaChucVu().equals("TP") && NhanVien.getTp() > 3){
                nv[i].setMaChucVu("NV");
            }
            else if(nv[i].getMaChucVu().equals("PP") && NhanVien.getPp() > 3){
                nv[i].setMaChucVu("NV");
            }
        }
        Arrays.sort(nv);
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String maChucVu = sc.nextLine();
            for(NhanVien i : nv){
                if(i.getMaChucVu().equals(maChucVu)){
                    System.out.println(i);
                }
            }
        }
    }
}
// 6
// GD08001 Nguyen Kim Loan
// TP05002 Hoang Thanh Tuan
// TP05001 Tran Binh Nguyen
// PP06002 Phan Trung Tuan
// PP06001 Tran Quoc Huy
// NV04003 Vo Van Lan
// 2
// TP
// PP