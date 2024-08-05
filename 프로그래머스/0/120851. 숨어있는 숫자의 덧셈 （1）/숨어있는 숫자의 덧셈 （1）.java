class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]","");
        String[] s = my_string.split("");
        int answer = 0;
        for(String i : s) {
            answer += Integer.parseInt(i);
        }
        return answer;
    }
}