package J04004;
/*
 * @author dangbach
 * 07/09/2024
 * 15:00
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
        System.out.println(a.add(b));
        sc.close();
    }
}
