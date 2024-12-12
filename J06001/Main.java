package J06001;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SanPham> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            int type1Price = sc.nextInt();
            int type2Price = sc.nextInt();
            a.add(new SanPham(id, name, type1Price, type2Price));
        }
        int m = sc.nextInt();
        ArrayList<HoaDon> b = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            HoaDon c = new HoaDon(sc.next(), sc.nextInt());
            for (SanPham x : a)
                if (x.getId().equals(c.getId().substring(0, 2))) {
                    c.setSanPham(x, c.getId().charAt(2));
                    break;
                }
            b.add(c);
        }
        for (HoaDon x : b) System.out.println(x);
        sc.close();
    }
}