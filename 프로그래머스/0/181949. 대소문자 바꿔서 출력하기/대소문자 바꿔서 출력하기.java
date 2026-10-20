import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String ans = "";
        char ch;
        
        for (int i = 0; i < a.length(); i++) {
            ch = a.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                ans += Character.toLowerCase(ch);
            } else {
                ans += Character.toUpperCase(ch);
            }
        }
        
        System.out.println(ans);
    }
}