import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());// N 번호 바구니
        int M = Integer.parseInt(st.nextToken());// M번 바꿈
        
        int[] arr = new int[N+1]; // 1-N 번호 바구니
        for(int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
        
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }
        
        br.close();
        
        for(int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}