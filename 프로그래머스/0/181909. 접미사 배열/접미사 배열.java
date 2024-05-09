import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for(int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer); //오름차순 정렬 사용
        return answer;
    }
}