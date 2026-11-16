import java.util.*;

class Solution {
    public int solution(int[][] jobs) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            Comparator.<int[]>comparingInt(a -> a[0])
              .thenComparingInt(a -> a[1])
              .thenComparingInt(a -> a[2]));
        
        int[][] sortedJobs = new int[jobs.length][3];
        for (int i = 0; i < jobs.length; i++) {
            sortedJobs[i] = new int[]{jobs[i][1], jobs[i][0], i};
        }

        Arrays.sort(sortedJobs, (o1, o2) -> Integer.compare(o1[1], o2[1]));
            
        int now = 0;
        int idx = 0;
        int sum = 0;
        int done = 0;
        
        while (done < jobs.length) {
            
            while (idx < jobs.length && sortedJobs[idx][1] <= now) {
                pq.add(sortedJobs[idx++]);
            } 
            
            if (pq.isEmpty()) {
                now = sortedJobs[idx][1];
                continue;
            } 
                
            int[] tempJob = pq.poll();
            now += tempJob[0];
            sum += now - tempJob[1];
            done++;
        }
        
        return sum / jobs.length;
    }
}