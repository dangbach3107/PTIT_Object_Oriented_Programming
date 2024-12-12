package J05019;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tram {
    private static int id = 1;
    private String ten, ma;
    private Date batDau, ketThuc;
    private float luongMua, thoiGianMua, luongMuaTrungBinh;

    public Tram(String ten, String batDau, String ketThuc, float luongMua) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        this.ten = ten;
        this.batDau = sdf.parse(batDau);
        this.ketThuc = sdf.parse(ketThuc);
        thoiGianMua = 1.0f * (this.ketThuc.getTime() - this.batDau.getTime()) / 1000 / 60 / 60;
        this.luongMua = 1.0f * luongMua;
        luongMuaTrungBinh = 1.0f * luongMua / thoiGianMua;
        ma = "T" + String.format("%02d", id++);
    }

    public void update(String batDau, String ketThuc, float luongMua) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        this.batDau = sdf.parse(batDau);
        this.ketThuc = sdf.parse(ketThuc);
        thoiGianMua += 1.0f * (this.ketThuc.getTime() - this.batDau.getTime()) / 1000 / 60 / 60;
        this.luongMua += 1.0f * luongMua;
        luongMuaTrungBinh = 1.0f * this.luongMua / thoiGianMua;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " "
                + String.format("%.2f", luongMuaTrungBinh);
    }


}
