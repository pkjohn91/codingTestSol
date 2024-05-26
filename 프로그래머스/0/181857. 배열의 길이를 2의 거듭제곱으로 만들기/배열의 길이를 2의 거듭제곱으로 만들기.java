import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len = arr.length;
        int tLen = 1;
        int pow = 0;
        
        while (len > tLen) {
            tLen *= 2;
        }
        
        answer = new int[tLen];
        Arrays.fill(answer, 0);
        System.arraycopy(arr, 0, answer, 0, len);
        
        return answer;
    }
}