import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException {
    /**
     * N <= 50
     * M <= N
     */

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    LinkedList<Integer> deque = new LinkedList<>();
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    
    int count = 0; // 2번 또는 3번 연산의 횟수
    
    for (int i = 1; i <= N; i++) {
        deque.offer(i);
    }
    
    int[] seq = new int[M]; // 뽑고자 하는 수
    
    st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < M; i++) {
        seq[i] = Integer.parseInt(st.nextToken());
    
    }
    
    for (int i = 0; i < M; i++) {
        // 뽑고자 하는 숫자 인덱스 찾기
        int target_idx = deque.indexOf(seq[i]);
        int mid_idx;
        /**
         * 만약 현재 덱의 원소가 짝수 개라면 중간 지점을
         * 현재 덱의 절반 크기에서 -1 감소 시킴
         * 
         * {1, 2, 3, 4} 일 때, 2를 중간 지점으로 한다면
         * 인덱스는 1이 된다.
         */
        if (deque.size() % 2 == 0) {
            mid_idx = deque.size() / 2 - 1;
        } else {
            mid_idx = deque.size() / 2;
        }

        // M이 mid_idx보다 앞에 있을 경우
        if (target_idx <= mid_idx) {
            // 2번 연산 수행
            for (int j = 0; j < target_idx; j++) {
                deque.addLast(deque.removeFirst());
                count++;
            }
        } else { // mid_idx보다 뒤에 있을 경우
            // 3번 연산 수행
            for (int j = 0; j < deque.size() - target_idx; j++) {
                deque.addFirst(deque.removeLast());
                count++;
            }
        }
        deque.removeFirst();
    }

    System.out.println(count);
}
}