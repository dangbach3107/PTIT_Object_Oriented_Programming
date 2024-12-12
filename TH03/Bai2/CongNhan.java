package Bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CongNhan {
    private String ma, ten;
    private String gioVao, gioRa;
    private long thoiGianLamViec;
    public CongNhan(String ma, String ten, String gioVao, String gioRa) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        this.thoiGianLamViec = tinhThoiGianLamViec();
    }

    private long tinhThoiGianLamViec() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date vao = sdf.parse(gioVao);
        Date ra = sdf.parse(gioRa);

        long diff = (ra.getTime() - vao.getTime())/ (60 * 1000);
        return diff - 60;
    }

    public String trangThaiLamViec(){
        return thoiGianLamViec >= 8 * 60 ? "DU" : "THIEU";
    }

    public String getGioLamViec(){
        long gio = thoiGianLamViec / 60;
        long phut = thoiGianLamViec % 60;
        return gio + " gio " + phut + " phut"; 
    }

    public long getThoiGianLamViec(){
        return thoiGianLamViec;
    }

    public String getMa(){
        return ma;
    }
    @Override
    public String toString() {
        return ma + " " + ten 
                + " " + getGioLamViec() + " " + trangThaiLamViec();
    }

    
    
}
