package J04021;

import java.util.*;

public class IntSet {
    private HashSet<Integer> s;
    private int[] a;

    public IntSet(int[] a) {
        this.a = a;
        s = new HashSet<>();

        for(int x : a)
        {
            s.add(x);
        }
    }

    public IntSet union(IntSet tmp)
    {
        this.s.addAll(tmp.s);
        return this;
    }

    @Override
    public String toString() {
        ArrayList <Integer> A = new ArrayList<>(s);
        Collections.sort(A);
        StringBuilder result = new StringBuilder();
        for (int value : A) {
            result.append(value).append(" ");
        }
        return result.toString().trim();
    }
    
    
}
