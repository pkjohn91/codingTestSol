class Solution {
    public int solution(int n, String control) {
        char[] con = control.toCharArray();
        for (int i = 0; i < con.length; i++) {
            switch (String.valueOf(con[i])) {
                case "w" -> n += 1;
                case "s" -> n -= 1;
                case "d" -> n += 10;
                case "a" -> n -= 10;
            }
        }
        return n;
    }
}