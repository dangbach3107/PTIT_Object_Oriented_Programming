package J07084;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class SinhVien implements Comparable<SinhVien> {
    private String hoTen;
    private Date gioVao, gioRa;
    private Long gioOnline;

    public SinhVien(String hoTen, String gioVao, String gioRa) throws ParseException {
        this.hoTen = hoTen;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.gioVao = sdf.parse(gioVao);
        this.gioRa = sdf.parse(gioRa);
        gioOnline = (this.gioRa.getTime() - this.gioVao.getTime()) / (1000 * 60);
    }

    @Override
    public int compareTo(SinhVien o) {
        if(Long.compare(o.gioOnline, this.gioOnline) != 0)
            return Long.compare(o.gioOnline, this.gioOnline);
        else 
            return this.hoTen.compareTo(o.hoTen);
    }

    @Override
    public String toString() {
        return hoTen + " " + gioOnline ;
    }

    
}
