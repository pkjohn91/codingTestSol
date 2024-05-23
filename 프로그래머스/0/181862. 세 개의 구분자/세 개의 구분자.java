import java.util.*;

class Solution {
    public List solution(String myStr) {
        List<String> answer = new ArrayList<>();
        String tmp = "";
        for(int i = 0; i < myStr.length(); i++) {
            char ch = myStr.charAt(i);
            if(ch == 'a' || ch == 'b' || ch == 'c') {
                if(tmp != "") {
                    answer.add(tmp);
                    tmp = "";
                }
            } else {
                tmp += ch;
            }
        }
        if(tmp != "") {
            answer.add(tmp);
            tmp = "";
        }
        if(answer.size() == 0) answer.add("EMPTY");
        return answer;
    }
}