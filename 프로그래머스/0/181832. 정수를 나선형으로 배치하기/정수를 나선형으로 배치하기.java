class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int rowStart = 0; //행 시작 인덱스
        int rowEnd = n - 1; //행 끝 인덱스
        int colStart = 0; //열 시작 인덱스
        int colEnd = n - 1; //열 끝 인덱스
        int num = 1; // 대입값
        
        while(num <= n*n) {
            //왼쪽 -> 오른
            for(int i = colStart; i <= colEnd; i++) {
                answer[rowStart][i] = num++;
            }
            rowStart++;
            //오른-위 -> 오른-아래
            for(int i = rowStart; i <= rowEnd; i++) {
                answer[i][colEnd] = num++;
            }
            colEnd--;
            //아래-오른 -> 아래-왼
            for(int i = colEnd; i >= colStart; i--) {
                answer[rowEnd][i] = num++;
            }
            rowEnd--;
            //아래-왼 -> 위-오른
            for(int i = rowEnd; i >= rowStart; i--) {
                answer[i][colStart] = num++;
            }
            colStart++;
        }
        return answer;
    }
}