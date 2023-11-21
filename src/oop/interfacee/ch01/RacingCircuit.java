package oop.interfacee.ch01;

public class RacingCircuit {
  public static void main(String[] args) {
    Driver driver = new Driver();

    driver.drive(new Taxi()); // Taxi 클래스에서 Vehicle 인터페이스를 구현했기 때문에 가능

    driver.drive(new Motorcycle()); // Motorcycle 클래스에서 Vehicle 인터페이스를 구현했기 때문에 가능

    Vehicle vehicle = new Taxi(); // Vehicle 인터페이스를 구현한 Taxi 클래스의 인스턴스를 Vehicle 타입의 변수에 대입

    vehicle.run(); // Vehicle 인터페이스에 선언된 메서드만 사용 가능
//    vehicle.checkFare(); // Vehicle 인터페이스에 선언되지 않은 메서드는 사용 불가능

    Taxi taxi = (Taxi) vehicle; // Vehicle 타입의 변수를 형변환 하여 Taxi 타입의 변수에 대입

    taxi.run(); // Vehicle 인터페이스에 선언된 메서드 사용 가능
    taxi.checkFare(); // Vehicle 인터페이스에 선언되지 않은 메서드 사용 가능
  }
}
