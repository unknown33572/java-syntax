package oop.inheritance.ch01;

public class PhoneSample {
  public static void main(String[] args) {
    CellPhone cellPhone = new CellPhone("iPhone 12 Mini", "Silver", "Safari"); // 호출할 때 부모클래스의 기본생성자가 먼저 호출되고 자식클래스의 생성자가 호출됨
    cellPhone.powerOn();
    cellPhone.internetSearch();
    cellPhone.powerOff();
  }
}
