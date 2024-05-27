class Solution {
    public int solution(int[][] arr) {
        boolean result = true;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i][j] != arr[j][i]) result = false;
            }
        }
        return !result ? 0 : 1;
    }
}