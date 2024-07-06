import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>(); // 다리를 건너는 트럭
        int sum = 0; // 현재 다리 무게
        int time = 0; // 경과 시간
        for(int i : truck_weights) {
            while(true) {
                // 다리 위에 트럭이 없는 경우
                if(bridge.isEmpty()) {
                    bridge.offer(i);
                    sum += i;
                    time++;
                    break;
                } else if (bridge.size() == bridge_length) { // 다리위 트럭 개수가 찼을 때
                    sum -= bridge.poll();
                } else {
                    // 트럭을 올릴 수 있는 경우
                    if((sum+i) <= weight) {
                        bridge.offer(i);
                        sum += i;
                        time++;
                        break;
                    } else { // 트럭을 올릴 수 없는 경우, 다리에 0을 채움
                        bridge.offer(0);
                        time++;
                    }
                }
            }
        }
        // + 마지막 트럭이 빠져나오는 시간
        return time += bridge_length;
    }
}