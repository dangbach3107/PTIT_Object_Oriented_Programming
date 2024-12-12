package J04007;

/**
 *
 * @author dangbach
 */
import java.util.*;

public class NhanVien {
    private String maNV, ten, gioiTinh, ngaySinh, diaChi, maSoThue, kiHopDong;
    
    public NhanVien (String maNV,String ten,String gioiTinh,String ngaySinh,String diaChi,String maSoThue,String kiHopDong){
        this.maNV = maNV;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.kiHopDong = kiHopDong;
    }
    
    public String toString(){
        return maNV + " " +  ten + " " + gioiTinh + " " +  ngaySinh + " " +  diaChi + " " +  maSoThue + " " + kiHopDong;
    }
}
