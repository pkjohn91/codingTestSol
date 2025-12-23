class Solution {
    public int solution(int[] num_list) {
        int multiply = 1; // 모든 원소들의 곱
        int sumSquare = 0; // 모든 원소들의 합의 제곱
        for (int i = 0; i < num_list.length; i++) {
            multiply *= num_list[i];
            sumSquare += num_list[i];
        }
        sumSquare = (int) Math.pow(sumSquare, 2);
        
        return (multiply < sumSquare) ? 1 : 0;
    }
}