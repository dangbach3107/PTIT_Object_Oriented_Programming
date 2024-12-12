package J05003;

import java.util.*;

public class SinhVien {
    private String ten, lop, ngaySinh, maSV;
    private float gpa;
    public SinhVien(String ten, String lop, String ngaySinh, float gpa) {
        this.ten = ten;
        this.lop = lop;
        String [] tmp = ngaySinh.split("/");
        String ngay = String.format("%02d", Integer.parseInt(tmp[0]));
        String thang = String.format("%02d", Integer.parseInt(tmp[1]));
        this.ngaySinh = ngay + "/" + thang + "/" + tmp[2];
        this.gpa = gpa;
    }
    public void setMaSV(int t) {
        this.maSV = String.format("B20DCCN%03d", t + 1);
    }
    @Override
    public String toString() {
        return maSV + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa) ;
    }
    
}
