package basic.operator;

public class ch01 {
  public static void main(String[] args) {
    int x = 10;
    int y = 10;

    // 이항연산자
    System.out.println(x + y); // 20
    System.out.println(x - y); // 0
    System.out.println(x * y); // 100
    System.out.println(x / y); // 1
    System.out.println(x % y); // 0 (나머지)

    // 단항연산자
    System.out.println(x++); // 11 (x = x + 1) 후위 연산자이기 때문에 출력 후 1 증가
    System.out.println(x); // 11

    System.out.println(++x); // 12 (x = x + 1) 전위 연산자이기 때문에 1 증가 후 출력

    System.out.println(x--); // 11 (x = x - 1) 후위 연산자이기 때문에 출력 후 1 감소
    System.out.println(x); // 11

    System.out.println(--x); // 10 (x = x - 1) 전위 연산자이기 때문에 1 감소 후 출력

    System.out.println(x > y); // false
    System.out.println(x < y); // false
    System.out.println(x >= y); // true
    System.out.println(x <= y); // true
    System.out.println(x == y); // true
    System.out.println(x != y); // false

    System.out.println(x > y && x < y); // false
    System.out.println(x > y || x < y); // true

    // 삼항연산자
    System.out.println(x > y ? "x가 y보다 큽니다." : "x가 y보다 작습니다."); // false라서 x가 y보다 작습니다.

    // 대부분 연산자는 왼쪽에서 오른쪽으로 진행되지만, 대입 연산자는 오른쪽에서 왼쪽으로 연산됨
    // 연산자에서 가로안에 있는 연산자가 먼저 연산됨

    Object z = new Integer(10); // Integer는 클래스이기 때문에 new 키워드를 사용해서 객체를 생성해야 함
    System.out.println(z instanceof Integer);
  }
}
