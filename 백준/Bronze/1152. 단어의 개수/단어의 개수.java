import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        int count = 0;
        int preInput = 32; 
        int input;
        // ASCII 코드 32 : 공백 (space)
        // ASCII 코드 10 : 개행 (new line)
        
        while (true) {
            /** System.in.read(): 키보드 입력을 바이트 단위로 읽어 들이는 기본 메서드
              * 주로 한 글자(문자)를 받을 때 사용, 입력된 문자의 ASCII 값을 정수(int)로 반환
              * IOException 필수, 개행(\n) 버퍼 조심
              * Scanner 또는 BufferedReader 보다 저수준(low-level)이므로 
              * Scanner, BufferedReader 사용하자!
              */
            input = System.in.read();
            
            // 입력 받은 문자가 공백이라면
            if (input == 32) {
                // 이전 문자가 공백이 아니라면
                if (preInput != 32) count++;
            }
            // 입력 받은 문자가 개행이라면
            if (input == 10) {
                // 이전 문자가 공백이 아니라면
                if (preInput != 32) count++;
                break;
            }
            preInput = input;
        }
        System.out.printf("%d", count);
    }
}