import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        Queue<Integer> q = new ArrayDeque<>();
        
        int time = 0;
        int nowWeight = 0;
        int nextIdx = 0;
        
        for (int i = 0; i < bridge_length; i ++) q.offer(0);
        
        while(true) {
            time++;
            nowWeight -= q.poll();
            
            int next = truck_weights[nextIdx];
            if (weight >= nowWeight + next) {
                nextIdx++;
                q.offer(next);
                nowWeight += next;
    
            } else q.offer(0);
        
            if (nextIdx == truck_weights.length) return time + bridge_length;
        }

    }
}