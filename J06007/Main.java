package J06007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            sc.nextLine();
        }

        int n = Integer.parseInt(sc.nextLine());
        GiangVien[] giangViens = new GiangVien[n];

        for(int  i = 0; i < n; i++) {
            String tmp = sc.nextLine();
            String tokens[] = tmp.split(" ");
            String ten = "";
            for(int j = 1; j < tokens.length; j++) {
                ten += tokens[j] + " ";
            }
            ten = ten.trim();
            giangViens[i] = new GiangVien(tokens[0], ten);
        }

        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++) {
            String tmp = sc.nextLine();
            String tokens[] = tmp.split(" ");
            String maGV = tokens[0];
            float thoiGian = Float.parseFloat(tokens[2]);
            for(GiangVien giangVien : giangViens) {
                if(giangVien.getMaGV().equals(maGV)) {
                    giangVien.setThoiGian(thoiGian);
                    break;
                }
            }
        }

        for(int  i = 0; i < n; i++) {
            System.out.println(giangViens[i]);
        }
    }
}
