import java.util.*;

class Solution {
    /* 합배열 이용
     * 가장 가까운 수(최솟값) = |n - a[]|
     * Math.abs() : 절댓값 인자 출력 함수
     */
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        int[] a = new int[array.length]; // 합배열
        // 합배열 저장
        for(int i = 1; i < array.length; i++) {
            if(Math.abs(n - array[0]) > Math.abs(n - array[i]))
               array[0] = array[i];
        }
        answer = array[0];
        return answer;
    }
}