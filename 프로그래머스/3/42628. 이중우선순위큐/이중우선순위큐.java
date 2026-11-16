import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for (String op : operations) {
            int num = Integer.parseInt(op.substring(2));

            if (op.charAt(0) == 'I') {
                map.merge(num, 1, Integer::sum);
            } else if (!map.isEmpty()) {
                int key = (num == 1) ? map.lastKey() : map.firstKey();
                if (map.get(key) == 1) map.remove(key);
                else map.merge(key, -1, Integer::sum);
            }
        }
        
        return (map.isEmpty()) ? new int[]{0, 0} : new int[]{map.lastKey(), map.firstKey()};
    }
}