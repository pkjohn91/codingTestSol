class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) {
            String[] s = (array[i]+"").split("");
            for(int j = 0; j < s.length; j++) {
                if(s[j].equals("7")) answer++;
            }
        }
        return answer;
    }
}