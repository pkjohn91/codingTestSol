# 문제를 풀면서 배운 Java String 클래스 메서드들 #

바로가기
- [String.join()](#String.join())


---

### String.join()
- `지정된 구분자(delimiter)`를 사용하여 문자열 요소(배열, 리스트 등)들을 하나의 문자열로 간편하게 합쳐주는 `정적(static) 메소드`
- Java 8 이상에서 지원

***예시 코드***
```
import java.util.Arrays;
import java.util.List;

public class StringJoinExample {
    public static void main(String[] args) {
        // 1. 배열(Array) 사용 예시
        String[] fruits = {"Apple", "Banana", "Orange"};
        String joinedFruits = String.join(", ", fruits); // 구분자: ", "
        System.out.println(joinedFruits); // 출력: Apple, Banana, Orange

        // 2. 리스트(List) 사용 예시
        List<String> colors = Arrays.asList("Red", "Green", "Blue");
        String joinedColors = String.join(" | ", colors); // 구분자: " | "
        System.out.println(joinedColors); // 출력: Red | Green | Blue

        // 3. 기본 사용법 (가변 인자)
        String joinedWords = String.join("-", "Hello", "World", "Java"); // 구분자: "-"
        System.out.println(joinedWords); // 출력: Hello-World-Java
    }
}
```

***언제 사용할까?***
- 여러 문자열을 특정 기호(쉼표, 공백, 하이픈 등)로 연결하고 싶을 때.
- 배열이나 리스트의 모든 항목을 하나의 문자열로 만들고 싶을 때.
- `StringBuilder`를 직접 사용하기 번거롭거나 코드를 더 간결하게 만들고 싶을 때.
