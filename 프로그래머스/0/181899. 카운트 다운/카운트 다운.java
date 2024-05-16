class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start-end+1];
        int data = start;
        for(int i = 0; i < answer.length; i++) {
            answer[i] = data--;
        }
        return answer;
    }
}