package J07037;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(in.nextLine());

        DoanhNghiep [] a = new DoanhNghiep[n];

        for(int i = 0; i < n; i++){
            a[i] = new DoanhNghiep(in.nextLine(), in.nextLine(), in.nextLine());
        }

        Arrays.sort(a);

        for(DoanhNghiep x : a){
            System.out.println(x);
        }
    }
}
