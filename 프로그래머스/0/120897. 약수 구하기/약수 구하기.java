import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                ans.add(i);
            }
        }
        
        int[] answer = new int[ans.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}