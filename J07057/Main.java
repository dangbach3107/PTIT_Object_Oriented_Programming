package J07057;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(in.nextLine());

        ThiSinh a[] = new ThiSinh[n];

        for(int i = 0; i < n; i++){
            a[i] = new ThiSinh(in.nextLine(), Float.parseFloat(in.nextLine()), in.nextLine(), Integer.parseInt(in.nextLine()));
        }

        Arrays.sort(a);

        for(int i = 0 ;i < n; i++){
            if(a[i].getTongDiem() >= 20.5) System.out.println(a[i] + " Do");
            else System.out.println(a[i] + " Truot");
            
        }
    }
}
