package J07033;
import java.util.*;
import java.io.*;;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(in.nextLine());
        SinhVien [] a = new SinhVien[n];
        for(int i = 0; i < n; i++){
            a[i] = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);        
        }
    }
}
