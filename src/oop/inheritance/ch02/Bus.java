package oop.inheritance.ch02;

import oop.inheritance.ch03.Vehicle;

public class Bus extends Vehicle {
  @Override
  public void run() {
    System.out.println("버스가 달립니다.");
  }
}
