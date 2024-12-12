package J05070;

public class CLB {
    private String ma, ten;
    private long giaVe;
    public CLB(String ma, String ten, long giaVe) {
        this.ma = ma;
        this.ten = ten;
        this.giaVe = giaVe;
    }

    public long getGiaVe() {
        return giaVe;
    }
    
    public String getTen() {
        return ten;
    }

    public String getMa() {
        return ma;
    }
}
