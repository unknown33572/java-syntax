package oop.classs;

public class ch04 {

  public static void main(String[] args) {
    Car car1 = new Car("소나타");
    car1.setSpeed(100);
    System.out.println(car1.model + "의 최고속도는 " + car1.getSpeed() + "km 입니다.");
  }
}

class Car {
  String model;
  String brand;
  String color;
  int speed;

  Car(String model) {
    this.model = model; // this는 자기 자신을 가리키는 참조변수
  }

  void setSpeed(int speed) {
    this.speed = speed;
  }

  int getSpeed() {
    return this.speed; // this 생략 가능 여기서는 명시적으로 적어줌
  }
}
