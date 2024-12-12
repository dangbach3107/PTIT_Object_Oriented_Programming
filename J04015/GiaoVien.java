package J04015;

public class GiaoVien {
    private String maGV, ten, chucVu ;
    private int heSoBacLuong, luongCoBan, phuCap, thuNhap;

    public GiaoVien(String maGV, String ten, int luongCoBan) 
    {
        this.maGV = maGV;
        this.ten = ten;
        this.chucVu = maGV.substring(0, 2);
        for(int i = 2; i < 4; i ++)
        {
            this.heSoBacLuong = this.heSoBacLuong * 10 + (maGV.charAt(i) - '0');
        }
        this.luongCoBan = luongCoBan;
        if(chucVu.equals("HT"))
        {
            this.phuCap = 2000000;
        } 
        else if(chucVu.equals("HP"))
        {
            this.phuCap = 900000;
        } 
        else 
        {
            this.phuCap = 500000;
        }
        this.thuNhap = this.luongCoBan * this.heSoBacLuong + this.phuCap;
    }

    @Override
    public String toString() 
    {
        return maGV + " " + ten + " " + heSoBacLuong + " " + phuCap + " " + thuNhap;
    }
}
