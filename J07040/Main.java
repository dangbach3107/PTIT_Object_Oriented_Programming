package J07040;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a = (ArrayList<String>) ois.readObject();
        ois.close();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        HashSet<String> hashSet = new HashSet<>();

        for(String x : a){
            String [] tokens = x.trim().toLowerCase().split("\\s+");
            for(String token : tokens){
                hashSet.add(token);
            }
        }

        while(sc.hasNext()){
            String x  = sc.next().toLowerCase();
            if(hashSet.contains(x)) System.out.println(x);
            hashSet.remove(x);
        }
            
        sc.close();
        
    }
}
