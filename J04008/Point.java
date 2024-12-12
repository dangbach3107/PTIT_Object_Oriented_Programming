package J04008;

public class Point {
    private double x, y;
    
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double distance(Point A){
        return Math.sqrt((this.x - A.x) * (this.x - A.x) + (this.y - A.y) * (this.y - A.y));
    }
}
