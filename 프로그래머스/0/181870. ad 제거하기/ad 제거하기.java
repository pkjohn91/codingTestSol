class Solution {
    public String[] solution(String[] strArr) {
        String[] answer;
        String ad = "ad";
        int idx = 0;
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains(ad)) idx++;
        }
        answer = new String[idx];
        idx = 0;
        for(int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if(!str.contains(ad)) answer[idx++] = strArr[i];
        }
        return answer;
    }
}