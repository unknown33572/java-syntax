package basic.reference;

public class ch01 {
  public static void main(String[] args) {
    String str = null;
    System.out.println(str);
    //System.out.println(str.length()); // NullPointerException 참조하는 객체가 없는 상태에서 메소드를 호출하면 발생하는 예외

    str = "hello";
    System.out.println(str);
    System.out.println(str.length());

    String str2 = "hello";
    String str3 = "hello";
    String str4 = new String("hello");

    System.out.println(str2 == str3); // true
    System.out.println(str2 == str4); // false
    System.out.println(str2.equals(str4)); // true / String 클래스의 equals() 메소드는 문자열의 내용을 비교하기 위한 메소드
  }
}
