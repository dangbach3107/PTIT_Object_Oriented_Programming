package J05065;

public class NhanVien implements Comparable<NhanVien> {
    private String ma, ten, soHieuNhanVien, maChucVu;
    private String heSoLuong;
    private static int gd = 0, tp =0;
    static int pp = 0;

    public NhanVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        maChucVu = ma.substring(0, 2);
        if(ma.charAt(0) == 'G'){
            gd++;
            
        }
        else if(ma.charAt(0) == 'T'){
            tp++;
        }
        else if(ma.charAt(0) == 'P') pp++;

        this.soHieuNhanVien = ma.substring(4);
        this.heSoLuong = ma.substring(2, 4);
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
    

    @Override
    public int compareTo(NhanVien o) {
        if(this.heSoLuong.equals(o.heSoLuong)) return this.soHieuNhanVien.compareTo(o.soHieuNhanVien);
        else return o.heSoLuong.compareTo(heSoLuong);
    }

    public String getSoHieuNhanVien() {
        return soHieuNhanVien;
    }

    public String getHeSoLuong() {
        return heSoLuong;
    }

    public static int getGd() {
        return gd;
    }

    public static int getTp() {
        return tp;
    }

    public static int getPp() {
        return pp;
    }

    
    @Override
    public String toString() {
        return ten + " " + maChucVu + " " + soHieuNhanVien + " " + heSoLuong;
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSoHieuNhanVien(String soHieuNhanVien) {
        this.soHieuNhanVien = soHieuNhanVien;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    

    public static void setGd(int gd) {
        NhanVien.gd = gd;
    }

    public static void setTp(int tp) {
        NhanVien.tp = tp;
    }

    public static void setPp(int pp) {
        NhanVien.pp = pp;
    }
    
}
