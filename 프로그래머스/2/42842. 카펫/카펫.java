class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        
        for (int height = 3; height <= Math.sqrt(total); height++) {
            int width = total / height;
            if (total % height == 0 && width >= height && yellow == (width - 2) * (height - 2)) {
                return new int[]{width, height}; 
            }
        }
        
        return new int[]{0, 0};
    }
}
