package oop.inheritance;

public class CellPhone extends Phone {
  String browser;

  CellPhone(String model, String color, String browser) {
    this.model = model;
    this.color = color;
    this.browser = browser;
  }

  @Override
  void powerOn() {
    super.powerOn();
  }

  @Override
  void powerOff() {
    super.powerOff();
  }

  void internetSearch() {
    System.out.println(browser + "를 사용하여 인터넷 검색을 합니다.");
  }
}
