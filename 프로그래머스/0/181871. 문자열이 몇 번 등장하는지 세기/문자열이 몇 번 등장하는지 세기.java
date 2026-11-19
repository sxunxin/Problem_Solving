class Solution {
    public int solution(String myString, String pat) {
    
        int cnt = 0;
        int from = 0;
        while (true) {
            int found = myString.indexOf(pat, from);
            if (found == -1) break;
            from = found + 1;
            cnt++;
        }
        
        return cnt;
    }
}