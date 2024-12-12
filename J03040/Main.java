package J03040;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());

        while (t-- > 0) {
            String s = in.nextLine();
            if(bienSoDep(s)) System.out.println("YES");
            else System.out.println("NO");
        }

    }

    public static boolean bienSoDep(String s)
    {
        String tmp[] = s.split("[-.]");
        String day1 = tmp[1], day2 = tmp[2];
        //System.out.println(day1 + " " + day2);
        if(day1.charAt(0) < day1.charAt(1) && day1.charAt(1) < day1.charAt(2) && 
            day1.charAt(2) < day2.charAt(0) && day2.charAt(0) < day2.charAt(1)) {
                return true;
        }
        if(day1.charAt(0) == day1.charAt(1) && day1.charAt(1) == day1.charAt(2) && 
            day2.charAt(0) == day2.charAt(1)) {
                return true;
        }
        if((day1.charAt(0) == '6' || day1.charAt(0) == '8') && 
            (day1.charAt(1) == '6' || day1.charAt(1) == '8') && 
            (day1.charAt(2) == '6' || day1.charAt(2) == '8') && 
            (day2.charAt(0) == '6' || day2.charAt(0) == '8') && 
            (day2.charAt(1) == '6' || day2.charAt(1) == '8')) {
                return true;
        }
        return false;
    }
}
// 7
// 29T1–123.45
// 29T1–555.55
// 29T1–222.33
// 29T1–686.88
// 29T1–123.33
// 29T1–555.54
// 29T1–606.88
