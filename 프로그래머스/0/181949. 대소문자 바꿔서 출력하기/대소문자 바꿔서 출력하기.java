import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] ch = a.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < ch.length; i++) {
            String tmp = String.valueOf(ch[i]);
            if (tmp.equals(tmp.toUpperCase())) {
                sb.append(tmp.toLowerCase());
            } else {
                sb.append(tmp.toUpperCase());
            }
        }
        
        System.out.println(sb);
    }
}