class Solution {
    public String solution(String my_string, int[] index_list) {
        char[] ch = my_string.toCharArray();
        String answer = "";
        for (int i : index_list) {
            answer += String.valueOf(ch[i]);
        }
        return answer;
    }
}