package J04002;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Rectange r = new Rectange();

        r.setWidth(in.nextDouble());
        r.setHeight(in.nextDouble());

        String color = in.next();

        color = color.toLowerCase();
        color = color.substring(0, 1).toUpperCase() + color.substring(1);

        r.setColor(color);

        if(r.getHeight() > 0 && r.getWidth() > 0)
        {
            System.out.printf("%.0f %.0f %s", r.findPerimeter(), r.findArea(), r.getColor());
        }
        else
        {
            System.out.println("INVALID");
        }
    }
}
