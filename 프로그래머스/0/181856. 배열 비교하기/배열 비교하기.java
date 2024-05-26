class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1len = arr1.length;
        int arr2len = arr2.length;
        if(arr1len > arr2len) { // 길이에 대한 비교
            return 1;
        }
        else if(arr1len == arr2len) {
            int sum1 = 0;
            int sum2 = 0;
            for(int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            if(sum1 > sum2) {
                answer = 1;
            } else if(sum1 < sum2) {
                answer = -1;
            }
        } else {
            answer = -1;
        }
        return answer;
    }
}