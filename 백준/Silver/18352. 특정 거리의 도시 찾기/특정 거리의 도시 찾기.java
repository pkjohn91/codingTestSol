import java.util.*;

public class Main {
 
    static int n,m,k,x;
    static int visited[];
    static ArrayList<Integer>[] graph;
    static List<Integer> ans = new ArrayList<>();
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        n = sc.nextInt(); // 노드 수
        m = sc.nextInt(); // 간선 수
        k = sc.nextInt(); // 목표 거리
        x = sc.nextInt(); // 시작점
        
        // 인접 리스트 초기화
        graph = new ArrayList[n+1];
        for (int i=1; i<=n; i++){
            graph[i] = new ArrayList<Integer>();
        }
 
        for (int i=1; i<=m; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            graph[s].add(e);
        }
 
        visited = new int[n+1]; // 방문 배열 초기화
        for(int i=0; i<=n; i++){
            visited[i] = -1;
        }
        bfs(x);
 
        for (int i=0; i<=n; i++){
            if(visited[i]==k){
                ans.add(i);
            }
        }
 
        if (ans.isEmpty()) {
            System.out.println("-1");
        } else{
            Collections.sort(ans);
            for (int temp : ans){
                System.out.println(temp);
            }
        }
    }
 
    private static void bfs(int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node]++; // visited 배열에 현재 노드 방문 기록하기
        while (!queue.isEmpty()) {
            int now_node = queue.poll();
 
            for (int destination : graph[now_node]){
                // 큐에 데이터 삽입하고 visited 배열에 방문 거리 기록
                if (visited[destination]==-1){ 
                    visited[destination] = visited[now_node] + 1;
                    queue.add(destination);
                }
 
            }
        }
    }
}