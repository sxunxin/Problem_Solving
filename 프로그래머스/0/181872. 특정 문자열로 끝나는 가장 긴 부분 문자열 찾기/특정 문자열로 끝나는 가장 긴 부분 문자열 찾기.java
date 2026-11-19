class Solution {
    public String solution(String myString, String pat) {

        int last = -1;
        int from = 0;
        while (true) {
            int found = myString.indexOf(pat, from);
            if (found == -1) break;
            last = found;
            from = found + 1;
        }
        
        return myString.substring(0, last) + pat;
    }
}