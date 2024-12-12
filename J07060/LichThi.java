package J07060;

import java.text.SimpleDateFormat;

public class LichThi implements Comparable<LichThi> {
    private String maCaThi, maMH, maNhom, soSV;
    private CaThi caThi;
    private MonHoc monHoc;
    public LichThi(String maCaThi, String maMH, String maNhom, String soSV) {
        this.maCaThi = maCaThi;
        this.maMH = maMH;
        this.maNhom = maNhom;
        this.soSV = soSV;
        caThi = new CaThi("", "", "");
        monHoc = new MonHoc("", "", "");
    }
    public void setCaThi(CaThi caThi) {
        this.caThi = caThi;
    }
    public void setMonHoc(MonHoc monHoc) {
        this.monHoc = monHoc;
    }
    @Override
    public String toString() {
        return caThi.getNgayThi() + " " + caThi.getGioThi() + " " + caThi.getPhongThi() 
        + " " + monHoc.getTenMH() + " " + maNhom + " " + soSV;
    }
    public String getMaCaThi() {
        return maCaThi;
    }
    public String getMaMH() {
        return maMH;
    }
    public String getMaNhom() {
        return maNhom;
    }
    public String getSoSV() {
        return soSV;
    
    }
    @Override
    public int compareTo(LichThi o) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            if(sdf.parse(caThi.getNgayThi() + " " + caThi.getGioThi())
            .compareTo(sdf.parse(o.caThi.getNgayThi() + " " + o.caThi.getGioThi())) == 0) {
                return caThi.getMaCaThi().compareTo(o.caThi.getMaCaThi());
            }
            return sdf.parse(caThi.getNgayThi() + " " + caThi.getGioThi())
            .compareTo(sdf.parse(o.caThi.getNgayThi() + " " + o.caThi.getGioThi()));
        } catch (Exception e) {
            return 0;
        }
    }
    
}
