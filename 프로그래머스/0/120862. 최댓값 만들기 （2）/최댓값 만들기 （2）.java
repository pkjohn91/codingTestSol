import java.util.*;

class Solution {
    /*
     * 두 수를 곱해서 만들 수 있는 최댓값을 보자면..
     * 정렬 후
     * 1. 양수의 최댓값, 그 다음 최댓값
     * 2. 음수의 최솟값, 그 다음 최솟값
     */
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        int minus = numbers[0] * numbers[1];
        
        return answer > minus ? answer : minus;
    }
}