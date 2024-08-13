class Solution {
    public int solution(int num, int k) {
        String[] s = String.valueOf(num).split("");
        int answer = 0;
        
        for (int i = 0; i < s.length; i++) {
            if(Integer.parseInt(s[i]) == k) {
                return i+1;
            }
        }
        return -1;
    }
}