import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 학생 수
        int m = sc.nextInt(); // 비교 수
        
        // 인접 리스트 초기화
        ArrayList<ArrayList<Integer>> a = new ArrayList<>(); // 인접 리스트
        for(int i = 0; i <= n; i++) {
            a.add(new ArrayList<>());
        }
        
        // 진입 차수 저장
        int[] indegree = new int[n+1]; // 진입 차수 배열
        for(int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            a.get(s).add(e); // 순환하지 않는(사이클이 없는) 그래프?
            indegree[e]++; // s->e로 가는 방향일 때, 진입 차수 1증가
        }
        // 위상 정렬
        Queue<Integer> que = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            if(indegree[i] == 0) {
                que.offer(i);
            }
        }
        while(!que.isEmpty()) {
            int now = que.poll();
            System.out.print(now + " ");
            for(int next : a.get(now)) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    que.offer(next);
                }
            }
        }
    }
}