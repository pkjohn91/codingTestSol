import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();        
        int[] arr = new int[N];
        
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        long max = 0;
        long sum = 0;
        
        for(int i = 0; i < N; i++) {
            //max찾기
            if(arr[i] > max) max = arr[i];
            sum = sum + arr[i];
        }
        
        System.out.println(sum*100.0/max/N); //소숫점을 붙여주면 자동적으로 더블형으로 바꿔준다.
    }
}