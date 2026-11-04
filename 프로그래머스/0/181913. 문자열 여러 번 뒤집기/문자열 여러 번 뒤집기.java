class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] myList = my_string.toCharArray();

        for (int[] query : queries) {
            for (int i = query[0], j = query[1]; i < j; i++, j--) {
                char temp = myList[i];
                myList[i] = myList[j];
                myList[j] = temp;
            }
        }
        
        return String.valueOf(myList); 
    }
}