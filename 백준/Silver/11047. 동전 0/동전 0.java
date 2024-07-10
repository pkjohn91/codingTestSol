import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    int[] a = new int[n];
	    
	    for(int i = 0; i < n; i++) {
	        a[i] = sc.nextInt();
	    }
	    
	    int cnt = 0; // 사용한 동전 수
	    for(int i = n-1; i >= 0; i--) {
	        if(a[i] <= k) {
	            cnt += k / a[i];
	            k = k % a[i];
	        }
	    }
	    System.out.println(cnt);
	}
}