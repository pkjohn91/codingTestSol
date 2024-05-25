import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int[] answer;
        for(int i = 0; i < arr.length; i++) {
            if(stk.isEmpty()) {
                stk.add(arr[i]);
            }
            else if(!stk.isEmpty() && stk.get(stk.size()-1) == arr[i]) {
                stk.remove(stk.size()-1);
            }
            else if(!stk.isEmpty() && stk.get(stk.size()-1) != arr[i]) {
                stk.add(arr[i]);
            }
        }

        answer = new int[stk.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = stk.get(i);
        }
        
        if(answer.length == 0) answer = new int[]{-1};
        return answer;
    }
}