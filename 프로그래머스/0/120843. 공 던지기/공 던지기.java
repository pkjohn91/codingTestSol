class Solution {
    public int solution(int[] numbers, int k) {
        // k를 0부터 시작이라 본다면(0번째 던진 사람은 최초의 공을 갖고 있는 사람)
        // k 번째 공을 던진 사람은 (k-1)*2+1이다.(나는 이부분 이해가 너무나 어려웠음.)
        // k 번째 인덱스는 (k-1)*2 번째
        // 인덱스 길이((k-1)*2)가 배열의 길이를 넘어선다면..
        // 인덱스 길이를 배열의 길이로 나눈 나머지 값으로 하면 된다.
        return numbers[((k-1)*2) % numbers.length];
    }
}