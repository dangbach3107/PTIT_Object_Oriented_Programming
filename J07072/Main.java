package J07072;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DANHSACH.in"));

        ArrayList<Ten> a = new ArrayList<>();
        while(in.hasNextLine()){
            a.add(new Ten(in.nextLine()));
        }

        Collections.sort(a);

        for(Ten x : a){
            System.out.println(x);
        }
    }
}
