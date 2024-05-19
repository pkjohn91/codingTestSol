class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        int idx = 0;
        
        while(sum <= n) {
            sum += numbers[idx++];
        }
        
        return sum;
    }
}