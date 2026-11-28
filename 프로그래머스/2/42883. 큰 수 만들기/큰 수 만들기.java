import java.util.*;

class Solution {
    public String solution(String number, int k) {
        
        Deque<Character> st = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            
            while(k != 0 && !st.isEmpty() && st.peek() < c) {
                st.pop();
                k--;
            }
            st.push(c);
        }

        for (int i = 0; i < k; i++) {
            st.pop();
        }
        
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
