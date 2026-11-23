import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> del = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        for (int d : delete_list) {
            del.add(d);
        }
        
        for (int num : arr) {
            if (!del.contains(num)) list.add(num);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}