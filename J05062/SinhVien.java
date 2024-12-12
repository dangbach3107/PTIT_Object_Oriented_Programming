package J05062;

public class SinhVien implements Comparable<SinhVien>{
    private String ten, trangThai;
    private float tbc, drl;
    public SinhVien(String ten, float tbc, float drl) {
        this.ten = ten;
        this.tbc = tbc;
        this.drl = drl;
        if(tbc >= 3.6 && drl >= 90) trangThai = "XUATSAC";
        else if(tbc >= 3.2 && drl >= 80) trangThai = "GIOI";
        else if(tbc >= 2.5 && drl >= 70) trangThai = "KHA";
        else trangThai = "KHONG";
    }
    public String getTen() {
        return ten;
    }
    public float getTbc() {
        return tbc;
    }
    public float getDrl() {
        return drl;
    }
    @Override
    public String toString() {
        return ten + ": " + trangThai;
    }
    @Override
    public int compareTo(SinhVien o) {
        return Float.compare(o.tbc, tbc);
    }
    
}
