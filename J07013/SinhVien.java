package J07013;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien implements Serializable {
    private String ma, ten, lop;
    private Date ngaysinh;
    private float gpa;
    public SinhVien(int id ,String ten, String lop, String ngaySinh, float gpa) throws ParseException {
        ma = "B20DCCN" + String.format("%03d", id);
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaysinh = sdf.parse(ngaySinh);
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%s %s %s %s %.2f", ma, ten, lop, sdf.format(ngaysinh), gpa);
    }

    

}
