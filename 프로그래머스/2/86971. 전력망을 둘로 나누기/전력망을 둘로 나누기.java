import java.util.*;

class Solution {
    
    static boolean[] visited;
    static List<Integer>[] graph;
    static int[] cutWire;
    
    public int solution(int n, int[][] wires) {
        graph = new ArrayList[n + 1];
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < wires.length; i++) {
            graph[wires[i][0]].add(wires[i][1]);
            graph[wires[i][1]].add(wires[i][0]);
        }
        
        for (int[] wire : wires) {
            visited = new boolean[n + 1];
            cutWire = wire;    
            min = Math.min(min, Math.abs(n - 2 * dfs(1)));
        }
        
        return min;
    }
    
    static int dfs(int current) {
        visited[current] = true;
        int cnt = 1;

        for (int next : graph[current]) {
            if (visited[next] || (cutWire[0] == current && cutWire[1] == next) 
                || (cutWire[1] == current && cutWire[0] == next)) continue;
            cnt += dfs(next);
        }
        
        return cnt;
    }
}