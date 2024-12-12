package J06006;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        KhachHang[] kh = new KhachHang[n];
        for (int i = 0; i < n; i++) {
            kh[i] = new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }

        int m = Integer.parseInt(sc.nextLine());
        MatHang[] mh = new MatHang[m];
        for (int i = 0; i < m; i++) {
            mh[i] = new MatHang(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
        }

        int k = Integer.parseInt(sc.nextLine());
        HoaDon[] hd = new HoaDon[k];
        for (int i = 0; i < k; i++) {
            String tmp = sc.nextLine();
            String[] tokens = tmp.split(" ");
            String maKH = tokens[0];
            String maMH = tokens[1];
            long soLuong = Long.parseLong(tokens[2]);
            for (int j = 0; j < n; j++) {
                if (kh[j].getMaKH().equals(maKH)) {
                    for (int l = 0; l < m; l++) {
                        if (mh[l].getMaHang().equals(maMH)) {
                            hd[i] = new HoaDon(kh[j], mh[l], soLuong);
                            break;
                        }
                    }
                    break;
                }
            }
        }
        Arrays.sort(hd);
        for(int i = 0; i < k; i++) {
            System.out.println(hd[i]);
        }
    }
}
// 2
// Nguyen Van Nam
// Nam
// 12/12/1997
// Mo Lao-Ha Dong-Ha Noi
// Tran Van Binh
// Nam
// 11/14/1995
// Phung Khoang-Nam Tu Liem-Ha Noi
// 2
// Ao phong tre em
// Cai
// 25000
// 41000
// Ao khoac nam
// Cai
// 240000
// 515000
// 3
// KH001 MH001 2
// KH001 MH002 3
// KH002 MH002 4
