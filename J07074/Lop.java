package J07074;

public class Lop implements Comparable<Lop>{
    private String maNhom, maMon, ngayGiangDay, kipHoc, tenGV,phong, tenMon;
    private static  int stt = 1;
    public Lop(String maMon, String ngayGiangDay, String kipHoc, String tenGV, String phong) {
        this.maMon = maMon;
        this.ngayGiangDay = ngayGiangDay;
        this.kipHoc = kipHoc;
        this.tenGV = tenGV;
        this.phong = phong;
        maNhom = "HP" + String.format("%03d", stt++);
    }
    @Override
    public int compareTo(Lop o) {
        if(!ngayGiangDay.equals(o.ngayGiangDay))
            return ngayGiangDay.compareTo(o.ngayGiangDay);
        else if(!kipHoc.equals(o.kipHoc))
            return kipHoc.compareTo(o.kipHoc);
        else
            return tenGV.compareTo(o.tenGV);
    }
    @Override
    public String toString() {
        return maNhom + " " + ngayGiangDay + " " + kipHoc + " " + tenGV + " " + phong;
    }
    public String getMaNhom() {
        return maNhom;
    }
    public void setMaNhom(String maNhom) {
        this.maNhom = maNhom;
    }
    public String getMaMon() {
        return maMon;
    }
    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }
    public String getNgayGiangDay() {
        return ngayGiangDay;
    }
    public void setNgayGiangDay(String ngayGiangDay) {
        this.ngayGiangDay = ngayGiangDay;
    }
    public String getKipHoc() {
        return kipHoc;
    }
    public void setKipHoc(String kipHoc) {
        this.kipHoc = kipHoc;
    }
    public String getTenGV() {
        return tenGV;
    }
    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }
    public String getPhong() {
        return phong;
    }
    public void setPhong(String phong) {
        this.phong = phong;
    }
    public String getTenMon() {
        return tenMon;
    }
    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }
    public static int getStt() {
        return stt;
    }
    public static void setStt(int stt) {
        Lop.stt = stt;
    }
    
    
    
}
