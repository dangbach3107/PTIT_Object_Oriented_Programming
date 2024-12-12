package J07046;

import java.util.*;
import java.text.*;

public class KhachHang implements Comparable<KhachHang>{
    private static int count = 0;
    private String maKH, tenKhach, maPhong;
    Date ngayDen, ngayDi;
    private long soNgayLuuTru;

    public KhachHang(String tenKhach, String maPhong, String ngayDen, String ngayDi) throws ParseException {
        this.maKH = "KH" + String.format("%02d", ++count);
        this.tenKhach = tenKhach;
        this.maPhong = maPhong;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayDen = sdf.parse(ngayDen);
        this.ngayDi = sdf.parse(ngayDi);
        this.soNgayLuuTru = (this.ngayDi.getTime()  - this.ngayDen.getTime()) / (1000 * 86400);
    }

    public long getSoNgayLuuTru (){
        return soNgayLuuTru;
    }

    @Override
    public String toString() {
        return maKH + " " + tenKhach + " " + maPhong + " " + soNgayLuuTru;
    }

    @Override
    public int compareTo(KhachHang o) {
        return Long.compare(o.soNgayLuuTru, this.soNgayLuuTru);
    }

}
