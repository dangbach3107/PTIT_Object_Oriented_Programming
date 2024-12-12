package J05081;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MatHang []a = new MatHang[n];

        for(int i = 0; i < n; i++){
            a[i] = new MatHang(String.format("MH%03d", i + 1), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        }

        Arrays.sort(a);
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
}
