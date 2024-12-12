package J02102;

import java.util.*;

public class Main {

    // Hàm để sắp xếp và điền các phần tử theo kiểu xoắn ốc
    public static void sapXepXoanOc(int[][] matrix, int n) {
        // Bước 1: Lấy tất cả phần tử từ ma trận vào một danh sách
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                elements.add(matrix[i][j]);
            }
        }

        // Bước 2: Sắp xếp danh sách theo thứ tự tăng dần
        Collections.sort(elements);

        // Bước 3: Điền lại ma trận theo kiểu xoắn ốc
        int index = 0; // Chỉ số phần tử đang xét
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Đi từ trái sang phải trên hàng "top"
            for (int i = left; i <= right; i++) {
                matrix[top][i] = elements.get(index++);
            }
            top++;

            // Đi từ trên xuống dưới ở cột "right"
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = elements.get(index++);
            }
            right--;

            // Đi từ phải sang trái trên hàng "bottom" (nếu còn hàng)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = elements.get(index++);
                }
                bottom--;
            }

            // Đi từ dưới lên trên ở cột "left" (nếu còn cột)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = elements.get(index++);
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc kích thước ma trận
        int n = sc.nextInt();

        // Đọc ma trận A
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Sắp xếp xoắn ốc
        sapXepXoanOc(matrix, n);

        // In ma trận kết quả
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

