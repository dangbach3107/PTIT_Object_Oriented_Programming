package J07030;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static boolean nto(int n){
        for(int i=2;i*i<=n;++i)
            if (n%i==0) return false;
        return n>1;
    }

    public static void main(String[] args){
        try {
            ObjectInputStream ot1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
            ObjectInputStream ot2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
            List<Integer> a = (ArrayList<Integer>) ot1.readObject();
            List<Integer> b = (ArrayList<Integer>) ot2.readObject();
            TreeSet<Integer> c=new TreeSet<>();
            for(Integer x:a)
                if (nto(x)) c.add(x);
            TreeSet<Integer> d=new TreeSet<>();
            for(Integer x:b)
                if (nto(x)) d.add(x);
            for(Integer x:c)
                if (x<1000000-x)
                    if (d.contains(1000000-x)) System.out.println(x+" "+(1000000-x));
        } catch (Exception e) {
        }
    }
}
