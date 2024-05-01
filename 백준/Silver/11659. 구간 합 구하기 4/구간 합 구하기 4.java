import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        //숫자 갯수
        int N = Integer.parseInt(st.nextToken());
        //질의 갯수
        int M = Integer.parseInt(st.nextToken());
        //합배열
        long[] s = new long[N+1];
        st = new StringTokenizer(br.readLine());
        
        for(int i = 1; i <= N; i++) {
            s[i] = s[i-1] + Integer.parseInt(st.nextToken());
        }
        //질의 계산
        for(int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            System.out.println(s[l] - s[k-1]);
        }
    }
}