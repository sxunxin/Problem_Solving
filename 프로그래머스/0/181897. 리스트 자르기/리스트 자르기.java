class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = 0;
        int end = 0;
        int step = 1;
        
        if (n == 1) {
            end = slicer[1];
        } else if (n == 2) {
            start = slicer[0];
            end = num_list.length - 1;
        } else {
            start = slicer[0];
            end = slicer[1];

            if (n == 4) step = slicer[2];
        }
        
        int size = (end - start) / step + 1;
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = num_list[start + i * step];
        }

        return answer;
    }
}