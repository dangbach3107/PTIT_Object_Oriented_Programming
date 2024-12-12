package Bai4;

public class SanPham {
    private String maSP;
    private String tenSP;
    private long giaBan;
    private long thoiHanBaoHanh;
    public SanPham(String maSP, String tenSP, long giaBan, long thoiHanBaoHanh) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.thoiHanBaoHanh = thoiHanBaoHanh;
    }
    public String getMaSP() {
        return maSP;
    }
    public long getGiaBan() {
        return giaBan;
    }
    public long getThoiHanBaoHanh() {
        return thoiHanBaoHanh;
    } 

    
    
}
