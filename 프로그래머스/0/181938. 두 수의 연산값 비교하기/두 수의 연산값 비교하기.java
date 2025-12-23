class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str = String.valueOf(a) + String.valueOf(b);
        int sum = Integer.parseInt(str);
        int multiply = 2*a*b;
        if (sum >= multiply) {
            answer = sum;
        } else {
            answer = multiply;
        }
        return answer;
    }
}