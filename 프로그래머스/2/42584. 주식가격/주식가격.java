import java.util.*;

class Solution {    
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stk = new Stack<>();
        
        for(int i = 0; i < prices.length; i++) {
            while(!stk.isEmpty() && prices[i] < prices[stk.peek()]) {
                answer[stk.peek()] = i - stk.pop(); 
            }
            stk.push(i);
        }
        
        // 스택에 있는 값(시점/시간) 넣기
        while(!stk.isEmpty()) {
            answer[stk.peek()] = prices.length - stk.pop() - 1;
        }
        return answer;
    }
}