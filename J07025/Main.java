package J07025;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

// Lớp KhachHang để lưu thông tin khách hàng
class KhachHang implements Comparable<KhachHang> {
    private String maKH;
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private Date ngaySinhDate;

    private static int idCounter = 1;

    // Constructor
    public KhachHang(String ten, String gioiTinh, String ngaySinh, String diaChi) throws ParseException {
        this.maKH = String.format("KH%03d", idCounter++);
        this.ten = chuanHoaTen(ten);
        this.gioiTinh = gioiTinh;
        this.ngaySinh = chuanHoaNgaySinh(ngaySinh);
        this.diaChi = diaChi;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaySinhDate = sdf.parse(this.ngaySinh);
    }

    // Hàm chuẩn hóa tên
    private String chuanHoaTen(String ten) {
        String[] parts = ten.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            sb.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    // Hàm chuẩn hóa ngày sinh
    private String chuanHoaNgaySinh(String ngaySinh) {
        String[] parts = ngaySinh.split("/");
        if (parts[0].length() == 1) parts[0] = "0" + parts[0];
        if (parts[1].length() == 1) parts[1] = "0" + parts[1];
        return String.join("/", parts);
    }

    // Getter cho ngày sinh để sắp xếp
    public Date getNgaySinhDate() {
        return ngaySinhDate;
    }

    // Override compareTo để sắp xếp theo ngày sinh
    @Override
    public int compareTo(KhachHang other) {
        return this.ngaySinhDate.compareTo(other.ngaySinhDate);
    }

    // Override toString để in thông tin khách hàng
    @Override
    public String toString() {
        return maKH + " " + ten + " " + gioiTinh + " " + diaChi + " " + ngaySinh;
    }
}

// Lớp Main để xử lý bài toán
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<KhachHang> danhSach = new ArrayList<>();

        // Đọc thông tin khách hàng từ file
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            danhSach.add(new KhachHang(ten, gioiTinh, ngaySinh, diaChi));
        }

        // Sắp xếp danh sách theo ngày sinh
        Collections.sort(danhSach);

        // In kết quả
        for (KhachHang kh : danhSach) {
            System.out.println(kh);
        }
    }
}
