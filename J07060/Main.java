package J07060;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException  {
        Scanner sc1 = new Scanner(new File("MONTHI.in"));
        Scanner sc2 = new Scanner(new File("CATHI.in"));
        Scanner sc3 = new Scanner(new File("LICHTHI.in"));

        ArrayList<MonHoc> dsMonHoc = new ArrayList<>();
        ArrayList<CaThi> dsCaThi = new ArrayList<>();

        int n = Integer.parseInt(sc1.nextLine());
        for (int i = 0; i < n; i++) {
            dsMonHoc.add(new MonHoc(sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }

        int m = Integer.parseInt(sc2.nextLine());
        for (int i = 0; i < m; i++) {
            dsCaThi.add(new CaThi(sc2.nextLine(), sc2.nextLine(), sc2.nextLine()));
        }

        int p = Integer.parseInt(sc3.nextLine());
        ArrayList<LichThi> dsLichThi = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            String tmp = sc3.nextLine();
            String tokens[] = tmp.split("\\s+");
            LichThi lichThi = new LichThi(tokens[0], tokens[1], tokens[2], tokens[3]);
            for(MonHoc monHoc : dsMonHoc) {
                if(monHoc.getMaMH().equals(tokens[1])) {
                    lichThi.setMonHoc(monHoc);
                    break;
                }
            }
            for(CaThi caThi : dsCaThi) {
                if(caThi.getMaCaThi().equals(tokens[0])) {
                    lichThi.setCaThi(caThi);
                    break;
                }
            }
            dsLichThi.add(lichThi );
        }
        Collections.sort(dsLichThi);
        for(LichThi lichThi : dsLichThi) {
            System.out.println(lichThi);
        }
    }
}
