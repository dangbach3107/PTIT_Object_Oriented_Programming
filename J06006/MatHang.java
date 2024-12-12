package J06006;

public class MatHang {
    private static int countMH = 0;
    private String maHang, tenHang, donViTinh;
    private long giaMua, giaBan, loiNhuan;
    public MatHang(String tenHang, String donViTinh, long giaMua, long giaBan) {
        maHang = "MH" + String.format("%03d", ++countMH);
        this.tenHang = tenHang;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        loiNhuan = giaBan - giaMua;
    }
    public static int getCountMH() {
        return countMH;
    }
    public String getMaHang() {
        return maHang;
    }
    public String getTenHang() {
        return tenHang;
    }
    public String getDonViTinh() {
        return donViTinh;
    }
    public long getGiaMua() {
        return giaMua;
    }
    public long getGiaBan() {
        return giaBan;
    }
    public long getLoiNhuan() {
        return loiNhuan;
    }
}
