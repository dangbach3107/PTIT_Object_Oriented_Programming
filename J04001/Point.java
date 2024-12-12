package J04001;
/*
 * @author dangbach
 */

public class Point {
    private double x, y, dis;
    
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public double getX(double x){
        this.x = x;
        return x;
    }
    
    public double getY(double y){
        this.y = y;
        return y;
    }
    
    public double distance(Point A){
        return Math.sqrt((this.x - A.x) * (this.x - A.x) + (this.y - A.y) * (this.y - A.y));
    }
    
}