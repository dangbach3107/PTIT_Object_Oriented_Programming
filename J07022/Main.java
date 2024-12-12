package J07022;
import java.util.*;
import java.io.*;
public class Main {
    public static boolean isInt(String s)
    {
        try{
            Integer.parseInt(s);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList<String> a = new ArrayList<>();

        while (in.hasNextLine()) {
            String line = in.nextLine();
            String tokens[] = line.split("\\s+");

            for(String token : tokens){
                if(!isInt(token)) a.add(token);
            }
        }

        Collections.sort(a);
        for(String token : a){
            System.out.printf(token + " ");
        }
    }
}
