class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i = 0; i < order.length; i++) {
            String tmp = order[i];
            if(tmp.contains("americano") || tmp.contains("anything")) {
                answer += 4500;
            } else {
                answer += 5000;
            }
        }
        return answer;
    }
}