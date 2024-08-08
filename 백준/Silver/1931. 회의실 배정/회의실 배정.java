import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(); // 회의 개수
	    // 회의 데이터 저장
	    int[][] a = new int[n][2]; // 회의 데이터 배열
	    for (int i = 0;  i < n; i++) {
	        a[i][0] = sc.nextInt();
	        a[i][1] = sc.nextInt();
	    }
	    // 조건 정렬
	    Arrays.sort(a, new Comparator<int[]>() {
	        @Override
	        public int compare(int[] s, int[] e) {
	            if(s[1] == e[1]) { // 종료 시간이 같을 때 시작 시간 기준 정렬
	                return s[0] - e[0];
	            }
	            return s[1] - e[1]; // 종료 시간 기준 정렬
	        }
	    });
	    // 겹치지 않는 것 찾기
	    int cnt = 0;
	    int end = -1;
	    for (int i = 0; i < n; i++) {
	        if (a[i][0] >= end) { // 겹치지 않는 다음 회의가 나온 경우
	            end = a[i][1]; // 종료 시간 업데이트
	            cnt++;
	        }
	    }
	    System.out.println(cnt);
	}
}
