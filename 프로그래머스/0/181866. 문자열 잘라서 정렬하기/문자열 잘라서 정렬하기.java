import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        List<String> list = new ArrayList<>();
        for (String s : myString.split("x")) {
            if (!s.isEmpty()) list.add(s);
        }
        
        String[] arr = list.toArray(new String[0]);
        Arrays.sort(arr);
        
        return arr;        
    }
}