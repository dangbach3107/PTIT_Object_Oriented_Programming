package J07010;

public class SinhVien {
    private String ten, lop, ngaySinh, msv;
    private float gpa;
    private static int count = 0;
    public SinhVien(String ten, String lop, String ngaySinh, float gpa) {
        this.msv = "B20DCCN" + String.format("%03d", ++count);
        this.ten = ten;
        this.lop = lop;
        String tmp [] = ngaySinh.split("/");
        this.ngaySinh = String.format("%02d/%02d/%s", Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), tmp[2]);
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return msv + " " + ten + " " + lop +  " " + ngaySinh + " " + String.format("%.2f", gpa);
    }

    
}
