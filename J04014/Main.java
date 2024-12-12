package J04014;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo c = a.tong(b);
             c = c.binhPhuong();

            PhanSo d = a.tich(b);
            d = d.tich(c);

            System.out.println(c + " " + d);
        }
    }
}
