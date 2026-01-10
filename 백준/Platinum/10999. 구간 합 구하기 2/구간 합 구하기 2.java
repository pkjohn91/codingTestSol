import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long[] arr, tree, lazy;
    public static void main(String[] args) throws IOException{
        /**
         * 구간 합, 세그먼트 트리, Lazy Propagation(느린 갱신 기법)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        arr = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        // 1. tree, lazy 사이즈 생성
        tree = new long[N * 4];
        lazy = new long[N * 4];
        
        // 2. 트리 초기화
        init(1, 1, N);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M + K; i++) {
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            if (cmd == 1) { // 업데이트: b번부터 c번까지 d만큼 더하기
                long d = Long.parseLong(st.nextToken());
                updateRange(1, 1, N, b, c, d);
            } else { // 조회: b번부터 c번까지의 합
                if (b <= c) {
                    sb.append(query(1, 1, N, b, c)).append("\n");
                } else {
                    sb.append(query(1,1,N,c,b)).append("\n");
                }
            }
        }
        System.out.println(sb);
    }

    // 3. 트리 초기 세팅
    static void init(int node, int start, int end) {
        if (start == end) {
            tree[node] = arr[start];
            return;
        }

        int mid = (start + end) / 2;

        // 왼쪽 자식과 오른쪽 자식을 나누고 재귀 호출
        init(node * 2, start, mid); // 왼쪽 자식
        init(node * 2 + 1, mid + 1, end); // 오른쪽 자식
        // 자식들의 합을 부모 노드에 저장
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    // 4. 느린 갱신
    static void propagate(int node, int start, int end) {
        if (lazy[node] != 0) { // 만약 이 노드에 미뤄둔 값(lazy)이 있다면
            // 1. 현재 노드 없데이트: 더할 값 * 구간에 포함된 수의 개수
            /**
             * (end - start + 1)인 이유: 현재 node는 start부터 end까지의 합을 갖고 있다.
             * 따라서 이 구간의 모든 숫자에 lazy[node]만큼 더해준다면
             * 전체 합은 (end - start + 1) * lazy[node]가 된다.
             */
            tree[node] += (long) (end - start + 1) * lazy[node];
            
            // 2. 리프 노드가 아니라면 자식들에게 "나중에 더해라"라고 알려줌
            if (start != end) {
                lazy[node * 2] += lazy[node];
                lazy[node * 2 + 1] += lazy[node];
            }

            // 3. 현재 노드의 lazy는 처리했으니 0으로 초기화
            lazy[node] = 0;
        }
    }

    // 5. 구간 업데이트
    static void updateRange(int node, int start, int end, int left, int right, long diff) {
        // 1. 혹시 미뤄둔 작업이 있다면 처리
        propagate(node, start, end);

        // 2. 범위를 벗어난 경우 무시
        if (left > end || right < start) return;

        // 3. 구간에 완전히 포함되는 경우 (logN, 핵심)
        if (left <= start && end <= right) {
            // 더 밑으로 내려가지 않고, 여기에 "나중에 더해"라고 알려줌
            lazy[node] += diff;
            // 현재 노드 까지만 즉시 반영
            propagate(node, start, end);
            return;
        }

        // 4. 걸쳐 있는 경우: 반으로 나누어서 자식들로 내려감
        int mid = (start + end) / 2;
        updateRange(node * 2, start, mid, left, right, diff);
        updateRange(node * 2 + 1, mid + 1, end, left, right, diff);
        // 자식들의 업데이트된 값을 토대로 현재 노드 합 업데이트
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    // 6. 구간 합 조회
    static long query(int node, int start, int end, int left, int right) {
        // 1. 미뤄둔 작업이 있다면 처리
        propagate(node, start, end);

        // 2. 범위를 벗어난 경우 무시
        if (left > end || right < start) return 0;

        // 3. 구간에 포함된 경우: 합을 즉시 반환
        if (left <= start && end <= right) return tree[node];

        // 4. 걸쳐져 있는 경우: 자식들에게 물어본 값을 더해서 반환
        int mid = (start + end) / 2;
        return query(node * 2, start, mid, left, right) + query(node * 2 + 1, mid + 1, end, left, right);
    }
}