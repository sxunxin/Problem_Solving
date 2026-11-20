import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        String[] splitArr = myString.split("x", -1);
        int[] answerArr = new int[splitArr.length];
        
        for (int i = 0; i < splitArr.length; i++) {
            answerArr[i] = splitArr[i].length();
        }
        
        return answerArr;
    }
}