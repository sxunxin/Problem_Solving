class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int len = 0;
        
        for (boolean done : finished) {
            if (!done) len++;
        }
        
        String[] answer = new String[len];
        int j = 0;
        
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) answer[j++] = todo_list[i];
        }
        
        return answer;
    }
}