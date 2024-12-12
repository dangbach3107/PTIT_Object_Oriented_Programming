package J07051;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class KhachHang implements Comparable<KhachHang> {
    private String tenKhachHang, soPhong, ngayNhanPhong, ngayTraPhong, maKhachHang;
    private long soTienDichVuPhatSinh, thanhTien, soNgayO;
    private static int dem = 0;
    public KhachHang(String tenKhachHang, String soPhong, String ngayNhanPhong, String ngayTraPhong,
            long soTienDichVuPhatSinh) throws ParseException {
        this.maKhachHang = "KH" + String.format("%02d", ++dem);
        this.soPhong = soPhong.trim();
        this.soTienDichVuPhatSinh = soTienDichVuPhatSinh;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String tmp1 [] = ngayNhanPhong.split("/");
        this.ngayNhanPhong = String.format("%02d/%02d/%s", Integer.parseInt(tmp1[0]), Integer.parseInt(tmp1[1]), tmp1[2]);
        String tmp2 [] = ngayTraPhong.split("/");
        this.ngayTraPhong = String.format("%02d/%02d/%s", Integer.parseInt(tmp2[0]), Integer.parseInt(tmp2[1]), tmp2[2]);

        Date nhanPhong = sdf.parse(this.ngayNhanPhong);
        Date traPhong = sdf.parse(this.ngayTraPhong);

        long tienMoiNgay = 0;
        if(soPhong.charAt(0) == '1') tienMoiNgay = 25;
        else if (soPhong.charAt(0) == '2') tienMoiNgay = 34;
        else if (soPhong.charAt(0) == '3') tienMoiNgay = 50;
        else tienMoiNgay = 80;
        soNgayO = (traPhong.getTime() - nhanPhong.getTime()) / (1000 * 86400) + 1;
        this.thanhTien = soNgayO * tienMoiNgay + soTienDichVuPhatSinh;

        this.tenKhachHang = "";
        String tmp3 [] = tenKhachHang.trim().split("\\s+");
        for(String token : tmp3){
            this.tenKhachHang += token.substring(0,1).toUpperCase() + token.substring(1).toLowerCase() + " ";
        }
    }
    @Override
    public String toString() {
        return maKhachHang + " " + tenKhachHang + soPhong + " " + soNgayO + " " + thanhTien;
    }
    @Override
    public int compareTo(KhachHang o) {
        return Long.compare(o.thanhTien, this.thanhTien);
    }
    
    
}
