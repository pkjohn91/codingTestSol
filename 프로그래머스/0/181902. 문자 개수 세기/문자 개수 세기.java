class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                answer[ch - 'A']++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                answer[26 + ch - 'a']++;
            }
        }
        return answer;
    }
}