class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        int nowNum = a;
        int totalNum = 0;
        
        for (int i = 0; i < included.length; i++) {
            if (included[i]) totalNum += nowNum;
            nowNum += d;
        }
        
        return totalNum;
    }
}