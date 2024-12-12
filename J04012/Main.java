package J04012;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        int luongCoBan = sc.nextInt();
        int ngayCong = sc.nextInt();
        sc.nextLine();
        String chucVu = sc.nextLine();
        NhanVien x = new NhanVien("NV01",ten, luongCoBan, ngayCong, chucVu);
        System.out.println(x);
    }

}