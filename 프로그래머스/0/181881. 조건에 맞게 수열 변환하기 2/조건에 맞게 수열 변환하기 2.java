import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int cnt = 0;
        int[] arr2 = new int[arr.length]; //체크값
        while(cnt != arr.length) {
            cnt = 0;
            arr2 = Arrays.copyOf(arr, arr.length);
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                   arr[i] /= 2;
               } else if(arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
                if(arr[i] == arr2[i]) {
                    cnt++;                    
                }
            }
            answer++;
        }
        answer -=1;
        return answer;
    }
}