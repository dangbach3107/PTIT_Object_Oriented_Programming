package J06003;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String soDienThoai;
    private int id;
    
    public SinhVien(String maSinhVien, String hoTen, String soDienThoai, int id) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.id = id;
    }

    @Override
    public String toString() {
        return maSinhVien + " " + hoTen + " " + soDienThoai ;
    }

    public int getId() {
        return id;
    }

}
