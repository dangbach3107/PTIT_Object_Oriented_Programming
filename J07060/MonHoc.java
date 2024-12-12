package J07060;

public class MonHoc {
    private String maMH, tenMH, hinhThucThi;

    public MonHoc(String maMH, String tenMH, String hinhThucThi) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.hinhThucThi = hinhThucThi;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getHinhThucThi() {
        return hinhThucThi;
    }

    @Override
    public String toString() {
        return "MonHoc [maMH=" + maMH + ", tenMH=" + tenMH + ", hinhThucThi=" + hinhThucThi + "]";
    }
    
    
}
