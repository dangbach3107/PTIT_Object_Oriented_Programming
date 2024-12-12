package J02103;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int index = 1; index <= t; index++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();

            long [][] a = new long[n + 5][m + 5] , b = new long[m + 5][n + 5], c = new long[n + 5][n + 5];

            System.out.println("Test " + index + ":");

            for(int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= m; j++)
                {
                    a[i][j] = sc.nextLong();
                }
            }

            for(int i = 1; i <= m; i++)
            {
                for(int j = 1; j <= n; j++)
                {
                    b[i][j] = a[j][i];
                }
            }

            for(int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= n; j++)
                {
                    c[i][j] = 0;
                    for(int k = 1; k <= m; k++)
                    {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            for(int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= n; j++)
                {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}
