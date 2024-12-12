package J07084;
import java.io.*;
import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        SinhVien a[] = new SinhVien[n];

        for(int i = 0; i < n; i++){
            a[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
}
