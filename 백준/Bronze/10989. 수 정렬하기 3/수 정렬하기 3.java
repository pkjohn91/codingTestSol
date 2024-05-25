import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 배열 인덱스를 이용한 정렬 방법
        int[] cnt = new int[10001]; // 1에서부터 시작
        
        for(int i = 0; i < N; i++) {
            cnt[Integer.parseInt(br.readLine())]++; // 중복카운트
        }
        br.close();
        StringBuffer sb = new StringBuffer();
        for(int i = 1; i < cnt.length; i++) {
            while(cnt[i] > 0) {
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        
        System.out.println(sb);
    }
}