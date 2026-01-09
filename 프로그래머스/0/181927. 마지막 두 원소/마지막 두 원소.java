import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        
        int lastVal = num_list[num_list.length-1];
        int preLastVal = num_list[num_list.length-2];
        if (num_list[num_list.length-1] > num_list[num_list.length-2]) {
            answer[answer.length-1] = lastVal - preLastVal;
        } else {
            answer[answer.length-1] = lastVal * 2;
        }
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}