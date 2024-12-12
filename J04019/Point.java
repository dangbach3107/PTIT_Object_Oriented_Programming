package J04019;
import java.util.*;

public class Point {
    private double x,y;
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextDouble(),sc.nextDouble());
    }
    public static double dis(Point a, Point b){
        return Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2));
    }
}
