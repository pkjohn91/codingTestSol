import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static int[] myArr = new int[4]; // 현재 상태 배열
    static int[] chkArr = new int[4]; // 체크 배열
    static int chksecret = 0; // 체크 만족 카운트
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0; // 반환값
        int s = Integer.parseInt(st.nextToken()); // 입력문자열 길이
        int p = Integer.parseInt(st.nextToken()); // 부분문자열 길이     
        // 입력 문자열
        char[] a = new char[s]; // 입력 문자열
        a = br.readLine().toCharArray();
        
        // 체킹해야할 숫자 배열 받기
        st = new StringTokenizer(br.readLine());        
        for(int i = 0; i < 4; i++) {
            chkArr[i] = Integer.parseInt(st.nextToken());
            if(chkArr[i] == 0) {
                chksecret++;
            }
        }        
        // 처음 부분문자열 체크
        for(int i = 0; i < p; i++) {
            Add(a[i]);
        }
        // 처음 돌렸는데 chksecret이 4라면(=현재 상태를 모두 만족한다면)
        if(chksecret == 4)result++;
        // 슬라이딩윈도우
        for(int i = p; i < s; i++) {
            int j = i - p; // 슬라이딩윈도우 앞부분
            Add(a[i]);
            Remove(a[j]);
            if(chksecret == 4) result++;
        }
        System.out.println(result);
        br.close();
    }
    
    private static void Add(char c) {
        switch(c) {
            case 'A':
                myArr[0]++;
                if(myArr[0] == chkArr[0]) chksecret++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == chkArr[1]) chksecret++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == chkArr[2]) chksecret++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == chkArr[3]) chksecret++;
                break;
        }
    }
    
    private static void Remove(char c) {
        switch(c) {
            case 'A':
                if(myArr[0] == chkArr[0]) chksecret--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == chkArr[1]) chksecret--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == chkArr[2]) chksecret--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == chkArr[3]) chksecret--;
                myArr[3]--;
                break;
        }
    }
}