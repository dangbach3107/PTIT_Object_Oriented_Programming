package J05009;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ThiSinh[] ts = new ThiSinh[t];
        for(int i = 0; i < t; i++) {
            String ten = sc.nextLine();
            String ngaySinh = sc.nextLine();
            float diem1 = Float.parseFloat(sc.nextLine());
            float diem2 = Float.parseFloat(sc.nextLine());
            float diem3 = Float.parseFloat(sc.nextLine());
            ts[i] = new ThiSinh(ten, ngaySinh, diem1, diem2, diem3);
        }
        Arrays.sort(ts);
        float max = ts[0].getTong();
        for(int i = 0; i < t; i++) {
            if(ts[i].getTong() == max) {
                System.out.println(ts[i]);
            }
        }
    }
}

// 3
// Nguyen Van A
// 12/12/1994
// 3.5
// 7.0
// 5.5
// Nguyen Van B
// 1/9/1994
// 7.5
// 9.5
// 9.5
// Nguyen Van C
// 6/7/1994
// 8.5
// 9.5
// 8.5
