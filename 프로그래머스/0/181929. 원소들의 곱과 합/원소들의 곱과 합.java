class Solution {
    public int solution(int[] num_list) {
        int sol1 = 1;
        int sol2 = 0;
        
        for (int num : num_list) {
            sol1 *= num;
            sol2 += num;
        }

        return (sol1 < sol2 * sol2) ? 1 : 0;
    }
}