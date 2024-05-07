import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); // 갑옷 재료 갯수
        int[] a = new int[N];
        int M = Integer.parseInt(br.readLine()); // 합성 갯수
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        
        int f = 0; // 시작포인터
        int e = N-1; // 끝포인터
        int cnt = 0; // 갑옷 갯수
        while(f < e) {
            if (a[f] + a[e] > M) e--;
            else if(a[f] + a[e] < M) f++;            
            else {
                cnt++;
                f++;
                e--;
            }
        }
        System.out.println(cnt);
    }
}