import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int k = 0;
        for(int  i = 1; i <= t; i++){
            System.out.printf("List(%d) = ", i);
            for(int j = 1;  j <= t; j++){
                k = sc.nextInt();
                if(k == 1) System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}