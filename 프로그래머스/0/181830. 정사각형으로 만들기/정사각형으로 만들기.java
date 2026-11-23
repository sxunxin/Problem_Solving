class Solution {
    public int[][] solution(int[][] arr) {
        
        int rowLen = arr.length;
        int colLen = arr[0].length;
        int maxLen = Math.max(colLen, rowLen);
        
        int[][] answer = new int[maxLen][maxLen];
        
        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, colLen);
        }
        
        return answer;
    }
}