package basic.variable;

public class ch01 {
  public static void main(String[] args) {
    int value; // 초기화 하지 않으면 컴파일 에러 발생

    value = 10;

    System.out.println(value);

    value = 20;

    System.out.println(value);

    int plus = value + 10;

    System.out.println(plus); // 30

    int minus = value - 10;

    System.out.println(minus); // 10

    System.out.println(plus + "는(은) " + value + "에 10을 더함.");
    System.out.println(minus + "는(은) " + value + "에 10을 뺌.");
  }
}
