import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(s, e+1);
        StringBuffer sb = new StringBuffer(answer);
        String reverse = sb.reverse().toString();
        
        my_string = my_string.replace(answer, reverse);
        
        
        return my_string;
    }
}