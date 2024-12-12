package J07074;

import java.util.ArrayList;
import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("LICHGD.in"));
        ArrayList<MonHoc> monHocs = new ArrayList<>();
        ArrayList<Lop> lops = new ArrayList<>();
        int n = Integer.parseInt(sc1.nextLine());
        while (n-- > 0) {
            monHocs.add(new MonHoc(sc1.nextLine(), 
            sc1.nextLine(), sc1.nextLine()));
        }
        n = Integer.parseInt(sc2.nextLine());
        while (n-- > 0) {
            lops.add(new Lop(sc2.nextLine(), sc2.nextLine(), 
            sc2.nextLine(), sc2.nextLine(), sc2.nextLine()));
        }
        for (Lop lop : lops) {
            for (MonHoc monHoc : monHocs) {
                if (lop.getMaMon().equals(monHoc.getMa())) {
                    lop.setTenMon(monHoc.getTen());
                    break;
                }
            }
        }
        Collections.sort(lops);
        String tmp = sc2.nextLine();
        String tmp1 = "";
        for (MonHoc monHoc : monHocs) {
            if (monHoc.getMa().equals(tmp)) {
                tmp1 = monHoc.getTen();
                break;
            }
        }
        System.out.printf("LICH GIANG DAY MON %s:\n", tmp1);
        for (Lop lop : lops) {
            if (lop.getMaMon().equals(tmp)) {
                System.out.println(lop);
            }
        }
    }
}
