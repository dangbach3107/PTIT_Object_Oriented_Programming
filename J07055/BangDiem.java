package J07055;

public class BangDiem implements Comparable<BangDiem> {
    private String maSV;
    private String ten;
    private String xepLoai;
    private float diemMon1, diemMon2, diemMon3, diemTrungBinh;
    private static int dem = 0;

    public BangDiem(String ten, float diemMon1, float diemMon2, float diemMon3) {
        maSV = "SV" + String.format("%02d", ++dem);
        this.ten = "";
        String tmp[] = ten.trim().toLowerCase().split("\\s+");
        for(String token : tmp){
            this.ten += token.toUpperCase().substring(0,1) + token.substring(1) + " ";
        }
        this.ten = this.ten.trim();
        diemTrungBinh = diemMon1 * 0.25f + diemMon2 * 0.35f + diemMon3 * 0.4f;
        if(diemTrungBinh >= 8) xepLoai = "GIOI";
        else if(diemTrungBinh >= 6.5) xepLoai = "KHA";
        else if(diemTrungBinh >= 5) xepLoai = "TRUNG BINH";
        else xepLoai = "KEM";
    }
    @Override
    public int compareTo(BangDiem o) {
        if(Float.compare(o.diemTrungBinh, this.diemTrungBinh) != 0)
            return Float.compare(o.diemTrungBinh, this.diemTrungBinh);
        return this.maSV.compareTo(o.maSV);
    }
    @Override
    public String toString() {
        return maSV + " " + ten + " " + String.format("%.2f", diemTrungBinh) + " " + xepLoai ;
    }
    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }
    
    
}
