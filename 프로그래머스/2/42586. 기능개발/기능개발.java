import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        int releaseDay = 0;
        int cnt = 0;
        
        for (int i = 0; i < progresses.length; i++) {
            int days = (99 - progresses[i] + speeds[i]) / speeds[i];
            
            if (days > releaseDay) {
                if (cnt > 0) result.add(cnt);
                releaseDay = days;
                cnt = 0;
            } 
            cnt++;
        }
        result.add(cnt);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}