package J05044;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        NhanVien[] nv = new NhanVien[n];

        for(int i = 0 ; i < n; i++){
            nv[i] = new NhanVien(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));

        }
        String x = sc.nextLine();
        for(NhanVien i : nv){
            if(i.getChucVu().equals(x)){
                System.out.println(i);
            }
        }
    }
}


// 4
// Tran Thi Yen
// NV
// 1000
// 24
// Nguyen Van Thanh
// BV
// 1000
// 30
// Doan Truong An
// TP
// 3000
// 25
// Le Thanh
// GD
// 5000
// 28
// TP