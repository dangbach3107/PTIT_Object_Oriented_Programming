package J05056;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VDV implements Comparable<VDV> {
    private String ma;
    private static int stt = 0;
    private String ten;
    private Date ngaySinh, xuatPhat, ketThuc;
    private long thanhTichThucTe, uuTien, thanhTichXepHang;
    private int xepHang;

    public VDV(String ten, String ngaysinh, String xuatphat, String ketthuc) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
        this.ten = ten;
        this.ngaySinh = sdf.parse(ngaysinh);
        this.xuatPhat = sdf1.parse(xuatphat);
        this.ketThuc = sdf1.parse(ketthuc);

        ma = "VDV" + String.format("%02d", ++stt);
        thanhTichThucTe = (ketThuc.getTime() - xuatPhat.getTime()) / 1000;

        long age = 2021 - Long.parseLong(ngaysinh.substring(6));

        if (age < 18) {
            this.uuTien = 0;
        } else if (age < 25) {
            this.uuTien = 1;
        } else if (age <= 32) {
            this.uuTien = 2;
        } else {
            this.uuTien = 3;
        }

        thanhTichXepHang = thanhTichThucTe - uuTien;
    }

    public String ftime(long time) {
        long h = time / 3600;
        long m = (time % 3600) / 60;
        long s = time % 60;
        return String.format("%02d:%02d:%02d", h, m, s);
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public long getThanhTichXepHang() {
        return thanhTichXepHang;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %d", ma, ten, ftime(thanhTichThucTe), ftime(uuTien), ftime(thanhTichXepHang), xepHang);
    }

    @Override
    public int compareTo(VDV o) {
        return Long.compare(this.thanhTichXepHang, o.thanhTichXepHang);
    }

    public String getMa() {
        return ma;
    }

    public static int getStt() {
        return stt;
    }

    public String getTen() {
        return ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public Date getXuatPhat() {
        return xuatPhat;
    }

    public Date getKetThuc() {
        return ketThuc;
    }

    public long getThanhTichThucTe() {
        return thanhTichThucTe;
    }

    public long getUuTien() {
        return uuTien;
    }

    public int getXepHang() {
        return xepHang;
    }

    
    
}
