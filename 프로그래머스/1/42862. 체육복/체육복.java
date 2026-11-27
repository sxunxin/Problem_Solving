import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int cnt = 0;
        int[] arr = new int[n + 2];
        Arrays.fill(arr, 1);
        
        for (int num : lost) {
            arr[num]--;
        }
        for (int num : reserve) {
            arr[num]++;
        }
        
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                if (arr[i - 1] == 2) {
                    arr[i - 1]--;
                    arr[i]++;
                } else if (arr[i + 1] == 2) {
                    arr[i + 1]--;
                    arr[i]++;
                }
            }
            
            if (arr[i] > 0) cnt++;
        }
        
        return cnt;
    }
}
