package J07003;
import java.io.*;
import java.math.BigInteger;
import java.util.*;;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        String s = in.nextLine();
        while (s.length()>1){
            BigInteger a=new BigInteger(s.substring(0,s.length()/2));
            BigInteger b=new BigInteger(s.substring(s.length()/2));
            s=a.add(b).toString();
            System.out.println(s);
        }
    }
}
