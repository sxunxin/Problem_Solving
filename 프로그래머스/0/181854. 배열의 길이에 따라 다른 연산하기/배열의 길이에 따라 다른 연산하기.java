class Solution {
    public int[] solution(int[] arr, int n) {
        for (int i = 1 - arr.length % 2; i < arr.length; i += 2) {
            arr[i] += n;
        }
        
        return arr;
    }
}