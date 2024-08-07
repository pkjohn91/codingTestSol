import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split("");
        
        Arrays.sort(a);
        
        for(int i = 0; i < a.length; i++) {
            int cnt = 0;
            for(int j = 0; j < a.length; j++) {
                if(a[i].equals(a[j])) {
                    cnt++;
                }
            }
            if(cnt == 1) answer += a[i];
        }
        return answer;
    }
}