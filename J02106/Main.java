package J02106;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] a = new int [n + 5][5];
        int dem = 0;

        for(int i = 1; i <= n; i++){
            int now = 0;
            for(int j = 1; j <= 3; j++){
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1){
                    now++;
                }
            }
            if(now  > 1) dem++;
        }

        System.out.println(dem);
    }
}
