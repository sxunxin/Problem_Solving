import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        List<String> list = new ArrayList<>();
        for (String s : myStr.split("[abc]+")) {
            if (!s.isEmpty()) list.add(s);
        }
        
        return list.size() == 0 ? new String[]{"EMPTY"} : list.toArray(new String[0]);
    }
}