import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int idx = sc.nextInt();
        sc.nextLine();
        System.out.println(s.substring(idx-1, idx));
    }
}