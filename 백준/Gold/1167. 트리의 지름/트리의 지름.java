import java.util.*;

public class Main {
    static boolean[] visited; // 방문 배열
    static int[] distance; // 거리 저장 배열
    static ArrayList<Edge>[] a; // 가중치 있는 인접 리스트
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        // 초기화
        a = new ArrayList[n+1];
        for(int i = 1; i <= n; i++) {
            a[i] = new ArrayList<Edge>();
        }
        // 인접 리스트 저장
        for(int i = 0; i < n; i++) {
            int s = sc.nextInt();
            while(true) {
                int e = sc.nextInt();
                if(e == -1) {
                    break;
                }
                int v = sc.nextInt();
                a[s].add(new Edge(e, v));
            }
        }
        distance = new int[n+1];
        visited = new boolean[n+1];
        bfs(1);
        int max = 1;
        
        // distance 배열에서 가장 큰 값으로 다시 시작점으로 하기
        for(int i = 2; i <= n; i++) {
            if(distance[max] < distance[i])
                max = i;
        }
        
        distance = new int[n+1];
        visited = new boolean[n+1];
        bfs(max); // 새로운 시작점 실행
        Arrays.sort(distance);
        System.out.println(distance[n]);
    }
    
    private static void bfs(int start) {
        Queue<Integer> que = new LinkedList<Integer>();
        que.add(start);
        visited[start] = true;
        while(!que.isEmpty()) {
            int now = que.poll();
            for(Edge i : a[now]) {
                int e = i.e;
                int v = i.v;
                if(!visited[e]) {
                    visited[e] = true;
                    que.add(e);
                    distance[e] = distance[now] + v;
                }
            }
        }
    }
}

class Edge {
    int e;
    int v;
    public Edge(int e, int v) {
        this.e = e;
        this.v = v;
    }
}