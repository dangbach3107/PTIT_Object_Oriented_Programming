package J99210;

public class SinhVien implements Comparable<SinhVien> {
    private String maSV, ten, lop, email, sdt, gioitinh, size;

    public SinhVien(String maSV, String ten, String gioitinh, String lop, String email, String sdt) {
        this.maSV = maSV;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return  maSV + " " + ten + " " + lop + " " + email + " " + sdt;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public String getGioitinh() {
        return gioitinh;
    }
    public String getSize() {
        return size;
    }

    public String getMaSV(){
        return maSV;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSV.compareTo(o.maSV);
    }

    
}
