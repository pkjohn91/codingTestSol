class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] arr = new int[31]; // 원소의 길이 counting 배열
        
        for(int i = 0; i < strArr.length; i++) {
            String s = strArr[i];
            int aLen = s.length();
            arr[aLen]++;
        }
        // max count 뽑기
        int maximum = 0;
        for(int cnt : arr) {
            if(cnt > maximum) {
                maximum = cnt;
            }
        }
        answer = maximum;
        return answer;
    }
}