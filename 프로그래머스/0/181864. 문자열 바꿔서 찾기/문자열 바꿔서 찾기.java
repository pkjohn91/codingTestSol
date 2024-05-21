class Solution {
    public int solution(String myString, String pat) {
        String s = myString.replace('A','X').replace('B','A').replace('X','B');
        return s.contains(pat) ? 1 : 0;
    }
}