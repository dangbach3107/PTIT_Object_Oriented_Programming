package J05014;

public class GiaoVien implements Comparable<GiaoVien>{
    private static int id = 0;
    private String ten, maXT, maGV, trangThai, monHoc;
    private float diemTinHoc, diemChuyenMon, tongDiem;
    public GiaoVien(String ten, String maXT, float diemTinHoc, float diemChuyenMon) {
        this.ten = ten;
        this.maXT = maXT;
        this.diemTinHoc = diemTinHoc;
        this.diemChuyenMon = diemChuyenMon;
        maGV = "GV" + String.format("%02d", ++id);
        
        float uuTien = 0;
        int x = Integer.parseInt(maXT.substring(1));
        if(x == 1) uuTien = 2f;
        else if(x == 2) uuTien = 1.5f;
        else if(x == 3) uuTien = 1f;
        tongDiem = diemTinHoc * 2 + diemChuyenMon + uuTien;

        if(maXT.charAt(0) == 'A') monHoc = "TOAN";
        else if(maXT.charAt(0) == 'B') monHoc = "LY";
        else monHoc = "HOA";

        if(tongDiem >= 18) trangThai = "TRUNG TUYEN";
        else trangThai = "LOAI";
    }
    @Override
    public String toString() {
        return maGV + " " + ten + " " + monHoc+ " " + String.format("%.1f", tongDiem) + " " + trangThai;
    }
    @Override
    public int compareTo(GiaoVien o) {
        int cmp = Float.compare(o.tongDiem, tongDiem);
        if(cmp != 0) return cmp;
        else return maGV.compareTo(o.maGV);
    }
    

    
}
