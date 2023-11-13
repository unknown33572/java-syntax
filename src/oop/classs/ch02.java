package oop.classs;

public class ch02 {
  public static void main(String[] args) {

    Calculator cal = new Calculator();

    int[] values = {1, 2, 3};
    int result = cal.sum1(values);
    int result2 = cal.sum1(new int[] {1, 2, 3, 4, 5});
    System.out.println(result);
    System.out.println(result2);

    int result3 = cal.sum2(1, 2, 3);
    int result4 = cal.sum2(1, 2, 3, 4, 5);
    System.out.println(result3);
    System.out.println(result4);
  }
}

class Calculator {
  int sum1(int[] values) { // 배열을 매개변수로 받는 메서드
    int sum = 0;
    for(int i = 0; i < values.length; i++) {
      sum += values[i];
    }
    return sum;
  }

  int sum2(int... values) { // 가변인자를 매개변수로 받는 메서드
    int sum = 0;
    for(int i = 0; i < values.length; i++) {
      sum += values[i];
    }
    return sum;
  }
}
