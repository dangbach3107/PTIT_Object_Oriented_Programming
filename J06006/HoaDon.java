package J06006;

public class HoaDon implements Comparable<HoaDon> {
    private static int countHD = 0;
    private String maHD;
    private KhachHang khachHang;
    private MatHang matHang;
    private long soLuong;
    public HoaDon(KhachHang khachHang, MatHang matHang, long soLuong) {
        maHD = "HD" + String.format("%03d", ++countHD);
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }
    @Override
    public String toString() {
        return maHD + " " + khachHang.getTenKH() + " " + khachHang.getDiaChi() + " " + matHang.getTenHang()
                + " " + soLuong + " " + matHang.getGiaBan() * soLuong + " " + matHang.getLoiNhuan() * soLuong;
    }
    @Override
    public int compareTo(HoaDon o) {
        return Long.compare(o.matHang.getLoiNhuan() * o.soLuong, this.matHang.getLoiNhuan()*this.soLuong);
    }
    
    
}
