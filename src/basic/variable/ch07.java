package basic.variable;

import java.util.Scanner;

public class ch07 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Scanner 객체 생성 / 입력 클래스
    System.out.print("문자열을 입력하세요: ");
    String inputData = scanner.nextLine(); // 입력받은 문자열을 inputData 변수에 저장
    System.out.println("입력하신 문자열은: " + inputData); // 입력받은 문자열 출력
  }
}
