import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] x = {a, b, c, d};
        Arrays.sort(x);
        
        if (x[0] == x[3]) return 1111 * x[0];
        
        if (x[0] == x[2]) return (10 * x[0] + x[3]) * (10 * x[0] + x[3]);
        if (x[1] == x[3]) return (10 * x[1] + x[0]) * (10 * x[1] + x[0]);
        
        if (x[0] == x[1] && x[2] == x[3]) return (x[0] + x[2]) * (x[2] - x[0]);
        
        if (x[0] == x[1]) return x[2] * x[3];
        if (x[1] == x[2]) return x[0] * x[3];
        if (x[2] == x[3]) return x[0] * x[1];

        return x[0];   
    }
}