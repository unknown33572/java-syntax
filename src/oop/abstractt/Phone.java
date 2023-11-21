package oop.abstractt;

public class Phone {
  public String owner;
  public String brand;

  public Phone(String owner, String brand) {
    this.owner = owner;
    this.brand = brand;
  }

  public void turnOn() {
    System.out.println("폰 전원을 켭니다.");
  }

  public void turnOff() {
    System.out.println("폰 전원을 끕니다.");
  }
}
