import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        int answer = 1;
        
        for (String[] item : clothes) map.merge(item[1], 1, Integer::sum);
        for (int v : map.values()) answer *= v + 1;
        
        return answer - 1;
        
    }
}