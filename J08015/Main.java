package J08015;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }
            System.out.println(countPairs(A, N, K));
        }
    }

    private static long countPairs(long[] A, int N, long K) {
        Map<Long, Long> map = new HashMap<>();
        long count = 0;

        for (int i = 0; i < N; i++) {
            long complement = K - A[i];
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(A[i], map.getOrDefault(A[i], 0L) + 1);
        }

        return count;
    }
}
