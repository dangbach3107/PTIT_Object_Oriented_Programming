package J05009;

public class ThiSinh implements Comparable<ThiSinh>{
    private static int id = 0;
    private String ten, ngaySinh;
    private int ma;
    private float diem1, diem2, diem3, tong;
    public ThiSinh(String ten, String ngaySinh, float diem1, float diem2, float diem3) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        ma = ++id;
        tong = diem1 + diem2 + diem3;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + ngaySinh + " " + String.format("%.1f", tong);
    }
    @Override
    public int compareTo(ThiSinh o) {
        if(tong < o.tong) return 1;
        else if(tong > o.tong) return -1;
        else return ma - o.ma;
    }
    public static int getId() {
        return id;
    }
    public static void setId(int id) {
        ThiSinh.id = id;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public int getMa() {
        return ma;
    }
    public void setMa(int ma) {
        this.ma = ma;
    }
    public float getDiem1() {
        return diem1;
    }
    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }
    public float getDiem2() {
        return diem2;
    }
    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }
    public float getDiem3() {
        return diem3;
    }
    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }
    public float getTong() {
        return tong;
    }
    public void setTong(float tong) {
        this.tong = tong;
    }
    
    
}
