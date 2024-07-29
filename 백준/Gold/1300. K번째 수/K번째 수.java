import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        long start = 1, end = k;
        long ans = 0;
        // 이진 탐색
        while(start <= end) {
            // 중앙값 = (start+end) / 2
            long mid = (start+end)/2;
            // 각 행마다 중앙값 - start (단 <=n 이어야함)
            long cnt = 0; // 중앙값보다 작은 수의 개수
            for(int i = 1; i <= n; i++) {
                cnt += Math.min((mid/i), n); // 각 행이 n보다 클 수가 없으므로
            }
            // 각 행 개수 총합해서 k값과 비교
            // <= k라면 start = 중앙값 + 1
            if(cnt < k) {
                start = mid + 1;
            } else {
                ans = mid; // 현재 단계의 중앙값을 정답 변수에 저장
                end = mid - 1;
            }
        }
        System.out.println(ans);
    }
}