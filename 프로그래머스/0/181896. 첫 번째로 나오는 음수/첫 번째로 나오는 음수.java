class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        boolean isValid = false;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                isValid = true;
                answer = i;
                break;
            }
        }
        return isValid ? answer : -1;
    }
}