package J05016;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        KhachHang[] kh = new KhachHang[n];
        for(int i = 0; i < n; i++){
            String ten = sc.nextLine().trim();
            String soPhong = sc.nextLine().trim();
            String ngayNhanPhong = sc.nextLine();
            String ngayTraPhong = sc.nextLine();
            long tienDichVuPhatSinh = Long.parseLong(sc.nextLine());
            try {
                kh[i] = new KhachHang(ten, soPhong, ngayNhanPhong, ngayTraPhong, tienDichVuPhatSinh);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Arrays.sort(kh);
        for(KhachHang i : kh){
            System.out.println(i);
        }
    }
}

// 3
// Huynh Van Thanh   
// 103 
// 05/06/2010   
// 05/06/2010   
// 15
// Le Duc Cong  
// 106 
// 08/03/2010   
// 01/05/2010   
// 220
// Tran Thi Bich Tuyen   
// 207 
// 10/04/2010   
// 21/04/2010   
// 96