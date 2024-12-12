package J04019;

public class Triangle {
    private double A, B, C;
    public Triangle(Point a, Point b, Point c){
        this.A=Point.dis(a,b);
        this.B=Point.dis(a,c);
        this.C=Point.dis(b,c);
    }
    public boolean valid(){
        double m=Math.max(A,Math.max(B,C));
        return 2*m<A+B+C;
    }
    public String getPerimeter(){
        double sum=A+B+C;
        return String.format("%.3f", sum);
    }
}
