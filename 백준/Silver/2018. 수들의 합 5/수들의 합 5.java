import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int cnt = 1;
        int sum = 1;
        int startidx = 1;
        int endidx = 1;
        
        while(endidx != N) {
            if(sum == N) {
                cnt++;
                endidx++;
                sum = sum + endidx;
            }
            else if(sum > N) {
                sum = sum - startidx;
                startidx++;
            }
            // sum < N
            else {
                endidx++;
                sum = sum + endidx;
            }
        }
        System.out.println(cnt);
    }
}