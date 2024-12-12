package J05029;

public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma, ten;
    private long soSV;
    public DoanhNghiep(String ma, String ten, long soSV) {
        this.ma = ma;
        this.ten = ten;
        this.soSV = soSV;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + soSV;
    }
    @Override
    public int compareTo(DoanhNghiep o) {
        int cmp = Long.compare(o.soSV, soSV);
        if(cmp != 0) return cmp;    
        else return ma.compareTo(o.ma);
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
    public long getSoSV() {
        return soSV;
    }
    
    
}
