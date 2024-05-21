import java.util.StringTokenizer;

class Solution {
    public int solution(String binomial) {
        StringTokenizer st = new StringTokenizer(binomial);
        int answer = 0;
        int a = 0;
        int b = 0;
        String op = "";
        
        while(st.hasMoreTokens()) {
            a = Integer.parseInt(st.nextToken());
            op = st.nextToken();
            b = Integer.parseInt(st.nextToken());
        }
        
        if(op.equals("+")) {
            answer = a + b;
        } else if(op.equals("-")) {
            answer = a - b;
        } else {
            answer = a * b;
        }
        return answer;
    }
}