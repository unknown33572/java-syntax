package basic.variable;

import java.io.IOException;

public class ch06 {
  public static void main(String[] args) throws IOException { // 입출력 예외처리
    String str = "홍길동";
    int age = 30;

    System.out.printf("안녕하세요. 제 이름은 %s입니다. 나이는 %d살 입니다.\n", str, age); // 형식문자열포맷 %s는 문자열, %d는 정수

    int keyCode;

    keyCode = System.in.read(); // 키보드로부터 입력받은 키코드를 keyCode 변수에 저장

    while (true) { // 무한루프
      System.out.println("keyCode: " + keyCode); // 키보드로부터 입력받은 키코드를 출력
      if(keyCode == 97) { // a 키를 누르면 프로그램 종료
        break;
      }
    }

    System.out.println("종료");
  }
}
