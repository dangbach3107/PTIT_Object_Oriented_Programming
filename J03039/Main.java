package J03039;
import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            BigInteger A = new BigInteger(in.next());
            BigInteger B = new BigInteger(in.next());
            BigInteger C = new BigInteger("0");
            System.out.println((A.mod(B).equals(C) || B.mod(A).equals(C)) ? "YES" : "NO");
        }
    }
}
