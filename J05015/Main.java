package J05015;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        CuaRo[] cuaRos = new CuaRo[n];
        for(int i = 0; i < n; i++){
            String hoTen = sc.nextLine();
            String donVi = sc.nextLine();
            String date = sc.nextLine();
            cuaRos[i] = new CuaRo(hoTen, donVi, date);
        }
        Arrays.sort(cuaRos);
        for(CuaRo cuaRo : cuaRos){
            System.out.println(cuaRo);
        }
    }
}
// 3
// Tran Vu Minh
// Ha Noi
// 8:30
// Vu Ngoc Hoang
// Hoa Binh
// 8:20
// Pham Dinh Tan
// An Giang
// 8:45