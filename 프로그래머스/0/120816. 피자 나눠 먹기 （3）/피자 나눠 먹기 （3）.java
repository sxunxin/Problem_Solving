class Solution {
    public int solution(int slice, int n) {
        int cnt = 0; 
        
        while(true) if (slice * ++cnt >= n) break;
        
        return cnt;
    }
}