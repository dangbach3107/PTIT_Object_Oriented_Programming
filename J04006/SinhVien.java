package J04006;

/**
 *
 * @author dangbach
 */
import java.util.*;
import java.text.*;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float gpa;
    
    private String chuanHoaNgaySinh(String ngaySinh) {
        SimpleDateFormat inputFormat = new SimpleDateFormat("d/M/yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = inputFormat.parse(ngaySinh);
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return ngaySinh; 
        }
    }

    public SinhVien(String hoTen, String lop, String ngaySinh, float gpa) {
        this.maSV = "B20DCCN001";
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = chuanHoaNgaySinh(ngaySinh);
        this.gpa = gpa;
    }
    
    public String toString() {
        return maSV + " " + hoTen + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }
}
