package J07060;

public class CaThi {
    private static int id = 0;
    private String maCaThi, ngayThi, gioThi, phongThi;

    public CaThi(String ngayThi, String gioThi, String phongThi) {
        this.maCaThi = "C" + String.format("%03d", ++id);
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
    }

    public static int getId() {
        return id;
    }

    public String getMaCaThi() {
        return maCaThi;
    }

    public String getNgayThi() {
        return ngayThi;
    }

    public String getGioThi() {
        return gioThi;
    }

    public String getPhongThi() {
        return phongThi;
    }

    @Override
    public String toString() {
        return "CaThi [maCaThi=" + maCaThi + ", ngayThi=" + ngayThi + ", gioThi=" + gioThi + ", phongThi=" + phongThi
                + "]";
    }
    
    
}
