import java.util.*;
import java.io.*;

public class Main {
    
    static ArrayList<Integer>[] a; // 인접 리스트
    static int[] check; // 이분 그래프 집합(1, 0)
    static boolean[] visited; // 방문 체크
    static boolean isEven; // 이분 그래프 확인용

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int testCase = Integer.parseInt(br.readLine());
	    
	    for(int t = 0; t < testCase; t++) {
	        String[] s = br.readLine().split(" ");
	        int v = Integer.parseInt(s[0]); // 노드 개수
	        int e = Integer.parseInt(s[1]); // 에지 개수
	        a = new ArrayList[v+1]; // 인접리스트 초기화
	        check = new int[v+1]; // 이분 그래프 체크 초기화
	        visited = new boolean[v+1]; // 방문 체크 초기화 
	        isEven = true;
	        
	        for(int i = 1; i <= v; i++) {
	            a[i] = new ArrayList<Integer>();
	        }
	        
	        // 에지 데이터 저장
	        for(int i = 0; i < e; i++) {
	            s = br.readLine().split(" ");
	            int start = Integer.parseInt(s[0]);
	            int end = Integer.parseInt(s[1]);
	            // 방향 없는 그래프(=양방향 그래프)
	            a[start].add(end);
	            a[end].add(start);
	        }
	        
	        // 모든 노드에서 dfs 실행
	        for(int i = 1; i <= v; i++) {
	            if(isEven) {
	                dfs(i);
	            } else {
	                break;
	            }
	        }
	        
	        // 출력
	        if(isEven) {System.out.println("YES");}
	        else {System.out.println("NO");}
	    }
	}
	
	private static void dfs(int start) {
	    visited[start] = true;
	    for(int i : a[start]) { // 인접 리스트로 받아서 start로부터 연결된 모든 노드 탐색
	        if(!visited[i]) { // 현재 시작해야할 노드가 방문하지 않았다면
	            // 그 전 노드와 다른 집합인 지 체크
	            // 직전에 1(이미 탐색)이였다면, 1이 더해지면서 2로 나눈 나머지 0
	            check[i] = (check[start] + 1) % 2; 
	            dfs(i);
	        } else if (check[start] == check[i]) { // 현재 노드(check[start])가 직전에 방문한 노드(check[i])와 같다면
	            isEven = false;
	        }
	    }
	}
}
