package J07053;

import java.text.ParseException;

public class ThiSinh {
    private String maThiSinh;
    private String ten;
    private String ngaySinh, xepLoai;
    private float diemLyThuyet, diemThucHanh;
    private int tuoi, diemTrungBinh;
    private static int dem = 0;
    public ThiSinh(String ten, String ngaySinh, float diemLyThuyet, float diemThucHanh) throws ParseException{
        maThiSinh = "PH" + String.format("%02d", ++dem);
        this.ten = "";
        String tmp[] = ten.trim().toLowerCase().split("\\s+");
        for(String token : tmp){
            this.ten += token.toUpperCase().substring(0,1) + token.substring(1) +  " ";
        }
        this.ten = this.ten.trim();
        tuoi = 2021 - Integer.parseInt(ngaySinh.substring(ngaySinh.length() - 4));
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
        if(diemLyThuyet >= 8 && diemThucHanh >= 8) diemTrungBinh = (int)Math.round((diemLyThuyet + diemThucHanh) / 2 + 1f);
        else if(diemLyThuyet >= 7.5 && diemThucHanh >= 7.5) diemTrungBinh = (int)Math.round((diemLyThuyet + diemThucHanh) / 2 + 0.5f);
        else diemTrungBinh = (int)Math.round((diemLyThuyet + diemThucHanh) / 2 );

        if(diemTrungBinh > 10) diemTrungBinh = 10;

        if(diemTrungBinh < 5) xepLoai = "Truot";
        else if(diemTrungBinh < 7) xepLoai = "Trung binh";
        else if(diemTrungBinh < 8) xepLoai = "Kha";
        else if(diemTrungBinh < 9) xepLoai= "Gioi";
        else xepLoai = "Xuat sac";
    }
    @Override
    public String toString() {
        return maThiSinh + " " + ten + " " + tuoi + " "
                + diemTrungBinh + " " + xepLoai;
    }

    
}
