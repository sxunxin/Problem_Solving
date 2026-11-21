import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()) stk.push(arr[i]);
            else if (!stk.isEmpty()) {
                if (stk.peek() == arr[i]) stk.pop();
                else stk.push(arr[i]);
            }
        }

        int[] stkArr = stk.stream().mapToInt(Integer::intValue).toArray();
        return stkArr.length == 0 ? new int[]{-1} : stkArr;
    }
}