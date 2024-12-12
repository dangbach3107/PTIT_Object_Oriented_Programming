package J03024;
import java.util.*;
public class Main {
    public static int soUuThe(String s)
    {
        if(s.charAt(0) == '0') return 1;
        int le = 0, chan = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i) - '0') > 9 || s.charAt(i) - '0' < 0) return 1;
            else if((s.charAt(i) - '0') % 2 == 0) chan++;
            else le++;
        }
        if(chan > le && s.length() % 2 == 0) return 2;
        if(le > chan && s.length() % 2 == 1) return 2;
        return 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            if(soUuThe(s) == 1) System.out.println("INVALID");
            else if(soUuThe(s) == 2) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
// 3
// 01234aa32432432432534545b987978
// 1234567890123456789000
// 999999999999999999999999999999