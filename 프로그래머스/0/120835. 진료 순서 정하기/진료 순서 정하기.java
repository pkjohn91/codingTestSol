import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                // 숫자가 높아야 순서가 빠르다!
                if(emergency[i] < emergency[j]) answer[i]++;
            }
            // 인덱스는 0부터 시작이므로 한번 더
            answer[i]++;
        }
        return answer;
    }
}