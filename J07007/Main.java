package J07007;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("VANBAN.in"));
        TreeSet<String> set = new TreeSet<String>();
        while (in.hasNextLine()) {
            String s = in.nextLine();
            String[] tmp = s.toLowerCase().split(" ");
            for(String x : tmp){
                set.add(x);
            }

        }
        for(String x : set){
            System.out.println(x);
        }
    }
}
