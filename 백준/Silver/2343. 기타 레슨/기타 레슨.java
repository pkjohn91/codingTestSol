import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] a = new int[n];
        int start = 0;
        int end = 0;
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(start < a[i]) start = a[i]; // 시작 인덱스 = 레슨 최댓값
            end = end + a[i]; // 종료 인덱스 = 모든 레슨의 총합
        }
        while(start <= end) {
            int mid = (start+end)/2;
            int sum = 0;
            int cnt = 0; // 블루레이 개수
            for(int i = 0; i < n; i++) {
                if(sum + a[i] > mid) {
                    cnt++;
                    sum = 0;
                }
                sum = sum + a[i];
            }
            if(sum != 0) cnt++;
            if(cnt > m) start = mid + 1;
            else end = mid - 1;
        }
        System.out.println(start);
    }
}