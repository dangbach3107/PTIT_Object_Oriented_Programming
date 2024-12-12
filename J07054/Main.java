package J07054;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("BANGDIEM.in"));

            int n = Integer.parseInt(in.nextLine());

            BangDiem a[] = new BangDiem[n];

            for(int i = 0; i < n; i++){
                a[i] = new BangDiem(in.nextLine(), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()));
            }

            Arrays.sort(a);
            float now = a[0].getDiemTrungBinh();
            int nowSTT = 1;
            System.out.println(a[0] + " 1");
            for(int i = 1; i < n; i++){
                if(a[i].getDiemTrungBinh() == now){
                    System.out.println(a[i] + " " + nowSTT);
                }
                else{
                    System.out.println(a[i] + " " + (i + 1));
                    nowSTT = i + 1;
                }
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
