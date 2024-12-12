package J05012;

public class HoaDon implements Comparable<HoaDon> {
    private String maMH, tenMH;
    private long soLuong, donGia, chietKhau, tongTien;
    public HoaDon(String maMH, String tenMH, long soLuong, long donGia, long chietKhau) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
        this.tongTien = soLuong * donGia - chietKhau;
    }
    @Override
    public int compareTo(HoaDon o) {
        return Long.compare(o.tongTien, this.tongTien);
    }
    @Override
    public String toString() {
        return maMH + " " + tenMH + " " + soLuong + " " + donGia + " " + chietKhau + " " + tongTien;
    }

    
}
