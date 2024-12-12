package J05071;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Tinh[] tinh = new Tinh[n];
        for(int i = 0; i < n; i++){
            tinh[i] = new Tinh(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
        }

        int m = Integer.parseInt(sc.nextLine());
        CuocGoi[] cuocGoi = new CuocGoi[m];
        for(int i = 0; i < m; i++){
            String tmp = sc.nextLine();
            String[] s = tmp.split(" ");
            cuocGoi[i] = new CuocGoi(s[0], s[1], s[2]);
            if(s[0].charAt(0) == '0'){
                for(int j = 0; j < n; j++){
                    if(s[0].substring(1, 3).equals(tinh[j].getMaVung())){
                        cuocGoi[i].setTinh(tinh[j].getTen());
                        cuocGoi[i].setGiaCuoc(tinh[j].getGiaCuoc());
                        cuocGoi[i].setSoTien();
                        break;
                    }
                }
            }
        }
        for(CuocGoi i : cuocGoi){
            System.out.println(i);
        }
    }
}

// 2
// 53
// Da Nang
// 3000
// 64
// Vung Tau
// 1000
// 3
// 064-824531 11:20 11:22
// 8293567 09:07 09:15
// 053-823532 12:00 12:05
