class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        
        boolean isEquals;
        
        if (ineq.equals(">")) isEquals = (n > m);
        else isEquals = (n < m);
    
        isEquals = isEquals || (eq.equals("=") && n == m);
        return isEquals ? 1 : 0;
        
    }
}