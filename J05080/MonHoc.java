package J05080;

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
        return maMH + " " + tenMH + " " + nhom;
    }

    @Override
    public int compareTo(MonHoc o) {
        int cmp =this.maMH.compareTo(o.maMH) ;
        if(cmp == 0) {
            return this.nhom.compareTo(o.nhom);
        }
        return cmp;
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
