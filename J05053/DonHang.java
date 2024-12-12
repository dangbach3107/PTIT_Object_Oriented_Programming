package J05053;

public class DonHang implements Comparable<DonHang>{
    private String tenHang, loaiHang, maDonHang;
    private long soLuong, donGia;

    private String thuTu;
    private long giamGia, thanhTien;

    public DonHang(String tenHang, String maDonHang, long soLuong, long donGia) {
        String tokens[] = tenHang.split(" ");
        this.tenHang = tenHang;
        loaiHang = tokens[1];
        this.maDonHang = maDonHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thuTu = maDonHang.substring(1, 4);

        if(loaiHang.equals("1")) {
            giamGia = donGia * soLuong / 2;
        }
        else {
            giamGia = donGia * soLuong * 3 / 10;
        }
        thanhTien = donGia * soLuong - giamGia;
    }

    @Override
    public String toString() {
        return tenHang+ " " + maDonHang +  " " + String.format("%03d", Integer.parseInt(thuTu)) + " " + giamGia + " " + thanhTien;
    }

    @Override
    public int compareTo(DonHang o) {
        return this.thuTu.compareTo(o.thuTu);
    }
}
