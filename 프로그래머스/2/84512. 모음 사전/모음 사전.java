class Solution {
    static String target;
    static String[] vowels = {"A", "E", "I", "O", "U"};
    static int count;
    static int answer;

    public int solution(String word) {
        target = word;
        count = 0;
        answer = 0;

        dfs("");

        return answer;
    }

    static void dfs(String current) {
        if (!current.equals("")) count++;
        
        if (current.equals(target)) answer = count;

        if (current.length() == 5) return;

        for (String vowel : vowels) {
            dfs(current + vowel);
            if (answer != 0) return;
        }
    }
}