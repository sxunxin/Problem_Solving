class Solution {
    public int solution(String[] babbling) {
        String[] says = new String[]{"aya", "ye", "woo", "ma"};
        int cnt = 0;
        
        for (String str : babbling) {
            int len = 0;
            for (String say : says) {
                if (str.contains(say)) len += say.length();
            }
            
            if (len == str.length()) cnt++;
        }
        
        return cnt;
        
    }
}
