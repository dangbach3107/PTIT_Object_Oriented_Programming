package J05070;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        CLB arr[] = new CLB[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new CLB(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
        }

        int m = Integer.parseInt(sc.nextLine());

        TranDau arr2[] = new TranDau[m];
        for (int i = 0; i < m; i++) {
            TranDau x = new TranDau(sc.nextLine());
            for (CLB tmp : arr) {
                if (tmp.getMa().equals(x.getMaCLB())) {
                    x.setDoanhThu(tmp.getGiaVe());
                    x.setTenCLB(tmp.getTen());
                    break;
                }
            }
            arr2[i] = x;
        }

        Arrays.sort(arr2);
        for (TranDau x : arr2) {
            System.out.println(x);
        }
    }
}
