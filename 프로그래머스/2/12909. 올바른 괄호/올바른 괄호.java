import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(stk.isEmpty()) { // 비어 있는 경우
                if(ch == ')') {
                    return false;
                } else {
                    stk.push(ch);                    
                }
            } else { // 비어있지 않은 경우
                if(stk.peek() == '(') {
                    if(ch == ')') {
                        stk.pop();
                    }
                    else {
                        stk.push(ch);
                    }
                } else { // 피크값이 )인 경우
                    if(ch == ')') {
                        return false;
                    }
                    else {
                        stk.push(ch);
                    }
                }
            }
        }
        
        return stk.size() == 0 ? true : false;
    }
}