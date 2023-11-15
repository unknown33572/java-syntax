package oop.classs;

public class ch06 {
  final int TALL = 173; // final은 상수를 의미함. 상수는 대문자로 쓰는게 관례
  final int WEIGHT = 63;
  String name;

  public static void main(String[] args) {
    ch06 me = new ch06();
    me.name = "김민수";
    System.out.println(me.name + "의 키는 " + me.TALL + "cm 이고 몸무게는 " + me.WEIGHT + "kg 입니다.");
//    me.TALL = 175; // error final은 상수이므로 값을 변경할 수 없음
  }
}
