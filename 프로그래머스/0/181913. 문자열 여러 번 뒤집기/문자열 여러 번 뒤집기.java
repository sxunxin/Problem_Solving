class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] myList = my_string.toCharArray();

        for (int[] query : queries) {

            char[] myTempList = new char[query[1] - query[0] + 1];
            for (int i = query[0]; i <= query[1]; i++) {
                myTempList[i - query[0]] = myList[i];
            }

            for (int i = query[0]; i <= query[1]; i++) {
                myList[i] = myTempList[query[1] - i];
            }
        }
        
        return String.valueOf(myList); 
    }
}