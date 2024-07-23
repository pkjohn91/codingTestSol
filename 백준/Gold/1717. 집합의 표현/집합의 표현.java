import java.util.Scanner;

public class Main {
    static int[] node;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt();

        node = new int[n+1];
        // 대표 노드 초기화
        for(int i = 0; i <= n; i++) {
            node[i] = i;
        }

        // 질의
        for(int i = 0; i < m; i++) {
            int question = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(question == 0) { // 합집합
                union(a, b);
            } else {
                if(checkSame(a, b)) { // 같은 집합의 원소인지 확인(find)
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }

    private static boolean checkSame(int a, int b) {
        a = find(a);
        b = find(b);
        if (a == b) return true;
        else return false;
    }

    private static int find(int a) {
        if(a == node[a])
            return a;
        else // 다르다면
            return node[a] = find(node[a]);
        
    }

    // 합집합: 대표 노드끼리 연결
    private static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if(a != b) { // node 대푯값이 다르다면
            node[b] = a;
        }
    }
}