package J04006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String hoTen = sc.nextLine();
        String lop = sc.nextLine();
        String ngaySinh = sc.nextLine();
        float gpa = sc.nextFloat();
        
        SinhVien sv = new SinhVien(hoTen, lop, ngaySinh, gpa);
        System.out.println(sv);
        
        sc.close();
    }
}
