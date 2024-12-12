package J05073;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n   = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String tmp = sc.nextLine();
            String tokens[] = tmp.split(" ");
            DonHang x = new DonHang(tokens[0], Float.parseFloat(tokens[1]), Float.parseFloat(tokens[2]));
            System.out.println(x);
        }
    }
}
// 2
// TTVC 400 300
// CCAK 200 200