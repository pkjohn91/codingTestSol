class Solution {
    public int solution(String my_string, String is_prefix) {
        boolean answer = my_string.startsWith(is_prefix);
        return answer ? 1 : 0;
    }
}