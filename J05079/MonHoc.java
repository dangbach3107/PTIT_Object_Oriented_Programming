package J05079;

public class MonHoc implements Comparable<MonHoc> {
    private String maMH, tenMH, nhom, tenGV;

    public MonHoc(String maMH, String tenMH, String nhom, String tenGV) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.nhom = nhom;
        this.tenGV = tenGV;
    }

    @Override
    public String toString() {
        return nhom + " " + tenGV;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.nhom.compareTo(o.nhom);
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getNhom() {
        return nhom;
    }

    public String getTenGV() {
        return tenGV;
    }
    
}
