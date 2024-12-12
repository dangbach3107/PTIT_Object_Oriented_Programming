package J07073;

public class MonHoc implements Comparable<MonHoc> {
    private String maMH, tenMonHoc, soTinChi, hinhThucGiangDayLyThuyet,  hinhThucGiangDayThucHanh;

    public MonHoc(String maMH, String tenMonHoc, String soTinChi, String hinhThucGiangDayLyThuyet,
            String hinhThucGiangDayThucHanh) {
        this.maMH = maMH;
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
        this.hinhThucGiangDayLyThuyet = hinhThucGiangDayLyThuyet;
        this.hinhThucGiangDayThucHanh = hinhThucGiangDayThucHanh;
    }

    @Override
    public String toString() {
        return maMH + " " + tenMonHoc + " " + soTinChi
                + " " + hinhThucGiangDayLyThuyet + " "
                + hinhThucGiangDayThucHanh ;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.maMH.compareTo(o.maMH);
    }
    public String getHinhThucGiangDayThucHanh() {
        return hinhThucGiangDayThucHanh;
    }

    
    
}
