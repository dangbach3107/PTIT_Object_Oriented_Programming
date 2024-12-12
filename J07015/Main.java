package J07015;
import java.io.*;
import java.util.*;
public class Main {
    private static boolean isPrime(int n){
        if(n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"))) {
            ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();

            for(int token: a){
                if(isPrime(token)){
                    map.put(token, map.getOrDefault(token, 0) + 1);
                }
            }
            for(Map.Entry<Integer, Integer> x : map.entrySet()){
                System.out.println(x.getKey() + " " + x.getValue());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
