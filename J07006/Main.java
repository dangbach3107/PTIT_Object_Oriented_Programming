package J07006;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();

        int count[] = new int[1001];

        for(int x : a){
            count[x]++;
        }

        for(int i = 0; i < 1001; i++){
            if(count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}
