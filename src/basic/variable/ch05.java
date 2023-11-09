package basic.variable;

public class ch05 {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    int z = x + y;

    String str = "10";
    System.out.println(str + z); // 1030 문자열 결합

    int result = Integer.parseInt(str) + z; // 문자열을 정수로 변환
    System.out.println(result); // 40

    /*
      Integer.parseInt()는 문자열을 정수로 변환
      Double.parseDouble()는 문자열을 실수로 변환
      Boolean.parseBoolean()는 문자열을 boolean으로 변환 등등 더 있음
    */

    // String str2 = 65; // 컴파일 에러 발생
    String str2 = 65 + ""; // 문자열로 변환

    char result2 = (char) Integer.parseInt(str2); // 문자열을 정수로 변환
    System.out.println(result2); // A

    String str3 = "true"; //true or false
    boolean result3 = Boolean.parseBoolean(str3); // 문자열을 boolean으로 변환
    System.out.println(result3); // true
  }
}
