class Solution {
    public String solution(String letter) {
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."
        };
        String[] morseLetter = letter.split(" ");
        String answer = "";
        for(String s : morseLetter) {
            for(int i = 0; i < morse.length; i++) {
                if(s.equals(morse[i])) answer += Character.toString(i + 97);
            }
        }
        return answer;
    }
}