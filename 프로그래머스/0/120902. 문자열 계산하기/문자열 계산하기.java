class Solution {
    public int solution(String my_string) {
        String[] s = my_string.split(" ");
        int answer = Integer.parseInt(s[0]);
        int idx = 2;
        for (int i = 1; i < s.length-1; i+=2) {
            if(s[i].equals("+")) {
                answer += Integer.parseInt(s[idx]);
                idx += 2;
                System.out.println("answer = " + answer);
                System.out.println("Integer index = " + idx);
                System.out.println("=================");
            } else {
                answer -= Integer.parseInt(s[idx]);
                idx += 2;
                System.out.println("answer = " + answer);
                System.out.println("Integer index = " + idx);
                System.out.println("=================");
            }
        }
        
        
        return answer;
    }
}