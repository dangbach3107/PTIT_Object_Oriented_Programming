package J07014;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordSet {
    private Set<String> value;

    public WordSet() {
        value = new TreeSet<>();
    }

    public WordSet(String file) throws FileNotFoundException {
        value = new TreeSet<>();
        Scanner sc = new Scanner(new File(file));
        while (sc.hasNext()) value.add(sc.next().toLowerCase());
    }

    public WordSet union(WordSet o){
        WordSet tmp = new WordSet();
        tmp.value.addAll(this.value); 
        tmp.value.addAll(o.value);
        return tmp;
    }

    public WordSet intersection(WordSet o){
        WordSet tmp = new WordSet();
        tmp.value.addAll(this.value); 
        tmp.value.retainAll(o.value);
        return tmp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String token : value) {
            sb.append(token).append(" ");
        }
        return sb.toString().trim();
    }

    
}
