import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for(int i = 0; i < delete_list.length; i++) {
            list.remove(Integer.valueOf(delete_list[i]));
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}