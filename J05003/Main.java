package J05003;
import java.util.*;;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        SinhVien []a = new SinhVien[n];

        for(int i = 0; i < n; i++){
            a[i] = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()));
            a[i].setMaSV(i);
        }
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
}
