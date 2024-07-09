import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 바구니 개수
        int M = Integer.parseInt(st.nextToken()); // 역순 바꿀 횟수
        int[] basket = new int[N+1];
        // 바구니 번호 새기기
        for(int i = 1; i < basket.length; i++) {
            basket[i] = i;
        }
        // 역순
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            
            while(start < end) {
                int tmp = basket[start];
                basket[start++] = basket[end];
                basket[end--] = tmp;
            }
        }
        br.close();
        for(int i = 1; i < basket.length; i++) {
            System.out.print(basket[i]+" ");
        }
    }
}