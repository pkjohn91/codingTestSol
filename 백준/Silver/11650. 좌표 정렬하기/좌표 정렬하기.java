import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] xyArr = new int[N][2];
        
        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            xyArr[i][0] = Integer.parseInt(st.nextToken());
            xyArr[i][1] = Integer.parseInt(st.nextToken());            
        }
        
        Arrays.sort(xyArr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });
        
        for(int i = 0; i < xyArr.length; i++) {
            System.out.println(xyArr[i][0] + " " + xyArr[i][1]);
        }
    }
}