import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(str.substring(i, i+1));
        }
        
        for (int i = 0; i < str.length(); i++) {
            int max = i;
            for(int j = i+1; j < str.length(); j++) {
                if(arr[j]>arr[max]) {
                    max = j;
                }
            }
            if(arr[i] < arr[max]) {
                int tmp = arr[i];
                arr[i] = arr[max];
                arr[max] = tmp;
            }
        }
        
        for(int k : arr) {
            System.out.print(k);
        }
    }
}