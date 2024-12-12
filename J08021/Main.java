package J08021;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int Valid(String s){
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int maxLength = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Số lượng bộ test
        scanner.nextLine(); // Bỏ qua dòng trống

        for (int t = 0; t < T; t++) {
            String S = scanner.nextLine();
            System.out.println(Valid(S));
        }

        scanner.close();
    }
}
// 3
// ((()
// )()())
// ()(()))))