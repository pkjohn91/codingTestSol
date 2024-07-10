class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for(int i = arr.length-1; i >= 0; i--) {
            answer += arr[i];
        }
        return answer;
    }
}