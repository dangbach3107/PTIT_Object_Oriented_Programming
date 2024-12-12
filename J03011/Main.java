package J03011;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0)
        {
            long a = Long.parseLong(sc.nextLine());
            String b = sc.nextLine();

            long bModA = modBigNumber(b, a);
            
            // Tính GCD của a và b % a
            System.out.println(gcd(a, bModA));

        }
    }

    public static long modBigNumber(String b, long a) {
        long mod = 0;
        
        // Duyệt qua từng chữ số của b và tính phần dư
        for (int i = 0; i < b.length(); i++) {
            mod = (mod * 10 + (b.charAt(i) - '0')) % a;
        }
        
        return mod;
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
