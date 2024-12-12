package J06005;


public class KhachHang {
    private String maKH, tenKH, gioiTinh, diaChi;
    private static int count = 0;
    private String ngaySinh;
    public KhachHang(String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
        maKH = "KH" + String.format("%03d", ++count);
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
    }
    public String getMaKH() {
        return maKH;
    }
    public String getTenKH() {
        return tenKH;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public static int getCount() {
        return count;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    
}


