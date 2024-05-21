import java.util.StringTokenizer;

class Solution {
    public String[] solution(String my_string) {
        String[] answer;
        StringTokenizer st = new StringTokenizer(my_string);
        answer = new String[st.countTokens()];
        int idx = 0;
        while(st.hasMoreTokens()) {
            answer[idx++] = st.nextToken();
        }
        return answer;
    }
}