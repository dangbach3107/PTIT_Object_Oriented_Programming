package J03025;
import java.util.*;;
public class Main {
    public static int dem(String s)
    {
        int dem = 0;
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r))
            {
                dem++;
            }
            l++; r--;
        }
        return dem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String s = sc.nextLine();
            if(dem(s) <= 1 && s.length() % 2 == 1) System.out.println("YES");
            else if(dem(s) == 1 && s.length() % 2 == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

// 3
// abccaa
// abbcca
// abcda