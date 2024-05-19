import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")) {
                return Arrays.copyOf(str_list, i);
            }
            else if(str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i+1, str_list.length);
            }
        }
        return answer;
    }
}