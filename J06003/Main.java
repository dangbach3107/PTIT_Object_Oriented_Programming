package J06003;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            String phone = sc.next();
            int groupId = sc.nextInt();
            a.add(new SinhVien(id, name, phone, groupId));
        }

        ArrayList<Nhom> b = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < m; ++i) b.add(new Nhom(sc.nextLine()));
        for (SinhVien x : a)
            for (Nhom y : b)
                if (x.getId() == y.getId()) y.getDanhSach().add(x);
        int q = sc.nextInt();
        while (q-- > 0) {
            int id = sc.nextInt();
            for (Nhom x : b)
                if (x.getId() == id) System.out.println(x);
        }
        sc.close();
    }

    
}
// 5 2
// B17DTCN001
// Nguyen Chi  Linh
// 0987345543
// 1
// B17DTCN011
// Vu Viet Thang
// 0981234567
// 1
// B17DTCN023
// Pham Trong Thang
// 0992123456
// 1
// B17DTCN022
// Nguyen Van  Quyet
// 0977865432
// 2
// B17DTCN031
// Ngo Thanh Vien
// 0912313111
// 2
// Xay dung website ban dien thoai truc tuyen
// Xay dung ung dung quan ly benh nhan Covid-19
// 1
// 1