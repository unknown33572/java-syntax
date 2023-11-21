package oop.abstractt;

public class Dog extends Animal {
  public Dog() {
    this.kind = "개";
  }

  @Override
  public void sound() { // 추상 메소드 구현
    System.out.println("멍멍");
  }
}
