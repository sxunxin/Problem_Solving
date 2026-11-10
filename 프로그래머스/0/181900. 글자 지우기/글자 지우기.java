import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        HashSet<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        
        for (int index : indices) {
            set.add(index);
        }
        
        for (int i = 0; i < my_string.length(); i++) {
            if (!set.contains(i)) {
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }
}