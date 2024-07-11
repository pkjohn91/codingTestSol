import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] a = new int[n+1];

        br.close();
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