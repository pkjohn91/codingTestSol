class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        int k = num_list.length / n;
        int idx = 0;
        answer = new int[k][n];
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = num_list[idx++];
            }
        }
        return answer;
    }
}