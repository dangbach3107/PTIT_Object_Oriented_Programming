package J07021;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        while(true){
            String s = in.nextLine();
            if(s.equals("END"))
                break;
            System.out.println(chuanHoa(s));
        }
    }
    public static String chuanHoa(String s)
    {
        ArrayList<String> a = new ArrayList<String>();
        String tmp[] = s.trim().split("\\s+");
        for(String x : tmp){
            a.add(x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase());
        }
        return String.join(" ", a);
    }
}
