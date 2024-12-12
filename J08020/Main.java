package J08020;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            if(Valid.isValid(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
// 2
// [()]{}{[()()]()}
// [(])