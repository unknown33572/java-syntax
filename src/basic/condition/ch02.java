package basic.condition;

import java.util.Scanner;

public class ch02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Scanner 객체 생성 / 입력 클래스

    System.out.println("보기\n1.부장\n2.과장\n3.대리\n4.사원");
    System.out.print("직급을 입력하세요: ");

    String rank = scanner.next();

    switch(rank) { // rank에 저장된 값에 따라서 case문 실행
      case "1":
        System.out.println("700만원");
        break;
      case "2":
        System.out.println("500만원");
        break;
      case "3":
        System.out.println("400만원");
        break;
      case "4":
        System.out.println("300만원");
        break;
    }
  }
}
