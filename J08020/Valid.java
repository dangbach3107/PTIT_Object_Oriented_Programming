package J08020;

import java.util.Stack;

public class Valid {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char topChar = stack.pop();
                if(ch == ')' && topChar != '('){
                    return false;
                }
                if(ch == ']' && topChar != '['){
                    return false;
                }
                if(ch == '}' && topChar != '{'){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
