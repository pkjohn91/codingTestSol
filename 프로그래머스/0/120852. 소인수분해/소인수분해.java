import java.util.*;

class Solution {
    /*
     * 소인수분해: 어떤 수를 소수들의 곱으로 표현하는 것
     * 일의 자리 소수 : 2, 3, 5, 7
     */
    public int[] solution(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] answer = {};
        
        for(int i = 2; i <= n; i++) {
            if(n%i == 0) {
                while(n%i==0) {
                    n /= i;
                }
                ans.add(i);
            }
        }
        
        answer = new int[ans.size()];
        int idx = 0;
        for(int i : ans) {
            answer[idx++] = i;
        }
        Arrays.sort(answer);
        return answer;
    }
}