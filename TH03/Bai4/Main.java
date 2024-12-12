package Bai4;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("MUAHANG.in"));
        int soSanPham = Integer.parseInt(br.readLine().trim());
        Map<String, SanPham> sanPhamMap = new HashMap<>();
        for(int i = 0; i < soSanPham ; i++){
            String maSP = br.readLine().trim();
            String tenSP = br.readLine().trim();
            int giaBan = Integer.parseInt(br.readLine().trim());
            int thoiHanBaoHanh = Integer.parseInt(br.readLine().trim());
            sanPhamMap.put(maSP, new SanPham(maSP, tenSP, giaBan, thoiHanBaoHanh));
        }

        int soKhachHang = Integer.parseInt(br.readLine().trim());
        ArrayList<KhachHang> danhSachKH = new ArrayList<>();

        for(int i = 0; i < soKhachHang; i++){
            String hoTen = br.readLine().trim();
            String diaChi = br.readLine().trim();
            String maSP = br.readLine().trim();
            int soLuong = Integer.parseInt(br.readLine().trim());
            String ngayMua = br.readLine().trim();

            SanPham sanPham = sanPhamMap.get(maSP);
            if(sanPham != null){
                danhSachKH.add(new KhachHang(ngayMua, hoTen, diaChi, maSP, soLuong, ngayMua, sanPham));
            }
        }

        danhSachKH.sort(Comparator.comparing(KhachHang::getNgayHetHanBaoHanh).thenComparing(KhachHang::getMaKH));
        for(KhachHang khachHang : danhSachKH){
            System.out.println(khachHang);
        }
    }
}
