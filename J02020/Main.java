package J02020;
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[k + 1];
        for(int i = 1; i <= k; i++)
        {
            a[i] = i;
        }

        int dem = 1;
        for(int i = 1; i <= k; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        while(true)
        {
            int j = k;
            while(a[j] == n - k + j && j > 0) 
                j--;
            if(j == 0) 
                break;
            a[j]++;
            for(int x = j + 1; x <= k;x++)
            {
                a[x] = a[x - 1] + 1;
            }
            dem++;
            for(int i = 1; i <= k; i++)
            {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        System.out.println("Tong cong co " + dem + " to hop");
    }
}
