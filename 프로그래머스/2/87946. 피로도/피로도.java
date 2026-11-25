import java.util.*;

class Solution {
    static boolean[] visited;
    static int max;
    static int[][] map;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        max = 0;
        map = dungeons;

        dfs(k, 0);
    
        return max;
    }
        
    static void dfs(int current, int cnt) {
        max = Math.max(max, cnt);

        for (int i = 0; i < map.length; i++) {
            if (visited[i] || map[i][0] > current) continue;

            visited[i] = true;
            dfs(current - map[i][1], cnt + 1);
            visited[i] = false;
        }
    }
}