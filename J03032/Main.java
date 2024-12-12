package J03032;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0)
        {
            String s = in.nextLine();
            String tmp[] = s.split(" ");
            for(int i = 0; i < tmp.length; i++)
            {
                System.out.printf(new StringBuilder(tmp[i]).reverse().toString() + " ");
            }
            System.out.println();
        }
    }
}
// 2
// ABC DEF
// 123 456