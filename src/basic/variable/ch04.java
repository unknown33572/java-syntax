package basic.variable;

public class ch04 {
  public static void main(String[] args) {
    byte byteValue = 65;
    int intValue = byteValue; // byte -> int 자동 형변환
    long longValue = intValue; // int -> long 자동 형변환
    float floatValue = longValue; // long -> float 자동 형변환
    double doubleValue = floatValue; // float -> double 자동 형변환

    System.out.println(byteValue);
    System.out.println(doubleValue);

    // char charValue = intValue; // int -> char 자동 형변환 안됨
    char charValue = (char) intValue; // int -> char 강제 형변환
    System.out.println(charValue); // 유니코드 65는 A

    byte byteValue2 = 65;
    int intValue2 = 65;
    long longValue2 = 65;

    long result = byteValue2 + intValue2 + longValue2;
    System.out.println(result); // 195 // 정수타입 자동타입연산

    int intValue3 = 10;
    float floatValue2 = 2.5F;
    double doubleValue3 = 3.14;
    double result2 = intValue3 + floatValue2 + doubleValue3;
    System.out.println(result2); // 15.64 // 정수타입 + 실수타입 = 실수타입 자동타입연산
  }
}
