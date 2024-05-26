class Solution {
    public int[] solution(int[] num_list) {
        for(int i = 0; i < num_list.length; i++) {
            for(int j = i+1; j < num_list.length; j++) {
                if(num_list[i] > num_list[j]) {
                    int tmp = num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = tmp;
                }
            }
        }
        int len = num_list.length - 5;
        int[] answer = new int[len];
        for(int i = 5; i < num_list.length; i++) {
            answer[i-5] = num_list[i];
        }
        
        return answer;
    }
}