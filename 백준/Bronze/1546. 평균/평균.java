import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        long max = 0;
        long sum = 0;
        
        for(int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            //max값 찾기
            if(temp > max) max = temp;
            sum = sum + temp;
        }
        
        System.out.println(sum*100.0/max/N);
    }
}