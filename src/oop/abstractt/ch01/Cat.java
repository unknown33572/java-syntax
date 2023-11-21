package oop.abstractt.ch01;

public class Cat extends Animal {
  public Cat() {
    this.kind = "고양이";
  }

  @Override
  public void sound() { // 추상 메소드 구현
    System.out.println("야옹");
  }
}
