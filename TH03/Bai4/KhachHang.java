package Bai4;

import java.io.*;
import java.text.*;
import java.util.*;

public class KhachHang {
    private static int demMaKH = 1;
    private String maKH;
    private String hoTen;
    private String diaChi;
    private String maSP;
    private int soLuong;
    private Date ngayMua;
    private Date ngayHetHanBaoHanh;
    private int tongTien;
    public KhachHang(String maKH, String hoTen, String diaChi, String maSP, int soLuong, String ngayMua, SanPham sanPham) throws ParseException {
        this.maKH = "KH" + String.format("%02d", demMaKH++);
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.ngayMua = new SimpleDateFormat("dd/MM/yyyy").parse(ngayMua);

        Calendar cal = Calendar.getInstance();
        cal.setTime(this.ngayMua);
        cal.add(Calendar.MONTH, (int)sanPham.getThoiHanBaoHanh());
        this.ngayHetHanBaoHanh = cal.getTime();
    }
    public String getMaKH() {
        return maKH;
    }
    public Date getNgayHetHanBaoHanh() {
        return ngayHetHanBaoHanh;
    }
    @Override
    public String toString() {
        return maKH + " " + hoTen + " " + diaChi + " " + maSP + " "
                + tongTien + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayHetHanBaoHanh);
    }
    


}
