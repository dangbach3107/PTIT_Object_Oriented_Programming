package J05035;

public class SinhVien implements Comparable<SinhVien>{ 
    private static int id = 0;
    private int stt = id;
    private String maSV, ten, lop, email, dn;
    public SinhVien(String maSV, String ten, String lop, String email, String dn) {
        this.stt = ++id;
        this.maSV = maSV;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }
    @Override
    public String toString() {
        return stt + " " + maSV + " " + ten + " " + lop + " " + email + " " + dn;
    }
    public static int getId() {
        return id;
    }
    public int getStt() {
        return stt;
    }
    public String getMaSV() {
        return maSV;
    }
    public String getTen() {
        return ten;
    }
    public String getLop() {
        return lop;
    }
    public String getEmail() {
        return email;
    }
    public String getDn() {
        return dn;
    }
    @Override
    public int compareTo(SinhVien o) {
        return this.maSV.compareTo(o.maSV);
    }

    
}
