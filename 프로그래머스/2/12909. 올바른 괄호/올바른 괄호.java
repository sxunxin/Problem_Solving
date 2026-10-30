import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (st.isEmpty()) st.push(ch);
            else if (st.peek() == '(' && ch == ')') st.pop();
            else st.push(ch);
        }
        
        return st.isEmpty();
    }
}