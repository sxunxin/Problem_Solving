class Solution {
    public int solution(int[][] sizes) {
        
        int maxLong = 0;
        int maxShort = 0;

        for (int[] size : sizes) {
            maxLong = Math.max(maxLong, Math.max(size[0], size[1]));
            maxShort = Math.max(maxShort, Math.min(size[0], size[1]));
        }

        return maxLong * maxShort;
    }
}