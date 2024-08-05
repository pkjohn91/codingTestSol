import java.util.*;
/*
 * 네 가지 그룹으로 분류 : 1보다 큰 자연수, 1의 개수, 0의 개수, 음수
 * 음수는 음수끼리 곱하면 양수가 된다. 또한 0과 곱해서 0으로 최대한 만듬
 */
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    //초기화
	    PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순
	    PriorityQueue<Integer> minusPq = new PriorityQueue<>(); // 올림차순
	    int one = 0;
	    int zero = 0;
	    
	    // 저장
	    for(int i = 0; i < n; i++) {
	        int in = sc.nextInt();
	        if(in > 1) {
	            plusPq.add(in);
	        } else if(in == 1) {
	            one++;
	        } else if(in == 0) {
	            zero++;
	        } else {
	            minusPq.add(in);
	        }
	    }
	    
	    // 양수 처리
	    int sum = 0;
	    while(plusPq.size() > 1) {
	        int first = plusPq.poll();
	        int second = plusPq.poll();
	        sum += first * second;
	    }
	    if(!plusPq.isEmpty()) sum += plusPq.poll();
	    
	    // 음수 처리
	    while(minusPq.size() > 1) {
	        int first = minusPq.remove();
	        int second = minusPq.remove();
	        sum += first * second;
	    }
	    if(!minusPq.isEmpty()) {
	        if(zero == 0) {
	            sum += minusPq.remove();
	        }
	    }
	    
	    // 1 처리
	    sum += one;
	    System.out.println(sum);
	}
}
