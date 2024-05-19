class Solution {
    public int[] solution(int[] num_list, int n) {
        int l = 0;
        if(num_list.length % n == 0) {
            l = num_list.length/n;
        }
        else {
            l = num_list.length/n + 1;
        }
        int[] answer = new int[l];
        int idx = 0;
        for(int i = 0; i < num_list.length; i+=n) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}