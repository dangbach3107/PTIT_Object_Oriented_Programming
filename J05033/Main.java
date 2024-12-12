package J05033;
import java.util.*;;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Time [] a = new Time[n];

        for(int i = 0; i < n; i ++)
        {
            a[i] = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(a);

        for(int i = 0; i < n; i++)
        {
            System.out.println(a[i]);
        }
    }
}
