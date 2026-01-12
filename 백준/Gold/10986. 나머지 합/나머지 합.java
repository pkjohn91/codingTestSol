import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        long[] S = new long[N];
        long[] C = new long[M]; // 특정 구간(i,j)으로 M나눴을 때 같은 값인 원소 카운트 배열

        // 합 배열 저장
        S[0] = sc.nextInt();
        for (int i = 1; i < N; i++) {
            S[i] = S[i-1] + sc.nextInt();
        }
        sc.close();
        
        // S에서 원소 값에 mod 연산 수행:
        // 0이 된다는 것은 원본 배열 0부터 i까지의 합을 M으로 나눈 나머지가 0이라는 뜻
        long result = 0;
        for (int i = 0; i < N; i++) {
            int remainder = (int) (S[i] % M);
            // 0~i 까지의 합 자체가 0이라면 결과 값에 카운팅
            if (remainder == 0) result++;
            // 나머지가 같은 인덱스의 개수 카운팅
            C[remainder]++;
        }
        
        // S[i]와 S[j]가 같은 값인 2개를 뽑는 경우의 수를 찾아서 카운트.
        for (int i = 0; i < M; i++) {
            // C[i](i가 나머지인 인덱스의 개수)에서 2가지를 뽑는 경우의 수를 더한다.
            // C[i] Combination 2 = C[i]! / 2!(C[i] - 2)!
            // -> c[i]*(c[i] - 1)*(c[i] -2)! / 2*1*(c[i] - 2)!
            // -> c[i]*(c[i] - 1) / 2 * 1
            // -> C[i] * (C[i] - 1) / 2;
            if (C[i] > 1) {
                result = result + (C[i] * (C[i] - 1) / 2);
            }
        }
        System.out.println(result);
    }
}