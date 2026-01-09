class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] replaceCh = myString.toCharArray();
        
        // 치환
        for (int i = 0; i < replaceCh.length; i++) {
            if (replaceCh[i] == 'A') {
                replaceCh[i] = 'B';
            } else {
                replaceCh[i] = 'A';
            }
        }
        
        String str = new String(replaceCh);
        
        return str.contains(pat) ? 1 : 0;
    }
}