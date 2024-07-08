class Solution {
    public int solution(int[] array) {
        int answer = array[0]; // 최빈값
        int max = -1; // 카운팅 max값
        int[] cntArr = new int[1000];
        
        for(int i = 0; i < array.length; i++) {
            cntArr[array[i]]++;
            if(max < cntArr[array[i]]) {
                max = cntArr[array[i]];
                answer = array[i];
            }
        }
        
        int chk = 0;
        for(int i = 0; i < 1000; i++) {
            if(max == cntArr[i]) chk++;
            if(chk > 1) answer = -1;
        }
        return answer;
    }
}