package J05062;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        String tokens[] = tmp.split(" ");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);
        SinhVien[] sv = new SinhVien[n];
        for (int i = 0; i < n; ++i) {
            String ten = sc.nextLine();
            String tmp1 = sc.nextLine();
            String tokens1[] = tmp1.split(" ");
            float tbc = Float.parseFloat(tokens1[0]);
            float drl = Float.parseFloat(tokens1[1]);
            sv[i] = new SinhVien(ten, tbc, drl);
        }
        SinhVien[] sv2 = Arrays.copyOf(sv, n);
        Arrays.sort(sv);
        float minTBC = sv[m - 1].getTbc();
        for(SinhVien i : sv2) {
            if(i.getTbc() >= minTBC) System.out.println(i);
            else System.out.println(i.getTen() + ": KHONG");
        }

    }
}
// 3 2
// Nguyen Van Nam
// 3.59 75
// Tran Hong Ngoc
// 3.61 90
// Do Van An
// 3.22 90