import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }
        sc.close();
        Arrays.sort(arr);

        int cnt = 0;
        for (int k = 0; k < N; k++) {
            long target = arr[k];
            int i = 0;
            int j = N - 1;

            while (i < j) {
                if (arr[i] + arr[j] == target) {
                    // 두 수가 다른 원소 값인지 확인
                    if (i != k && j != k) {
                        cnt++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k){
                        j--;
                    }
                } else  if (arr[i] + arr[j] < target) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(cnt);
    }
}