package J06005;

public class HoaDon {
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
                + " " + matHang.getDonViTinh() + " " + matHang.getGiaMua() + " " + matHang.getGiaBan() + " " + soLuong + " " + soLuong * matHang.getGiaBan();
    }
    
    
}
