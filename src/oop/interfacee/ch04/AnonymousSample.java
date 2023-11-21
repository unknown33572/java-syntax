package oop.interfacee.ch04;

public class AnonymousSample {
  public static void main(String[] args) {
    Anonymous anony = new Anonymous();

    anony.field.turnOn();

    anony.method1();

    anony.method2(new RemoteControl() { // Anonymous 클래스를 매개값으로 대입 turnOn(), turnOff() 메소드 호출
      @Override
      public void turnOn() {
        System.out.println("Smart TV를 켭니다.");
      }

      @Override
      public void turnOff() {
        System.out.println("Smart TV를 끕니다.");
      }
    });
  }
}
