import java.util.Arrays;

class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        // 만약 idx의 배열 값이 1이라면 idx 값을 반환
        // 아니면 돌리면서 1인 값을 찾아 인덱스 값 반환
        // 없다면 -1 반환
        for(int i = idx; i < arr.length; i++) {
            if(arr[i] == 1) {answer = i; break;
            }
            else {
                answer = -1;
            }
        }
        
        return answer;
    }
}