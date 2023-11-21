package oop.inheritance.ch03;

public class KumhoTire extends Tire {
  public KumhoTire(String location, int maxRotation) {
    super(location, maxRotation);
  }
  @Override
  public boolean roll() { // 오버라이딩 : 부모클래스의 메소드를 재정의
    ++accumulatedRotation;
    if(accumulatedRotation < maxRotation) {
      System.out.println(location + " KumhoTire 수명: " + (maxRotation - accumulatedRotation) + "회");
      return true;
    } else {
      System.out.println("*** " + location + " KumhoTire 펑크 ***");
      return false;
    }
  }
}
