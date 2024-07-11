import java.util.*;

class Main {
	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int[] a = new int[n+1];

        // 배열 초기화
        for(int i = 2; i <= n; i++) {
            a[i] = i;
        }
        
        // 소수 판별
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(a[i] == 0) continue;
            for(int j = i+i; j <= n; j=j+i) {
                a[j] = 0;
            }
        }
        
        // 출력
        for(int i = m; i <= n; i++) {
            if(a[i] != 0) {
                System.out.println(a[i]);
            }
        }
	}
}