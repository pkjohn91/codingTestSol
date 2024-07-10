import java.util.Scanner;

public class Main {
    static int answer = 0;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split("-");
        
        for(int i = 0; i < str.length; i++) {
            int temp = mySum(str[i]);
            if(i == 0) answer = answer + temp;
            else answer = answer - temp;
        }
        
        System.out.println(answer);
    }
    
    private static int mySum(String s){
        int sum = 0;
        String[] str = s.split("[+]"); // +는 split할때 인식을 잘 못해서 정규표현식으로 적음
        for(int i = 0; i < str.length; i++) {
            sum = sum + Integer.parseInt(str[i]);
        }
        return sum;
    }
}