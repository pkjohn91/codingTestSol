class Solution {
    /*
     * 제한사항에 이미 n의 범위를 정해줬으므로 최대 10!이 끝이다..
     * 나는 이것을 응용할 생각을 못했다..
     */
    
    public int solution(int n) {
        if(n == 1) return 1;
        int ans = 0;
        int factorial = 1;
        for (int i = 2; i <= 10; i++) {
            factorial *= i;
            if (factorial == n) {
                ans = i;
                break;
            } else if (n < factorial) {
                ans = i - 1;
                break;
            }
        }
        return ans;
    }
}