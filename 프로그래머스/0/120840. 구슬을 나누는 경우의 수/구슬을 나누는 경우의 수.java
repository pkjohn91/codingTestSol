class Solution {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }
    
    public static int combination(int n, int m) {
        // Base Case : 공유할 구슬이 없거나 구슬의 개수와 같다면
        if(n == m || n == 1 || m == 0) {
            return 1; // 경우의 수
        }
        return combination(n-1, m-1) + combination(n-1, m);
    }
}