import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            int num = i;
            boolean flag = true;
            
            while (num > 0) {
                if (num % 10 != 0 && num % 10 != 5) {
                    flag = false;
                    break;
                }
                num /= 10;
            }
            
            if (flag) list.add(i);
        }
        
        if (list.isEmpty()) return new int[]{-1};
        else return list.stream().mapToInt(Integer::intValue).toArray();
    }
}