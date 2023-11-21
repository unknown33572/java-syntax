package oop.abstractt.ch01;

import oop.abstractt.ch01.Animal;
import oop.abstractt.ch01.Cat;
import oop.abstractt.ch01.Dog;

public class Jungle {
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();

    dog.breathe();
    dog.sound();

    cat.breathe();
    cat.sound();

    animalSound(dog); // 자동 타입 변환이 되기때문에 가능 (자식 타입 -> 부모 타입)
    animalSound(cat); // 자식 타입에서 재정의된 메소드가 호출됨
  }

  public static void animalSound(Animal animal) {
    animal.sound(); // 재정의된 메소드 호출
  }
}
