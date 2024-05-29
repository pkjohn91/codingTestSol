import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[4];
        for(int i = 0; i < answers.length; i++) {
            if(one[i % 5] == answers[i]) score[1]++;
            if(two[i % 8] == answers[i]) score[2]++;
            if(three[i % 10] == answers[i]) score[3]++;
        }
        // 오름차순 정렬
        List<Integer> list = new ArrayList<>();
        int maxScore = Math.max(score[1], Math.max(score[2], score[3]));
        
        for(int i = 1; i <= 3; i++) {
            if(maxScore == score[i]) {
                list.add(i);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}