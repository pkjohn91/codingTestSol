import java.lang.StringBuffer;

class Solution {
    public String solution(int q, int r, String code) {

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < code.length(); i++) {
            if(i%q == r) sb.append(code.charAt(i));
        }
        
        return sb.toString();
    }
}