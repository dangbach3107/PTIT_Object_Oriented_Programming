package J04022;

import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> value;

    public WordSet(String s) {
        value = new TreeSet<>();
        String tmp[] = s.toLowerCase().trim().split("\\s+");
        for(String x : tmp){
            value.add(x);
        }
    }

    public WordSet union(WordSet other){
        WordSet tmp = new WordSet("");
        tmp.value.addAll(this.value);
        tmp.value.addAll(other.value);
        return tmp;
    }

    public WordSet intersection(WordSet other){
        WordSet tmp = new WordSet("");
        tmp.value.addAll(this.value);
        tmp.value.retainAll(other.value);
        return tmp;
    }

    @Override
    public String toString() {
        return String.join(" ", value); 
    }
    
}
