class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int sum = 0;
        for(int s : arr) {
            sum += s;
        }
        answer = new int[sum];
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            for(int j = 0; j < tmp; j++) {
                answer[idx++] = tmp;
            }
        }
        return answer;
    }
}