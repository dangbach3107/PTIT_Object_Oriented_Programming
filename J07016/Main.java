import java.io.*;
import java.util.*;

public class Main {
    public static final int MAX = 10000;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Sàng Eratosthenes để tìm các số nguyên tố
        boolean[] isPrime = sieveOfEratosthenes(MAX);

        // Đọc dữ liệu từ file DATA1.in
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ois1.close();

        // Đọc dữ liệu từ file DATA2.in
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        ois2.close();

        // Đếm số lần xuất hiện của số nguyên tố trong từng file
        Map<Integer, Integer> count1 = countPrimesUsingSieve(list1, isPrime);
        Map<Integer, Integer> count2 = countPrimesUsingSieve(list2, isPrime);

        // Lấy giao của hai tập hợp số nguyên tố
        Set<Integer> commonPrimes = new TreeSet<>(count1.keySet());
        commonPrimes.retainAll(count2.keySet());

        // In kết quả
        for (int prime : commonPrimes) {
            System.out.println(prime + " " + count1.get(prime) + " " + count2.get(prime));
        }
    }

    // Hàm tạo sàng Eratosthenes
    public static boolean[] sieveOfEratosthenes(int max) {
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0 và 1 không phải là số nguyên tố

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    // Hàm đếm số lần xuất hiện của các số nguyên tố trong danh sách
    public static Map<Integer, Integer> countPrimesUsingSieve(ArrayList<Integer> list, boolean[] isPrime) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : list) {
            if (num <= MAX && isPrime[num]) { // Chỉ xử lý nếu là số nguyên tố
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }
        return countMap;
    }
}
