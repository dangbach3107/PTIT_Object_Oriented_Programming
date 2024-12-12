package J07012;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arr = (ArrayList<String>) ois.readObject();
        ois.close();

        Map<String, Integer> map = new HashMap<>();

        for(String tmp : arr){
            String tokens[] = tmp.toLowerCase().trim().split("[^a-z0-9]");
            for(String s : tokens){
                if (!s.isEmpty()) {
                    map.put(s, map.getOrDefault(s, 0) + 1);
                }
            }    
        }

        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(map.entrySet());
        sortedWords.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue(); 
            }
            return a.getKey().compareTo(b.getKey()); 
        });

        for (Map.Entry<String, Integer> entry : sortedWords) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
