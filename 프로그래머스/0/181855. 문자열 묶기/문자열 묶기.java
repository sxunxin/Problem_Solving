class Solution {
    public int solution(String[] strArr) {
        
        int[] lenArr = new int[31];
        int max = 0;
        
        for (String str : strArr) {
            if (++lenArr[str.length()] > max) max = lenArr[str.length()];
        }
        
        return max;
    }
}