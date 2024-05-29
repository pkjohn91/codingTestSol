import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 노드 수
        int M = Integer.parseInt(st.nextToken()); // 간선 수
        visited = new boolean[N+1]; // 1부터 사용, 방문체크 배열
        A = new ArrayList[N+1]; // 1부터 사용, 노드 배열
        // 인접 리스트 생성
        for(int i = 1; i < N+1; i++) {
            A[i] = new ArrayList<>(); 
        }
        // 인접 리스트 간선 수
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); // 시작점
            int e = Integer.parseInt(st.nextToken()); // 종료점
            // 그래프가 양방향
            A[s].add(e);
            A[e].add(s);
        }
        int cnt = 0;
        for(int i = 1; i < N+1; i++) {
            if(!visited[i]) {
                cnt++;
                DFS(i);
            }
        }
        System.out.println(cnt);
    }
    
    private static void DFS(int v) {
        if(visited[v]) {return;}
        visited[v] = true;
        for(int i : A[v]) {
            if(!visited[i]) {
                DFS(i);
            }
        }
    }

}