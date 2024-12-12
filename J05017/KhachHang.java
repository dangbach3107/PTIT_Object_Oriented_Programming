package J05017;

public class KhachHang implements Comparable<KhachHang>{
    private static int id = 0;
    private String ten, maKH;
    private long chiSoCu, chiSoMoi, soTien;
    private float heSo;
    public KhachHang(String ten, long chiSoCu, long chiSoMoi) {
        maKH = "KH" + String.format("%02d", ++id);
        this.ten = ten;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        long chiSo = chiSoMoi - chiSoCu;
        if(chiSo <= 50){
            soTien = chiSo * 100;
            heSo = 0.02f;
        }
        else if(chiSo <= 100){
            soTien = 50 * 100 + (chiSo - 50) * 150;
            heSo = 0.03f;
        }
        else{
            soTien = 50 * 100 + 50 * 150 + (chiSo - 100) * 200 ;
            heSo = 0.05f;
        }
            
    }
    @Override
    public String toString() {
        return maKH + " " + ten + " " + Math.round(soTien * (1 + heSo));
    }
    @Override
    public int compareTo(KhachHang o) {
        return Long.compare(o.soTien, soTien);
    }
    
    
}
