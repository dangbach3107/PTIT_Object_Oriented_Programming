package J05053;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());    
        DonHang[] a = new DonHang[n];
        for(int i = 0; i < n; i++) {
            a[i] = new DonHang(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
        }
        Arrays.sort(a);
        for(DonHang x : a) {
            System.out.println(x);
        }
    }
}
