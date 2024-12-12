package J04005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String hoTen = sc.nextLine();
        String ngaySinh = sc.nextLine();
        float diemMon1 = Float.parseFloat(sc.nextLine());
        float diemMon2 = Float.parseFloat(sc.nextLine());
        float diemMon3 = Float.parseFloat(sc.nextLine());
        ThiSinh ts = new ThiSinh(hoTen, ngaySinh, diemMon1, diemMon2, diemMon3);
        System.out.println(ts);
    }
}