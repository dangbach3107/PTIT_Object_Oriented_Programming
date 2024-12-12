package J08012;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Vector<Vector<Integer>> a = new Vector<>();
        for(int i = 0;i < n; i++){
            a.add(new Vector<>());
        }
        for(int i = 0;i < n - 1; i++){
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            a.get(x).add(y);
            a.get(y).add(x);
        }

        boolean kt = false;

        for(int i = 0; i < n; i++){
            if(a.get(i).size() == n - 1){
                kt = true;
                break;
            }
        }

        System.out.println(kt ? "Yes" : "No");
    }
}
