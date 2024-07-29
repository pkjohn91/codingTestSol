class Solution {
    public String solution(int age) {
        String ans = "";
        String tmp = String.valueOf(age);
        String[] line = tmp.split("");
        for(String s : line) {
            if(s.equals("0")) {ans += "a";}
            if(s.equals("1")) {ans += "b";}
            if(s.equals("2")) {ans += "c";}
            if(s.equals("3")) {ans += "d";}
            if(s.equals("4")) {ans += "e";}
            if(s.equals("5")) {ans += "f";}
            if(s.equals("6")) {ans += "g";}
            if(s.equals("7")) {ans += "h";}
            if(s.equals("8")) {ans += "i";}
            if(s.equals("9")) {ans += "j";}
        }
        return ans;
    }
}