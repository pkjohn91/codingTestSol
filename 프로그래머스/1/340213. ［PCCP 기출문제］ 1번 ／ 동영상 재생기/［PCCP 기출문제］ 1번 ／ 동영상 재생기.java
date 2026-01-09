class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video_len_s = seconds(video_len);
        int pos_s = seconds(pos);
        int op_start_s = seconds(op_start);
        int op_end_s = seconds(op_end);
        
        // 현재 시간이 오프닝 구간에 있다면 -> 오프닝 끝 구간 이동
        if (pos_s >= op_start_s && pos_s <= op_end_s) {
            pos_s = op_end_s;
        }
        
        for (String c : commands) {
            /**
              * prev: 0보다 작으면 안된다.
              * next: op_end_s보다 크면 안된다.
              */
            switch (c) {
                case "prev" -> pos_s = Math.max(pos_s - 10, 0);
                case "next" -> pos_s = Math.min(pos_s + 10, video_len_s);
            }
            // 현재 시간이 오프닝 구간에 있다면 -> 오프닝 구간 끝 시간 이동
            if (pos_s >= op_start_s && pos_s <= op_end_s) {
                pos_s = op_end_s;
            }
        }
        
        // mm:ss 변환
        String min = String.format("%02d", (int) Math.floor((double) pos_s / 60));
        String sec = String.format("%02d", pos_s % 60);
        return min + ":" + sec;
    }
    
    public static int seconds(String second) {
        String[] time = second.split(":");
        return (Integer.parseInt(time[0]) * 60) + Integer.parseInt(time[1]);
    }
}