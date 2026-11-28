import java.util.*;

class Solution {
    public int solution(int[] array) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;
        int mode = -1;
        
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (int key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                mode = key;
            } else if (map.get(key) == max) {
                mode = -1;
            }
        }

        return mode;
    }
}