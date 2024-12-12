package J04010;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());

            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p3.distance(p1);

            if(a + b <= c || a + c <= b || b + c <= a)
            {
                System.out.println("INVALID");
                continue;
            }

            double S = Math.sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)) / 4;

            double R = a * b * c / (4 * S);
            
            System.out.println(String.format("%.3f", Math.PI * R * R));

        }
        }
}
