class Solution {
    public int solution(int[] box, int n) {
        int answer = (box[0]/n)*(box[1]/n)*(box[2]/n);
        /*
         * 내가 문제를 이해한 것
         * n을 각 box[0], box[1], box[2]의 값들에
         * 각각 나눈 수를 곱하면 상자 안에 들어갈 수 있는
         * 주사위의 개수가 나온다.
         */
        return answer;
    }
}