import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        // 내림차순
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        // 요소 추가
        for(int i : priorities) {
            pQ.offer(i);
        }
        
        while(!pQ.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if(pQ.peek() == priorities[i]) {
                    pQ.poll();
                    answer++;
                    
                    if(location == i) return answer;
                }
            }
        }
        return answer;
    }
}