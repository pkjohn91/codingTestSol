class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        //각 자릿수 sum 구하기
        for(int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            sum += Integer.parseInt(String.valueOf(ch));
        }

        answer = sum % 9;
        return answer;
    }
}