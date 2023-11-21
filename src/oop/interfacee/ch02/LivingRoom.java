package oop.interfacee.ch02;

public class LivingRoom {
  public static void main(String[] args) {
    RemoteControl rc;
    rc = new Television();

    rc.turnOn();
    rc.setVolume(5);
    rc.turnOff();

    SmartTelevision stv = new SmartTelevision();

    stv.turnOn();
    stv.setVolume(5);
    stv.search("www.naver.com");
    stv.turnOff();

//    rc = new SmartTelevision();
//
//    rc.turnOn();
//    rc.setVolume(5);
//    ((SmartTelevision) rc).search("www.naver.com"); // SmartTelevision 클래스에만 있는 search 메소드를 사용하기 위해 형변환
//    rc.turnOff();
  }
}
