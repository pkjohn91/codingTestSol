import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> que = new LinkedList<>(); //작업일 수
        List<Integer> list = new ArrayList<>();
        //작업일 수
        for(int i = 0; i < speeds.length; i++) {
            if((100 - progresses[i]) % speeds[i] != 0) {
                que.add((100 - progresses[i]) / speeds[i] + 1);
            } else {
                que.add((100 - progresses[i]) / speeds[i]);
                
            }
        }
        int complete = que.poll();
        int cnt = 1;
        while(!que.isEmpty()) {
            if(complete >= que.peek()) {
                cnt++;
                que.poll();
            } else {
                list.add(cnt);
                cnt = 1;
                complete = que.poll();
            }
        }
        list.add(cnt);
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}