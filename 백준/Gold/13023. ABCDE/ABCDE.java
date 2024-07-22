import java.util.*;
import java.io.*;

public class Main {
    static boolean[] visited; // 방문 체크 배열
    static ArrayList<Integer>[] a; // 인접리스트
    static boolean arrive; // 도착 확인
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); // 사람 수(노드)
        int m = Integer.parseInt(st.nextToken()); // 관계 수(에지)
        
        // 인접리스트, 방문 체크 배열 초기화
        a = new ArrayList[n];
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            a[i] = new ArrayList<Integer>();
        }
        
        // 인접리스트 대입
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            
            a[s].add(e);
            a[e].add(s);
        }
        
        // dfs
        for(int i = 0; i < n; i++) {
            dfs(i, 1); // depth 1부터 시작
            if(arrive) break; // dfs에 의해 depth가 5까지 진행됐다면
        }
        
        if(arrive) {System.out.println("1");} else {System.out.println("0");}
    }
    
    private static void dfs(int now, int depth) {
        if(depth == 5 || arrive) { // 만약 현재 depth가 5라면 종료
            arrive = true;
            return;
        }
        visited[now] = true;
        
        // 모든 노드에 대해 탐색
        for(int i : a[now]) {
            if(!visited[i]) { // 현재 노드를 방문하지 않았더라면
                dfs(i, depth + 1); // depth 1씩 증가
            }
        }
        visited[now] = false;
    }
}