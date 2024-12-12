package J05048;

public class Hang {
    private float donGia, tien, thue;
    private int soLuong, xuat;
    private String ma;
    public Hang(String ma, int soLuong) {
        this.soLuong = soLuong;
        this.ma = ma;
        if(ma.charAt(0) == 'A'){
            xuat = (int)Math.round(0.6f * soLuong) ;
        }
        else if(ma.charAt(0) == 'B'){
            xuat =  (int)Math.round(0.7f * soLuong) ;
        }

        if(ma.charAt(4) == 'Y')
            donGia = 110000;
        else if(ma.charAt(4) == 'N')
            donGia = 135000;

        tien = (int)Math.round(donGia * xuat / 10);


        if(ma.charAt(0) == 'A'){
            if(ma.charAt(4) == 'Y')
                thue = 0.08f * tien * 10;
            else if(ma.charAt(4) == 'Y')
                thue = 0.11f * tien * 10;
        }
        else if(ma.charAt(0) == 'B'){
            if(ma.charAt(4) == 'Y')
                thue = 0.17f * tien * 10;
            else if(ma.charAt(4) == 'N')
                thue = 0.22f * tien * 10;
        }
        thue = Math.round(thue / 10);
    }
    @Override
    public String toString() {
        return String.format("%s %d %d %d %d %d ", ma, 
            (int)Math.round(soLuong), Math.round(xuat), 
            (int)Math.round(donGia), (int)Math.round(tien) * 10, (int)Math.round(thue) * 10);
    }

    
    
}
