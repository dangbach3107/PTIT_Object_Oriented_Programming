package J06004;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        SinhVien[] sv = new SinhVien[n];
        for(int i = 0 ; i < n ; i++){
            sv[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        }

        for(int i = 0 ; i < m ; i++){
            String tenNhom = sc.nextLine();
            for(int j = 0 ; j < n ; j++){
                if(sv[j].getSoNhom() == i+1){
                    sv[j].setTenNhom(tenNhom);
                }
            }
        }
        Arrays.sort(sv);

        for(int i = 0 ; i < n ; i++){
            System.out.println(sv[i]);
        }
    }
}
