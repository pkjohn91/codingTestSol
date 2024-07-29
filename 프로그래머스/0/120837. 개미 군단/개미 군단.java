class Solution {
    public int solution(int hp) {
        int answer = 0;
        // 장군개미로 나누어 떨어지는 경우
        if(hp%5 == 0)
            answer = hp/5;
        else if(hp%5 != 0) { // 장군개미로 나누어 떨어지지 않을 때
            int tmp = hp % 5; // 병정개미
            if(tmp%3 == 0) { // 병정개미로 나누어 떨어진다면
                answer = (hp/5) + (tmp/3);
            } else { // 병정개미로 나누어 떨어지지 않는다면
                answer = (hp/5) + (tmp/3);
                tmp = tmp % 3;
                answer += tmp;
            }
        }
        
        return answer;
    }
}