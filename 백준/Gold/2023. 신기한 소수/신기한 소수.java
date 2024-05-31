import java.io.*;
import java.lang.StringBuffer;
public class Main {
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        getSolution(0, N);
        System.out.println(sb);
    }
    private static void getSolution(int output, int n) {
        if(n == 0) {
            if(isPrime(output)) sb.append(output).append("\n");
            return;
        }
        for(int i = 0; i < 10; i++) {
            int next = output * 10 + i;
            if(isPrime(next)) getSolution(next, n-1);
        }
    }
    
    private static boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i = 2; i*i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}