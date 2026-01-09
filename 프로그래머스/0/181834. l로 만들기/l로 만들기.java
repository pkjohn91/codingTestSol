class Solution {
    public String solution(String myString) {
        char[] arr = myString.toCharArray();
        int lAsciiNum = 108;
        
        for (int i = 0; i < arr.length; i++) {
            int arrAsciiNum = (int) arr[i];
            if (lAsciiNum > arrAsciiNum) {
                arr[i] = (char) lAsciiNum;
            }
        }
        
        String answer = "";
        for (char c : arr) {
            answer += String.valueOf(c);
        }
        
        return answer;
    }
}