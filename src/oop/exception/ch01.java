package oop.exception;

public class ch01 {
  public static void main(String[] args) {
    String data1 = null;
    String data2 = null;
    try {
      data1 = args[0];
      data2 = args[1];
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("실행 매개값의 수가 부족합니다.");
      return;
    }
    // args에 문자를 넣으면 NumberFormatException 발생
    try {
      int value1 = Integer.parseInt(data1);
      int value2 = Integer.parseInt(data2);
      int result = value1 + value2;
      System.out.println(data1 + "+" + data2 + "=" + result);
    } catch(NumberFormatException e) {
      System.out.println("숫자로 변환할 수 없습니다.");
    } finally { // 예외 발생 여부와 상관없이 무조건 실행
      System.out.println("다시 실행하세요.");
    }
  }
}
