import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
            while (!st.isEmpty() && prices[i] < prices[st.peek()]) {
                int idx = st.pop();
                answer[idx] = i - idx;
            }
            st.push(i);
        }
        
        while (!st.isEmpty()) {
            int idx = st.pop();
            answer[idx] = prices.length - 1 - idx;
        }

        return answer;
    }
}
