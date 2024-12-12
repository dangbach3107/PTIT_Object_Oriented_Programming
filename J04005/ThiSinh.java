package J04005;

public class ThiSinh {
    private String hoTen, ngaySinh;
    private float diemMon1, diemMon2, diemMon3, tongDiem;

    public ThiSinh(String hoTen, String ngaySinh, float diemMon1, float diemMon2, float diemMon3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
        this.tongDiem = diemMon1 + diemMon2 + diemMon3;
    }

    public String toString() {
        return hoTen + " " + ngaySinh + " " + String.format(" %.1f", tongDiem);
    }
}