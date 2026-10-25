class Solution {
    public int solution(int a, int b) {
        
        int sol1 = Integer.parseInt("" + a + b); 
        int sol2 = 2 * a * b;
    
        if (sol1 > sol2) return sol1;
        else return sol2;
    }
}