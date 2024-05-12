import java.util.Scanner;
import java.lang.StringBuffer;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        
        // 수열 체크
        Stack<Integer> stk = new Stack<>();
        int num = 1; // 오름차순
        boolean result = true; // 수열을 표현할 수 없다면 false
        StringBuffer sb = new StringBuffer(); // 출력
        
        for(int i = 0; i < a.length; i++) {
            int temp = a[i];
            if(temp >= num) { // 배열값(입력값)이 현재오름차순보다 크다면
                while(temp >= num) {
                    stk.push(num++); // 자연수 num값 대입 후, 증가
                    sb.append("+\n");
                }
                stk.pop();
                sb.append("-\n");
            }
            else { // 값이 같지 않을 경우                
                int n = stk.pop();
                if(n > temp) { // 수열값이 현재오름차순보다 작다면
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else {
                    sb.append("-\n");
                }
            }
        }
        
        if(result) System.out.println(sb.toString());
    }
}