package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int n = Integer.parseInt(in.nextLine());
            ArrayList <CongNhan> A = new ArrayList<>();

            for(int i = 0; i < n; i++){
                CongNhan cn = new CongNhan(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
                A.add(cn);
            }

            A.sort((a, b) -> {
                if(b.getThoiGianLamViec() != a.getThoiGianLamViec()){
                    return Long.compare(b.getThoiGianLamViec(), a.getThoiGianLamViec());
                }
                return a.getMa().compareTo(b.getMa());
            });

            for(CongNhan x : A){
                System.out.println(x);
            }
        } catch (Exception e) {
        }
    }
}
// 2
// 01T
// Nguyen Van An
// 08:00
// 17:30
// 06T
// Tran Hoa Binh
// 09:05
// 17:00