package oop.inheritance.ch01;

public class Phone { // 원시적인 폰 별다른 기능이 없
  // 기본 생성자 없이 만들면 자동으로 기본 생성자가 만들어짐 그리하여 상속받는 자식클래스들은 기본생성자를 만들어줘야함
  String model;
  String color;

  void powerOn() {
    System.out.println("전원을 켭니다.");
  }

  void powerOff() {
    System.out.println("전원을 끕니다.");
  }
}
