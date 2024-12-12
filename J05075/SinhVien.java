package J05075;

public class SinhVien {
    private String ma, ten, lop, ghiChu;
    private int diemChuyenCan;
    public SinhVien(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        ghiChu = "";
    }
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    public void setDiemChuyenCan(int diemChuyenCan) {
        this.diemChuyenCan = diemChuyenCan;
    }
    public String getMa() {
        return ma;
    }
    public String getLop() {
        return lop;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + diemChuyenCan + " " + ghiChu;
    }

    

}
