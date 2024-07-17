import java.util.*;
import java.io.*;

public class Main {
    static long n;
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      n = Long.parseLong(br.readLine());
      long p = n;
      br.close();
      
      // GCD(n, k)
      for(int i = 2; i <= Math.sqrt(n); i++) { // 현재 인덱스 k에 대한 소수조건
          if(n%i == 0) p = p / i*(i-1);
          while(n%i == 0) n = n/i;
      }
      if(n != 1) p = p / n*(n-1);
      
      System.out.print(p);
  }
}