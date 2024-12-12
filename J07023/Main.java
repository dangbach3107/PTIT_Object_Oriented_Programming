package J07023;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    static int a[] = new int[10005];
    static{
        for(int i = 0; i < 10005; i++) {
            a[i] = 0;
        }
        a[0] = 1;
        a[1] = 1;
    
        for(int i = 2; i < 10005; i++) {
            if(a[i] == 0) {
                for(int j = i * i; j < 10005; j += i) {
                    a[j] = 1;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        return a[n] == 0;
    }

    public static boolean isPalindrome(int n) {
        int m = n;
        int rev = 0;
        while(m > 0) {
            rev = rev * 10 + m % 10;
            m /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();

        Map<Integer, Integer> count1 = new HashMap<>();
        Map<Integer, Integer> count2 = new HashMap<>();
        for(int num : list1) {
            if(isPrime(num) && isPalindrome(num)) {
                count1.put(num, count1.getOrDefault(num, 0) + 1);
            }
        }
        for(int num : list2) {
            if(isPrime(num) && isPalindrome(num)) {
                count2.put(num, count2.getOrDefault(num, 0) + 1);
            }
        }

        Set<Integer> set = new TreeSet<>(count1.keySet());
        set.retainAll(count2.keySet());

        for(int num : set) {
            System.out.println(num + " " + count1.get(num) + " " + count2.get(num));
        }
    }
}
