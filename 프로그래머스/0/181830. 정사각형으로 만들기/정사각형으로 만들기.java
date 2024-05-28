class Solution {
    public int[][] solution(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] answer;
        if(rows >= cols) {
            answer = new int[rows][rows];
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        } else {
            answer = new int[cols][cols];
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        
        return answer;
    }
}