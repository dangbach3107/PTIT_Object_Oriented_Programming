package J05073;

public class DonHang {
    private String ma;
    private float donGia, soLuong, giaBan;
    private float thue, phiVanChuyen, loiNhuan, uuTien;
    public DonHang(String ma, float donGia, float soLuong) {
        this.ma = ma;
        this.donGia = donGia;
        this.soLuong = soLuong;
        if(ma.charAt(0) == 'T') {
            thue = 0.29f;
            phiVanChuyen = 0.04f;
        } else if(ma.charAt(0) == 'C') {
            thue = 0.1f;
            phiVanChuyen = 0.03f;
        } else if(ma.charAt(0) == 'D') {
            thue = 0.08f;
            phiVanChuyen = 0.025f;
        } else {
            thue = 0.02f;
            phiVanChuyen = 0.005f;
        }

        if(ma.charAt(ma.length() - 1) == 'C'){
            uuTien = 0.05f;
        }
        else uuTien = 0;
        loiNhuan = (donGia * (1 + thue * (1 - uuTien) + phiVanChuyen)) * 1.2f;
    }
    @Override
    public String toString() {
        return ma + " "+ String.format("%.2f", loiNhuan);
    }
    
    
}
