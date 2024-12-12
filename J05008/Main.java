package J05008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Point[] a = new Point[n];
            double area = 0;
            for(int i = 0; i < n; i++){
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                a[i] = new Point(x, y);
                
            }
            for (int i = 0; i < n; i++) {
                double x1 = a[i].getX();
                double y1 = a[i].getY();
                double x2 = a[(i + 1) % n].getX(); // Điểm tiếp theo (vòng lại điểm đầu)
                double y2 = a[(i + 1) % n].getY();
                area += x1 * y2 - y1 * x2;
            }
            area = Math.abs(area) / 2.0; // Lấy giá trị tuyệt đối và chia 2
            System.out.printf("%.3f\n", area);
        }
    }
}

// 2
// 3
// 0 0
// 1 0
// 0 1
// 4
// 0 0
// 2 0
// 2 2
// 0 2