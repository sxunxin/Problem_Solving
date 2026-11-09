class Solution {
    public String solution(String my_string, int s, int e) {
        char[] myList = my_string.toCharArray();
        
        for (int i = s, j = e; i < j; i++, j--) {
                char temp = myList[i];
                myList[i] = myList[j];
                myList[j] = temp;
            }
        
        return String.valueOf(myList);
    }
}