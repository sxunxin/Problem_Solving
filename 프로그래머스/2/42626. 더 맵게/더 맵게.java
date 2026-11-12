import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cnt = 0;
        
        for (int num : scoville) {
            pq.offer(num);
        }
        
        while (pq.peek() < K) {
            if (pq.size() < 2) {
                cnt = -1;
                break;
            }
            
            pq.offer(pq.poll() + (pq.poll() * 2));
            cnt++;
        }
        
        return cnt;
    }
}