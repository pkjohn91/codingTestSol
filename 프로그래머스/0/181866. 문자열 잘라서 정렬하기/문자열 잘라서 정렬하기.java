import java.util.*;

class Solution {
    public String[] solution(String myString) {
        StringTokenizer st = new StringTokenizer(myString, "x");
        String[] answer = new String[st.countTokens()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = st.nextToken();
        }
        Arrays.sort(answer);
        return answer;
    }
}