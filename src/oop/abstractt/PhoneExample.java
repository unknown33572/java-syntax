package oop.abstractt;

public class PhoneExample {
  public static void main(String[] args) {
    SmartPhone smartPhone = new SmartPhone("홍길동", "삼성");

    smartPhone.turnOn();
    smartPhone.internetSearch();
    smartPhone.turnOff();
  }
}
