package J07055;
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
            for(BangDiem x : a){
                System.out.println(x);
            }

        } catch (Exception e) {
        }
    }
}
