class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] a = my_string.split("");
        String tmp = a[num1];
        a[num1] = a[num2];
        a[num2] = tmp;
        for(String s : a) {
            answer += s;
        }
        return answer;
    }
}