class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] s = quiz[i].split(" ");
            if(s[1].equals("+")) {
                int tmp = Integer.parseInt(s[0]) + Integer.parseInt(s[2]);
                if(Integer.parseInt(s[4]) == tmp) {
                    answer[i] = "O";
                }
                else {
                    answer[i] = "X";
                }
            } else {
                int tmp = Integer.parseInt(s[0]) - Integer.parseInt(s[2]);
                if(Integer.parseInt(s[4]) == tmp) {
                    answer[i] = "O";
                }
                else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}