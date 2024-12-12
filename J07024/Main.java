package J07024;

import java.io.*;
import java.util.*;

class WordSet {
    private Set<String> words;

    // Constructor đọc file và tạo tập hợp từ
    public WordSet(String fileName) throws FileNotFoundException {
        words = new TreeSet<>();
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().toLowerCase();
            String[] tokens = line.split("\\s+");
            words.addAll(Arrays.asList(tokens));
        }
        scanner.close();
    }

    // Phương thức tìm các từ có trong tập hiện tại nhưng không có trong tập khác
    public String difference(WordSet other) {
        Set<String> result = new TreeSet<>(this.words);
        result.removeAll(other.words);
        return String.join(" ", result);
    }
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
