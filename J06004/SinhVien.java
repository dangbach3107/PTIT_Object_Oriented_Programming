package J06004;

public class SinhVien implements Comparable<SinhVien>{
    private String maSV, tenSV, sdt;
    private int soNhom;
    private String tenNhom;
    public SinhVien(String maSV, String tenSV, String sdt, int soNhom) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.sdt = sdt;
        this.soNhom = soNhom;
    }

    void setTenNhom(String tenNhom) {
        this.tenNhom = tenNhom;
    }

    int getSoNhom() {
        return soNhom;
    }

    @Override
    public String toString() {
        return  maSV + " " + tenSV + " " + sdt + " " + soNhom + " "
                + tenNhom  ;
    }

    @Override
    public int compareTo(SinhVien o) {
        // TODO Auto-generated method stub
        return maSV.compareTo(o.maSV);
    }

    
}
