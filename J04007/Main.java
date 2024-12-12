package J04007;
/*
 * @author dangbach
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String maNV = "00001";
        String ten = in.nextLine();
        String gioiTinh = in.nextLine();
        String ngaySinh = in.nextLine(); 
        String diaChi = in.nextLine();
        String maSoThue = in.nextLine(); 
        String kiHopDong = in.nextLine();
        
        NhanVien x = new NhanVien(maNV, ten, gioiTinh, ngaySinh, diaChi, maSoThue, kiHopDong);
        System.out.println(x);
        
        in.close();
    }
}