package J05013;

public class ThiSinh implements Comparable<ThiSinh> {
    private static int id = 0;
    private String hoTen, maTS, trangThai;
    private float diemLT, diemTH, diemTB;
    public ThiSinh(String hoTen, float diemLT, float diemTH) {
        maTS = "TS" + String.format("%02d", ++id);
        this.hoTen = hoTen;
        this.diemLT = diemLT > 10 ? diemLT / 10 : diemLT;
        this.diemTH = diemTH > 10 ? diemTH / 10 : diemTH;
        diemTB = (this.diemLT + this.diemTH) / 2;
        if(diemTB < 5f) trangThai = "TRUOT";
        else if(diemTB < 8f) trangThai = "CAN NHAC";
        else if(diemTB < 9.5f) trangThai = "DAT";
        else trangThai = "XUAT SAC";
    }
    @Override
    public int compareTo(ThiSinh o) {
        return Float.compare(o.diemTB, this.diemTB);
    }
    @Override
    public String toString() {
        return maTS + " " + hoTen + " " + String.format("%.2f", diemTB) + " " + 
                trangThai;
    }
    
    
}
