package J05071;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CuocGoi {
    @Override
    public String toString() {
        return thueBaoGoiDen + " " + tinh + " " + soPhut + " " + soTien; 
    }
    private String thueBaoGoiDen, tinh;
    private Date batDau, ketThuc;
    private long soPhut, giaCuoc, soTien;
    public CuocGoi(String thueBaoGoiDen, String batDau, String ketThuc) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        this.thueBaoGoiDen = thueBaoGoiDen;
        this.batDau = sdf.parse(batDau);
        this.ketThuc = sdf.parse(ketThuc);
        if(thueBaoGoiDen.charAt(0) != '0'){
            soPhut = (this.ketThuc.getTime() - this.batDau.getTime()) / 60000;
            soPhut = (long) (Math.ceil(1.0f * soPhut / 3) );
            soTien = soPhut * 800; 
            tinh = "Noi mang";
        }
        else{
            soPhut = (this.ketThuc.getTime() - this.batDau.getTime()) / 60000;

        }
        
    }
    public void setThueBaoGoiDen(String thueBaoGoiDen) {
        this.thueBaoGoiDen = thueBaoGoiDen;
    }
    public void setTinh(String tinh) {
        this.tinh = tinh;
    }
    public void setSoPhut(long soPhut) {
        this.soPhut = soPhut;
    }
    public void setGiaCuoc(long giaCuoc) {
        this.giaCuoc = giaCuoc;
    }
    public void setSoTien() {
        this.soTien = giaCuoc * soPhut;
    }
    
    
}
