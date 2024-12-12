package J07054;

public class BangDiem implements Comparable<BangDiem> {
    private String maSV;
    private String ten;
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
        diemTrungBinh = (diemMon1 * 3 + diemMon2 * 3 + diemMon3 * 2) / 8;
    }
    @Override
    public int compareTo(BangDiem o) {
        if(Float.compare(o.diemTrungBinh, this.diemTrungBinh) != 0)
            return Float.compare(o.diemTrungBinh, this.diemTrungBinh);
        return this.maSV.compareTo(o.maSV);
    }
    @Override
    public String toString() {
        return maSV + " " + ten + " " + String.format("%.2f", diemTrungBinh) ;
    }
    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }
    
    
}
