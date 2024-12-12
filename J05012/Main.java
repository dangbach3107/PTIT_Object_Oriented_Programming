package J05012;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HoaDon[] hoaDons = new HoaDon[n];
        for (int i = 0; i < n; i++) {
            String maMH = sc.nextLine();
            String tenMH = sc.nextLine();
            long soLuong = Long.parseLong(sc.nextLine());
            long donGia = Long.parseLong(sc.nextLine());
            long chietKhau = Long.parseLong(sc.nextLine());
            hoaDons[i] = new HoaDon(maMH, tenMH, soLuong, donGia, chietKhau);
        }
        Arrays.sort(hoaDons);
        for (HoaDon hoaDon : hoaDons) {
            System.out.println(hoaDon);
        }
    }
}
// 3
// ML01
// May lanh SANYO
// 12
// 4000000
// 2400000
// ML02
// May lanh HITACHI
// 4
// 2550000000
// 0
// ML03
// May lanh NATIONAL
// 5
// 3000000
// 150000