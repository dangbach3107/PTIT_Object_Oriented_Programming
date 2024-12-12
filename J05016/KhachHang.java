package J05016;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang>{ 
    private static int id = 1;
    private String ten, soPhong, maKH;
    private Date ngayNhanPhong, ngayTraPhong;
    private long tienDichVuPhatSinh, thanhTien, soNgay;
    public KhachHang(String ten, String soPhong, String ngayNhanPhong, String ngayTraPhong, long tienDichVuPhatSinh) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ten = ten;
        this.soPhong = soPhong;
        this.ngayNhanPhong = sdf.parse(ngayNhanPhong.trim());
        this.ngayTraPhong = sdf.parse(ngayTraPhong.trim());
        this.tienDichVuPhatSinh = tienDichVuPhatSinh;
        this.maKH = "KH" + String.format("%02d", id++);

        int tang = Integer.parseInt(soPhong.substring(0, 1));
        soNgay = (this.ngayTraPhong.getTime() - this.ngayNhanPhong.getTime()) / (24 * 60 * 60 * 1000) + 1;
        int giaNgay = 0;
        if(tang == 1) giaNgay = 25;
        else if(tang == 2) giaNgay = 34;
        else if(tang == 3) giaNgay = 50;
        else if(tang == 4) giaNgay = 80;
        thanhTien = soNgay * giaNgay + tienDichVuPhatSinh;
    }
    @Override
    public String toString() {
        return maKH + " " + ten + " " + soPhong + " "+ soNgay + " " + thanhTien;
    }
    @Override
    public int compareTo(KhachHang o) {
        return Long.compare(o.thanhTien, thanhTien);
    }
    
    
}
