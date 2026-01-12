import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    static int[][] A, D;
    public static void main(String[] args) throws IOException{
        /**
         * 구간 합
         * M이 100,000 이므로 각 배열의 구간 합을 함께 만든다.
         * 
         * ex) 원본 배열 (2,2)부터 (3,4)까지의 합 -> D[3][4] - D[2][4] - D[3][3] + D[2][3]
         * -> D[i][j] - D[i][j-1] - D[i-1][j] + D[i-1][j-1]
         * -> D[i][j] = D[i-1][j] + D[i][j-1] - D[i-1][j-1] + A[i][j]
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 원본 배열 저장: A[N+1][N+1] -> N과 인덱스와 혼동하지 않기 위함
        A = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 합 배열 저장: D[N+1][N+1]
        D = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                D[i][j] = D[i-1][j] + D[i][j-1] - D[i-1][j-1] + A[i][j];
            }
        }

        // 합 구하기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int sum = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];
            System.out.println(sum);
        }
    }
}