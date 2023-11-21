package oop.abstractt.ch01;

public abstract class Animal {
  public String kind;

  public void breathe() {
    System.out.println(kind + "이(가) 숨을 쉽니다.");
  }

  public abstract void sound(); // 추상 메소드
}
