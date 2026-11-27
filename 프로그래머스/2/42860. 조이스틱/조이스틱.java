class Solution {
    public int solution(String name) {
        
        int upDown = 0;
        int moves = Integer.MAX_VALUE;
        int n = name.length();
        
        for (int i = 0; i < n; i++) {
            upDown += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
        }
    
        for (int i = 0; i < n; i++) {
            int next = i + 1;
            while (next < n && name.charAt(next) == 'A') {
                next++;
            }
            
            moves = Math.min(moves, Math.min(i * 2 + n - next, (n - next) * 2 + i));   
        }
        
        return upDown + moves;
    }
}