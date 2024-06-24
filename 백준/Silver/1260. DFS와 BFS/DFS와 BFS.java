import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited; // 체크 배열
    static int[][] arr; // 인접 행열
    static int N, M, V; // 노드 수, 간선 수, 시작 번호
    static StringBuffer sb = new StringBuffer();
    static Queue<Integer> que = new LinkedList<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        
        arr = new int[N+1][N+1];
        visited = new boolean[N+1];
        
        //간선수
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            // 양방향 그래프
            arr[s][e] = arr[e][s] = 1;
        }
        br.close();
        
        dfs(V);
        sb.append("\n");
        
        visited = new boolean[N+1];
        bfs(V);
        
        System.out.println(sb);
    }
    
    private static void dfs(int v) {        
        visited[v] = true;
        sb.append(v + " ");
        for(int i = 0; i <= N; i++) {
            if(!visited[i] && arr[v][i] == 1) {
                dfs(i);
            }
        }
    }
    
    private static void bfs(int v) {
        que.offer(v);
        visited[v] = true;
        
        while(!que.isEmpty()) {
            v = que.poll();
            sb.append(v + " ");
            for(int i = 1; i <= N; i++) {
                if(arr[v][i] == 1 && !visited[i]) {
                    que.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}