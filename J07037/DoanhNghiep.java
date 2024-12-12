package J07037;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String maDN, tenDN, soSV;

    public DoanhNghiep(String maDN, String tenDN, String soSV) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soSV = soSV;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        // TODO Auto-generated method stub
        return this.maDN.compareTo(o.maDN);
    }

    @Override
    public String toString() {
        return  maDN + " " + tenDN + " " + soSV  ;
    }
    
}
