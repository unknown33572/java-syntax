package oop.interfacee;

public class Taxi implements Vehicle {
  @Override
  public void run() {
    System.out.println("택시가 달립니다.");
  }

  public void checkFare() {
    System.out.println("택시 요금을 확인합니다.");
  }
}
