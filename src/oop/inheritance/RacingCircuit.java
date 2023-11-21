package oop.inheritance;

public class RacingCircuit {
  public static void main(String[] args) {
//    Car car = new Car(); // Car 객체 생성
//
//    for(int i = 1; i <= 5; i++) { // 5번 반복
//      int problemLocation = car.run(); // run() 메소드 호출 총 5번 호출
//
//      switch(problemLocation) { // switch 문으로 문제가 발생한 타이어를 교체
//        case 1:
//          System.out.println("앞왼쪽 HankookTire로 교체");
//          car.frontLeftTire = new HankookTire("앞왼쪽", 15);
//          break;
//        case 2:
//          System.out.println("앞오른쪽 KumhoTire로 교체");
//          car.frontRightTire = new KumhoTire("앞오른쪽", 13);
//          break;
//        case 3:
//          System.out.println("뒤왼쪽 HankookTire로 교체");
//          car.backLeftTire = new HankookTire("뒤왼쪽", 14);
//          break;
//        case 4:
//          System.out.println("뒤오른쪽 KumhoTire로 교체");
//          car.backRightTire = new KumhoTire("뒤오른쪽", 17);
//          break;
//      }
//      System.out.println("----------------------------------------");
//      }

    Driver driver = new Driver();

    Bus bus = new Bus();
    Taxi taxi = new Taxi();

    driver.drive(bus); // Vehicle vehicle = bus; 로 자동 타입 변환
    driver.drive(taxi); // Vehicle vehicle = taxi; 로 자동 타입 변환
  }
}
