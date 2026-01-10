import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        String str = sc.next();
        char[] arr = str.toCharArray();
        
        int sum = 0;
        for (char c : arr) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        
        System.out.printf("%d", sum);
    }
}