package J05081;

public class MatHang implements Comparable<MatHang> {
    private String maMH, ten, donVi;
    private int mua, ban, lai;
    
    public MatHang(String maMH, String ten, String donVi, int mua, int ban) {
        this.maMH = maMH;
        this.ten = ten;
        this.donVi = donVi;
        this.mua = mua;
        this.ban = ban;
        lai = ban - mua;
    }

    public int compareTo(MatHang other){
        if(this.ban - this.mua != other.ban - other.mua){
            return Integer.compare(this.ban - this.mua , other.ban - other.mua) * - 1;
        }
        else   return this.maMH.compareTo(other.maMH);
    }

    @Override
    public String toString() {
        return maMH + " " + ten + " " + donVi + " " + mua + " " + ban
                + " " + lai;
    }
    
}
