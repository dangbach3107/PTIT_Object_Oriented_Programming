package J07050;

public class MatHang implements Comparable<MatHang> {
    private static int count = 0;
    private String tenHang, nhomHang, maMH;
    private double giaMua, giaBan, loiNhuan;
    public MatHang(String tenHang, String nhomHang, double giaMua, double giaBan) {
        this.tenHang = tenHang;
        this.maMH = "MH" + String.format("%02d", ++count);
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }
    @Override
    public String toString() {
        return maMH +  " " + tenHang + " " + nhomHang + " " + String.format("%.2f", loiNhuan) ;
    }
    @Override
    public int compareTo(MatHang o) {
        // TODO Auto-generated method stub
        return Double.compare(o.loiNhuan, this.loiNhuan);
    }
    
    
    
}
