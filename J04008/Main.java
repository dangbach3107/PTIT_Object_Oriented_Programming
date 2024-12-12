package J04008;
/*
 @author dangbach
 07/09/2024
 17:07
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            Point A = new Point(sc.nextDouble(), sc.nextDouble());
            Point B = new Point(sc.nextDouble(), sc.nextDouble());
            Point C = new Point(sc.nextDouble(), sc.nextDouble());
            
            double a = A.distance(B);
            double b = B.distance(C);
            double c = C.distance(A);

            if(a + b <= c || a + c <= b || b + c <= a){
                System.out.println("INVALID");
            } else {
                double p = a + b + c;
                System.out.printf("%.3f\n", p);
            }
        }
    }
}
