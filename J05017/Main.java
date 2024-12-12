package J05017;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        KhachHang[] kh = new KhachHang[n];
        for(int i = 0; i < n; i++){
            kh[i] = new KhachHang(sc.nextLine(), 
                        Long.parseLong(sc.nextLine()), 
                        Long.parseLong(sc.nextLine()));
        }
        Arrays.sort(kh);
        for(KhachHang i : kh){
            System.out.println(i);
        }
    }
}

// 3
// Le Thi Thanh
// 468
// 500
// Le Duc Cong
// 160
// 230
// Ha Hue Anh
// 410
// 612
