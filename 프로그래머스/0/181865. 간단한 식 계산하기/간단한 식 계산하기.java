class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        
        return switch (arr[1]) {
            case "+" -> a + b;
            case "-" -> a - b;
            default -> a * b;
        };
    }
}