class Solution {
    /*
     * indexOf("찾을문자", "시작할 index 위치")
     * 앞에서부터 찾기 때문에, 찾으려는 특정문자의 인덱스와 i가 같다면 중복되지 않음을 의미함.
     */
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.indexOf(my_string.charAt(i)) == i) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}