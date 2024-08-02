class Solution {
    /*
     * 합성수: 약수의 개수가 3개 이상인 수, 소수가 아닌 수
     * 약수의 개수가 3개 이상이 되려면.. 4부터 시작해도 됌.
     * 또한 예시에서 15 이하의 자연수는 8개라고 함..
     */
    public int solution(int n) {
        int answer = 0;
        int tmp = n;
        // 합성수 구하기
        for(int i = 4; i <= n; i++) {
            if(!isPrime(i)) answer++;
        }
        return answer;
    }
    
    private static boolean isPrime(int n) {
        if(n <= 1) return false; // 1이하의 수는 소수가 아님
        if(n == 2) return true; // 2는 소수
        if(n % 2 == 0) return false; // 짝수는 소수가 아님
        for(int i = 3; i <= Math.sqrt(n); i += 2) { // 홀수로 나누어 떨어지는 지 확인
            if(n%i==0) return false;
        }
        return true;
    }
}