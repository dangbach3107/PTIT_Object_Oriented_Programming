package J03038;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        HashSet<Character> m = new HashSet<Character>();
        for(char x : s.toCharArray()){
            m.add(x);
        }
        System.out.println(m.size());
    }
}
