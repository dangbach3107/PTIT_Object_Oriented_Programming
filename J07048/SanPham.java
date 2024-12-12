package J07048;

public class SanPham implements Comparable<SanPham> {
    private String maSP, tenSP;
    private long giaBan, thoiHanBaoHanh;
    public SanPham(String maSP, String tenSP, long giaBan, long thoiHanBaoHanh) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.thoiHanBaoHanh = thoiHanBaoHanh;
    }
    @Override
    public int compareTo(SanPham o) {
        if(this.giaBan != o.giaBan) return Long.compare(o.giaBan, this.giaBan);
        else return this.maSP.compareTo(o.maSP);
    }
    @Override
    public String toString() {
        return maSP + " " + tenSP + " " + giaBan + " "
                + thoiHanBaoHanh;
    } 

    
}
