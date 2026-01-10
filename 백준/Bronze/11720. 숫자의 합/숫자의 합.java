import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // nextInt()는 숫자만 받고 \n를 버리고 return
        
        String str = sc.next(); // nextLine()를 쓰면 그 전에 숫자 입력값+\n(개행)을 받았기 때문에 \n이 포함되서 바로 종료됌
        char[] arr = str.toCharArray();
        
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i] - '0';
        }
        
        System.out.println(sum);
    }
}