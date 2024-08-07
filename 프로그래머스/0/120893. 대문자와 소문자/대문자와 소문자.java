class Solution {
    /*
     * isUpperCase() : boolean 타입으로 반환
     * toUpperCase() : String, char 둘다 사용 가능
     * toLowerCase() : String, char 둘다 사용 가능
     */
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            if(Character.isUpperCase(my_string.charAt(i))) {
                answer += Character.toLowerCase(my_string.charAt(i));
            } else {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}