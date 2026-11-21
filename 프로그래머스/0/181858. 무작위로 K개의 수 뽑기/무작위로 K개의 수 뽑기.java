import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        
        for (int num : arr) {
            if (set.size() < k) set.add(num);
        }
        
        int[] answer = new int[k];
        Arrays.fill(answer, -1);

        int i = 0;
        for (int x : set) {
            answer[i++] = x;
        }
        return answer;
    }
}