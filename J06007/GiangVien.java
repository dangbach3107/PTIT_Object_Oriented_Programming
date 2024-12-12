package J06007;

public class GiangVien {
    private String maGV, tenGV;
    private float thoiGian;
    public GiangVien(String maGV, String tenGV) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        thoiGian = 0f;
    }
    @Override
    public String toString() {
        return tenGV + " " + String.format("%.2f", thoiGian);
    }
    public String getMaGV() {
        return maGV;
    }
    public void setThoiGian(float thoiGian) {
        this.thoiGian += thoiGian;
    }
    
    

    
    

    
}
