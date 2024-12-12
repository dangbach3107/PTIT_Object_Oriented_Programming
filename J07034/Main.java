package J07034;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(in.nextLine());
        MonHoc a[] = new MonHoc[n];

        for(int i = 0; i < n; i++){
            a[i] = new MonHoc(in.nextLine(), in.nextLine(), in.nextLine());
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
}
