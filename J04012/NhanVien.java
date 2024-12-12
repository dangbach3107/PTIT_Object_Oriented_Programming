package J04012;

public class NhanVien {
    private String maNV, ten, chucVu;
    private int luongCoBan, ngayCong;
   // public long luongThang, thuong, phuCap, thuNhap;

    public NhanVien(String maNV, String ten, int luongCoBan, int ngayCong, String chucVu) {
        this.maNV = maNV;
        this.ten = ten;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.ngayCong = ngayCong;
    }

    int luongThang(){
        return this.luongCoBan * this.ngayCong;
    }

    int thuong(){
        if(this.ngayCong >= 25) return this.luongThang() / 5;
        else if(this.ngayCong >= 22) return this.luongThang() / 10;
        else return 0;
    }

    int phuCap(){
        if(this.chucVu.equals("GD")) return 250000;
        else if(this.chucVu.equals("PGD")) return 200000;
        else if(this.chucVu.equals("TP")) return 180000;
        else return 150000;
    }

    int thuNhap(){
        return this.luongThang() + this.thuong() + this.phuCap();
    }

    @Override
    public String toString() {
        return maNV + " " + ten + " " + luongThang() + " " + thuong() + " " + phuCap() + " " + thuNhap();
    }

}
