package J04001;
/*
 * @author dangbach
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        while(t-- > 0){
            Point A = new Point(in.nextDouble(), in.nextDouble());
            Point B = new Point(in.nextDouble(), in.nextDouble());
            Double dis = A.distance(B);
            System.out.println( String.format("%.4f", A.distance(B)));
        }
    }
}