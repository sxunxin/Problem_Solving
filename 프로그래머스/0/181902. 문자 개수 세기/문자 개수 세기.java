class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for (char ch : my_string.toCharArray()) {
            if (ch < 97) answer[ch - 65]++;
            else answer[ch - 71]++;
        }
        
        return answer;
    }
}