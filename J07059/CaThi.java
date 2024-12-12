package J07059;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CaThi implements Comparable<CaThi> {
    private String maCaThi;
    private Date ngayThi;
    private String gioThi;
    private String phongThi;
    private static int dem = 0;
    public CaThi(String ngayThi, String gioThi, String phongThi) throws ParseException {
        this.maCaThi = "C" + String.format("%03d", ++dem);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayThi = sdf.parse(ngayThi);
        this.gioThi = gioThi;
        this.phongThi = phongThi;
    }
    @Override
    public String toString() {
        return maCaThi + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayThi) + " " + gioThi + " " + phongThi;
    }
    @Override
    public int compareTo(CaThi o) {
        int dateComparison = this.ngayThi.compareTo(o.ngayThi);
        if(dateComparison != 0){
            return dateComparison;
        }
        return this.gioThi.compareTo(o.gioThi);
    }

    
}
