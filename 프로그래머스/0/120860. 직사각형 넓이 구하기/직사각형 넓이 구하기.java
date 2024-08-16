class Solution {
    /*
     * 각 변의 길이는 가장 큰 값에서 가장 작은 값을 빼면 됌.
     */
    public int solution(int[][] dots) {
        int answer = 0;
        int x = dots[0][0];
        int y = dots[0][1];
        int width = 0;
        int height = 0;
        
        for (int i = 0; i < dots.length; i++) {
            if (x != dots[i][0]) width = Math.abs(x - dots[i][0]);
            if (y != dots[i][1]) height = Math.abs(y - dots[i][1]);
        }
        
        answer = width * height;
        return answer;
    }
}