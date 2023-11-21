package oop.exception;

public class ch02 {
  public static void main(String[] args) {
    try {
      findClass();
    } catch(ClassNotFoundException e) {
      System.out.println("클래스가 존재하지 않습니다.");
    }
  }

  public static void findClass() throws ClassNotFoundException { // throws로 예외를 호출하는 메서드에 던짐
    Class clazz = Class.forName("java.lang.String2");
  }
}
