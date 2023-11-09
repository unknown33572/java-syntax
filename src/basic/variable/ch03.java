package basic.variable;

public class ch03 {
  public static void main(String[] args) {
    //1bit = 0 or 1
    //1byte = 8bit
    byte byteValue = 10; // 1byte
    char charValue = 'A'; // 2byte 유니코드 65 대입해도 A 출력 16진수 0x0041 대입해도 A 출력 '' 작은 따옴표 사용
    short shortValue = 20; // 2byte
    int intValue = 30; // 4byte
    long longValue = 400000000000L; // 8byte L을 붙여야 long type으로 인식

    float floatValue = 3.14f; // 4byte f를 붙여야 float type으로 인식
    double doubleValue = 3.14; // 8byte
    boolean booleanValue = true; // true or false 1byte

    String name = "홍길동"; // String은 class type이므로 대문자로 시작 "" 큰 따옴표 사용

    System.out.println("안녕하세요?\t제 이름은 " + name + "입니다.\n후훗 " + "저는 의적입니다."); // escape \t 탭 \n 줄바꿈
  }
}
