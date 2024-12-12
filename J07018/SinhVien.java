package J07018;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float gpa;
    private static int dem = 0;

    public SinhVien(String hoTen, String lop, String ngaySinh, float gpa) {
        maSinhVien = "B20DCCN" + String.format("%03d", ++dem);
        this.hoTen = "";
        String tmp[] = hoTen.trim().split("\\s+");
        for(String token : tmp){
            this.hoTen += token.toUpperCase().substring(0,1) + token.toLowerCase().substring(1) + " ";
        }
        this.lop = lop;
        String tokens[] = ngaySinh.split("/");
        this.ngaySinh = String.format("%02d/%02d/%s", Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[2]);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return maSinhVien + " " + hoTen + lop + " " + ngaySinh
                + String.format(" %.2f", gpa);
    }

    
}
