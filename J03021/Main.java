package J03021;
import java.util.*;
public class Main {
    public static char charToNumber(char c)
    {
        c = Character.toUpperCase(c);
        if ("ABC".indexOf(c) != -1) return '2';
        if ("DEF".indexOf(c) != -1) return '3';
        if ("GHI".indexOf(c) != -1) return '4';
        if ("JKL".indexOf(c) != -1) return '5';
        if ("MNO".indexOf(c) != -1) return '6';
        if ("PQRS".indexOf(c) != -1) return '7';
        if ("TUV".indexOf(c) != -1) return '8';
        if ("WXYZ".indexOf(c) != -1) return '9';
        return '0';
    }

    public static boolean isPalindrome(String s)
    {
        int left = 0 , right = s.length() - 1;
        while(left < right)
        {
            if(charToNumber(s.charAt(right)) != charToNumber(s.charAt(left)))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            if(isPalindrome(s) == true) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
