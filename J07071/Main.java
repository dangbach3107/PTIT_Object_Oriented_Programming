package J07071;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("DANHSACH.in"));

            int n = Integer.parseInt(in.nextLine());
            HoTen []a = new HoTen[n];

            for(int i = 0; i < n; i++){
                a[i] = new HoTen(in.nextLine());
            }

            Arrays.sort(a);

            int t = Integer.parseInt(in.nextLine());

            while (t-- > 0) {
                String token = in.nextLine();
                String tmp[] = token.trim().split("\\.");
                token = "";
                int index = 0;
                for(String x : tmp){
                    token += x;
                }
                for(int i = 0 ; i < token.length(); i++){
                    if(token.charAt(i) == '*'){
                        index = i;
                        break;
                    }
                }

                for (HoTen x : a)
                    if (token.substring(0, index).equals(x.getTenVietTat().substring(0, index)) && token.substring(index + 1).equals(x.getTenVietTat().substring(index + 1)))
                        System.out.println(x);

            }
        } catch (Exception e) {
        }
    }
}
