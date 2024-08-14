import java.util.*;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        String answer = "";
        String[] s = my_string.split("");
        Arrays.sort(s);
        for(String str : s) {
            answer += str;
        }
        return answer;
    }
}