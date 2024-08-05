class Solution {
    /*
     * "Z" 나올경우 -> 음수는 빼주고 "Z"는 이전 숫자 빼기
     * 양수 or 음수 -> 더해줌
     */
    public int solution(String s) {
        String[] arr = s.split(" ");
        int answer = 0;
        int tmp = 0;
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].equals("Z")) { // 음수이거나 양수일 경우
                tmp = Integer.parseInt(arr[i]); // Z가 나왔을 때 빼주기 위함
                answer += Integer.parseInt(arr[i]);
            }
            else // "Z일 경우"
                answer -= tmp;
        }
        
        return answer;
    }
}