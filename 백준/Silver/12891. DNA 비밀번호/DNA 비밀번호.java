import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int validateNum;
    static int[] arr;
    static int[] checkArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] pwArr = br.readLine().toCharArray();
        arr = new int[4];
        checkArr = new int[4]; // 확인해야 할 A, C, G, T 카운트 배열
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == 0) validateNum++;
        }

        // 초기 P 부분
        int count = 0;
        for (int i = 0; i < P; i++) {
            add(pwArr[i]);
        }
        if (validateNum == 4) {
            count++;
        }

        // 슬라이딩 윈도우
        for (int i = P; i < S; i++) {
            int j = i - P;
            add(pwArr[i]);
            remove(pwArr[j]);
            if (validateNum == 4) count++;
        }

        System.out.println(count);
        br.close();
    }

    private static void add(char c) {
        switch (c) {
            case 'A' :
                checkArr[0]++;
                validateNum += (arr[0] == checkArr[0]) ? 1 : 0;
                break;
            case 'C' :
                checkArr[1]++;
                validateNum += (arr[1] == checkArr[1]) ? 1 : 0;
                break;
            case 'G' :
                checkArr[2]++;
                validateNum += (arr[2] == checkArr[2]) ? 1 : 0;
                break;
            case 'T' :
                checkArr[3]++;
                validateNum += (arr[3] == checkArr[3]) ? 1 : 0;
                break;
            default: break;
        }
    }
    
    private static void remove(char c) {
        switch (c) {
            case 'A' :
                validateNum += (arr[0] == checkArr[0]) ? -1 : 0;
                checkArr[0]--;
                break;
            case 'C' :
                validateNum += (arr[1] == checkArr[1]) ? -1 : 0;
                checkArr[1]--;
                break;
            case 'G' :
                validateNum += (arr[2] == checkArr[2]) ? -1 : 0;
                checkArr[2]--;
                break;
            case 'T' :
                validateNum += (arr[3] == checkArr[3]) ? -1 : 0;
                checkArr[3]--;
                break;
            default: break;
        }
    }
}