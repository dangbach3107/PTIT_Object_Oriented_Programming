package J05044;

public class NhanVien {
    private String hoTen, chucVu, maNV;
    private long luongNgay, ngayCong, phuCapChucVu, luong, tamUng, conlai;
    private static int count = 0;

    public NhanVien(String hoTen, String chucVu, long luongNgay, long ngayCong) {
        maNV = String.format("NV%02d", ++count);
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.luongNgay = luongNgay;
        this.ngayCong = ngayCong;

        this.phuCapChucVu = tinhPhuCap(chucVu);
        this.luong = luongNgay * ngayCong;
        this.tamUng = tinhTamUng();
        this.conlai = luong + phuCapChucVu - tamUng;
    }

    private long tinhPhuCap(String chucVu) {
        switch (chucVu) {
            case "GD": return 500;
            case "PGD": return 400;
            case "TP": return 300;
            case "KT": return 250;
            default: return 100;
        }
    }

    private long tinhTamUng() {
        long tongThuNhap = luong + phuCapChucVu;
        if (tongThuNhap * 2 / 3 < 25000) {
            return Math.round(tongThuNhap * 2.0 / 3 / 1000) * 1000;
        } else {
            return 25000;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", maNV, hoTen, phuCapChucVu, luong, tamUng, conlai);
    }

    public String getChucVu() {
        return chucVu;
    }
}
