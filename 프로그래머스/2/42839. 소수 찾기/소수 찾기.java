import java.util.*;

class Solution {
    
    static Set<Integer> set;
    static boolean[] visited;
    static String word;
    
    public int solution(String numbers) {
        set = new HashSet<>();
        visited = new boolean[numbers.length()];
        word = numbers;
        int cnt = 0;
        
        dfs("");
        
        for (Integer num : set) {
            if (isPrime(num)) cnt++;
        }
        
        return cnt;
    }
    
    static void dfs(String current) {
        if (current.length() != 0) set.add(Integer.parseInt(current));

        for (int i = 0; i < word.length(); i++) {
            if (visited[i]) continue;

            visited[i] = true;
            dfs(current + word.charAt(i));
            visited[i] = false;
        }
    }
    
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}