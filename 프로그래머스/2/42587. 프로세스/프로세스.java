import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        int answer = 0;
        
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{priorities[i], i});
        }
        
        while (!queue.isEmpty()) {
            int[] nowProcess = queue.poll();
            
            boolean flag = false;
            for (int[] process : queue) {
                if (process[0] > nowProcess[0]) {
                    flag = true;
                    break;
                }
            }
            
            if (flag) queue.offer(nowProcess);
            else {
                answer++;
                if (nowProcess[1] == location) break;
            }
        }
        
        return answer;
    }
}