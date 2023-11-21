package oop.inheritance.ch02;

import oop.inheritance.ch03.Vehicle;

public class Taxi extends Vehicle {
  @Override
  public void run() {
    System.out.println("택시가 달립니다.");
  }
}
