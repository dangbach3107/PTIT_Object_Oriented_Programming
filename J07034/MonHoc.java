package J07034;

public class MonHoc implements Comparable<MonHoc> {
    private String ma, ten, tinChi;
    public MonHoc(String ma, String ten, String tinChi) {
        this.ma = ma;
        this.ten = ten;
        this.tinChi = tinChi;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + tinChi ;
    }
    @Override
    public int compareTo(MonHoc o) {
        return this.ten.compareTo(o.ten);
    }

    
}
