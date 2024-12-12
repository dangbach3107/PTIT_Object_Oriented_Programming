package J05048;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Hang[] arr = new Hang[t];
        for(int i = 0; i < t; i++){
            String ma = sc.nextLine();
            int soLuong = Integer.parseInt(sc.nextLine());
            arr[i] = new Hang(ma, soLuong);
        }
        for(Hang i : arr){
            System.out.println(i);
        }
    }
}


// 3
// A001Y
// 1000
// B012N
// 2500
// B003Y
// 4582